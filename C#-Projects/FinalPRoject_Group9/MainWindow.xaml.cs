using System;
using System.Collections.Generic;
using System.Data;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace FinalPRoject_Group9
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
            libraryMembers.ItemsSource = Library.libraryMembers;

            libraryContents.ItemsSource = Library.media;
        }
        private void LentMedia_Click(object sender, RoutedEventArgs e)
        {


            if (libraryContents.SelectedItem != null && libraryMembers.SelectedItem != null)
            {
                LibraryMember libraryMemeber = (LibraryMember)libraryMembers.SelectedItem;
                Media media = (Media)libraryContents.SelectedItem;
                if (((Media)libraryContents.SelectedItem).isAvailable == true)
                {
                    LibraryMember.borrowHistory.Add(media);
                    LibraryMember.currentlyBorrowd.Add(media);
                    Library.media.Remove(((Media)libraryContents.SelectedItem));
                    Library.media.Add(((Media)libraryContents.SelectedItem));
                    ((Media)libraryContents.SelectedItem).isAvailable = false;
                    ((Media)libraryContents.SelectedItem).libraryMember = libraryMemeber.name;
                    MessageBox.Show(libraryMemeber.name + " has lend the " + media.mediaType + " : " + media.title);
                    UpdateGrid();

                }
                else
                {
                    DisplayInfo("The Media Is Not Available");
                }
            }
            else
            {
                DisplayInfo("Select Name and Media to lend");
            }
        }
        private void returnMedia_Click(object sender, RoutedEventArgs e)
        {

            Media media = (Media)libraryContents.SelectedItem;
            LibraryMember libraryMemeber = (LibraryMember)libraryMembers.SelectedItem;
            LibraryMember.currentlyBorrowd.Remove(media);
            if (libraryContents.SelectedItem != null && libraryMembers.SelectedItem != null)
            {
                if (((Media)libraryContents.SelectedItem).isAvailable == false && media.libraryMember == libraryMemeber.name)
                {
                    Library.media.Remove(((Media)libraryContents.SelectedItem));
                    ((Media)libraryContents.SelectedItem).isAvailable = true;
                    ((Media)libraryContents.SelectedItem).libraryMember = "";
                    Library.media.Remove(((Media)libraryContents.SelectedItem));
                    Library.media.Insert(0, (((Media)libraryContents.SelectedItem)));
                    UpdateGrid();
                }
                else
                {
                    DisplayInfo("The Media Is Avilable In The Library, You Can't Return This Media / The Mebmer You Choose Didnt Lent This Media ");
                }
            }
            else
            {
                DisplayInfo("Select Name of the library memebr and Media to return");
            }

        }

        private void UpdateGrid()
        {
            libraryContents.UnselectAllCells();
            libraryMembers.UnselectAllCells();
            libraryContents.ItemsSource = null;
            libraryContents.ItemsSource = Library.media;

        }

        private void memberInfo_Click(object sender, RoutedEventArgs e)
        {
            string name = "";

            string title = "";
            string type = "";

            foreach (Media m in LibraryMember.borrowHistory)
            {
                name = m.libraryMember;
                title = m.title;
                type = m.mediaType;
                DisplayInfo("Member History" + Environment.NewLine + "Name :" + name + Environment.NewLine + " Title : " + title + Environment.NewLine + "Type : " + type + Environment.NewLine);
            }

            foreach (Media m in LibraryMember.currentlyBorrowd)
            {
                name = m.libraryMember;
                title = m.title;
                type = m.mediaType;
                DisplayInfo("Currently Borrowing" + Environment.NewLine + "Name :" + name + Environment.NewLine + " Title : " + title + Environment.NewLine + "Type : " + type + Environment.NewLine);
            }
        }

        private void mediaInfo_Click(object sender, RoutedEventArgs e)
        {
            if (libraryContents.SelectedCells.Count() > 0)
            {
                Media media = (Media)libraryContents.SelectedItem;


                foreach (Media m in LibraryMember.currentlyBorrowd)
                {


                }
            }
            else
            {
                DisplayInfo("Please Select A Media");
            }

        }
        private void DisplayInfo(string message)
        {
            MessageBox.Show(message);
        }

    }
}

