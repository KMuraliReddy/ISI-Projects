using System;
using System.Collections.Generic;
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

namespace PhoneBookApp
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {

     static   List<PhoneBookListing> searchPhoneBookListings = new List<PhoneBookListing>();
        public MainWindow()
        {
            InitializeComponent();
            DataBind();

        }
        public void DataBind()
        {
            PhonebookListing.ItemsSource = PhoneBook.Listings;
        }

        private void AddNewListing_Click(object sender, RoutedEventArgs e)
        {
            if (FirstNameValue != null && LastNameValue != null && PhoneValue != null)
            {
                PhoneBook.Listings.Add(new PhoneBookListing(LastNameValue.Text,FirstNameValue.Text, PhoneValue.Text));
                RefresDataGrid();
            }
        }
        public void RefresDataGrid()
        {
            PhonebookListing.ItemsSource = null;
            PhonebookListing.ItemsSource = PhoneBook.Listings;
        }

        private void RemoveListing_Click(object sender, RoutedEventArgs e)
        {
           PhoneBook.Listings.Remove(((PhoneBookListing)PhonebookListing.SelectedItem));
          //  searchPhoneBookListings.Remove()
            RefresDataGrid();
        }

        private void SearchListing_Click(object sender, RoutedEventArgs e)
        {
            if (LastNameValueSearch != null)
            {
                foreach(PhoneBookListing bookListing in PhoneBook.Listings)
                {
                    if (LastNameValueSearch.Text == bookListing.LastName)
                    {
                        searchPhoneBookListings.Add(bookListing);
                        RefreshSearchList();

                    }
                    

                }
            }
        }
        public void RefreshSearchList()
        {
            SearchList.ItemsSource = null;
            SearchList.ItemsSource = searchPhoneBookListings;
        }
       
    }
}
