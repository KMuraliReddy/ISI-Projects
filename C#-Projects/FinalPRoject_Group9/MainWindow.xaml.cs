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

            if (libraryContents.SelectedCells.Count() > 0 && libraryMembers.SelectedCells.Count() > 0)
            {
                Media media = (Media)libraryContents.SelectedItem;
                if (((Media)libraryContents.SelectedItem).isAvailable == true)
                {
                    ((Media)libraryContents.SelectedItem).isAvailable = false;
                    LibraryMember libraryMemeber = (LibraryMember)libraryMembers.SelectedItem;
                    ((Media)libraryContents.SelectedItem).libraryMember = libraryMemeber.name;
                    MessageBox.Show(libraryMemeber.name + " has lent the " + media.mediaType + " : " + media.title);
                    UpdateGrid();
                }
                else
                {
                    DisplayInfo("The Media Is Not Available");
                }
            }
            else
            {
                DisplayInfo("Select Name and Media to lent");
            }
        }
        private void returnMedia_Click(object sender, RoutedEventArgs e)
        {
            Media media = (Media)libraryContents.SelectedItem;
            LibraryMember libraryMemeber = (LibraryMember)libraryMembers.SelectedItem;
            if (libraryContents.SelectedCells.Count() > 0 && libraryMembers.SelectedCells.Count() > 0)
            {
                if (((Media)libraryContents.SelectedItem).isAvailable == false && media.libraryMember == libraryMemeber.name)
                {
                    ((Media)libraryContents.SelectedItem).isAvailable = true;
                    ((Media)libraryContents.SelectedItem).libraryMember = "";
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
        private void DisplayInfo(string message)
        {
            MessageBox.Show(message);
        }
        private void UpdateGrid()
        {
            libraryContents.UnselectAllCells();
            libraryMembers.UnselectAllCells();
            libraryContents.ItemsSource = null;
            libraryContents.ItemsSource = Library.media;

        }
    }
}

