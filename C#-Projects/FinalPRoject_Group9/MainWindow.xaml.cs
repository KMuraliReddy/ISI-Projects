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
                libraryContents.ItemsSource = Library.members;
        }

        private void LentMedia_Click(object sender, RoutedEventArgs e)
        {
            MessageBox.Show(libraryContents.SelectedCells.Count().ToString());
            if ( libraryContents.SelectedCells.Count() > 0 && libraryMembers.SelectedCells.Count() > 0)
            {
              

            }
            foreach (DataRowView rowView in libraryContents.SelectedItems)
            {
                if (rowView != null)
                {
                    DataRow row = rowView.Row;
                    MessageBox.Show( row.ItemArray[3].ToString());
                   // MessageBox.Show(emailAdd.ToString());
                }

            }

        }
    }
}

