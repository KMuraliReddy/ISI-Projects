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

namespace StoreApp
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
            ForSale.ItemsSource = Store.forSale;
            ShoppingCart.ItemsSource = Store.shoppingCart;
        }

        private void PlaceInCart_Click(object sender, RoutedEventArgs e)
        {
            Merchandise merchandise= (Merchandise)ForSale.SelectedItem;
            if (ForSale.SelectedItem != null)
            {
                Store.shoppingCart.Add(merchandise);
                Store.forSale.Remove(merchandise);
                Store.totalPrice = Store.totalPrice + merchandise.Price;
                UpdateDataGrids();
            }
        }
        public void UpdateDataGrids()
        {
            ForSale.ItemsSource = null;
            ShoppingCart.ItemsSource = null;
            ForSale.ItemsSource = Store.forSale;
            ShoppingCart.ItemsSource = Store.shoppingCart;
            TotalVal.Text = Store.totalPrice.ToString();
        }

        private void ReturnToShelf_Click(object sender, RoutedEventArgs e)
        {
            Merchandise merchandise = (Merchandise)ShoppingCart.SelectedItem;
            if (ShoppingCart.SelectedItem != null)
            {
                Store.shoppingCart.Remove(merchandise);
                Store.forSale.Add(merchandise);
                Store.totalPrice = Store.totalPrice - merchandise.Price;
                UpdateDataGrids();
            }
        }

        private void Purchase_Click(object sender, RoutedEventArgs e)
        {
            Store.shoppingCart.Clear();
            Store.totalPrice = 0;
            UpdateDataGrids();
        }

        private void ViewItemInfo_Click(object sender, RoutedEventArgs e)
        {
            Merchandise merchandise = (Merchandise)ForSale.SelectedItem;
            if (ForSale.SelectedItem != null)
            {
                MessageBox.Show(merchandise.ReturnItemInfo());
              
            }
        }
    }
}
