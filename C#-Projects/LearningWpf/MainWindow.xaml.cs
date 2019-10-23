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

namespace LearningWpf
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public string FirstNameTextBox { get; private set; }
        public string LastNameTextBox { get; private set; }
        public MainWindow()
        {
            InitializeComponent();
            BindData();
        }
        void BindData()
        {
            testDataGrid.ItemsSource = PeopleManager.people;
        }
        private void MyTextButton_Click(object sender, RoutedEventArgs e)
        {
           // MessageBox.Show(sender.ToString(),ToString(),"Test",MessageBoxButton.OKCancel);
            (sender as Button).Content = "Murali";
        }
        private void Remove_Click(object sender, RoutedEventArgs e)
        {
            PeopleManager.people.Remove((Person)(testDataGrid.SelectedItem));
            UpdateDataGrid();

        }
        private void Add_Click(object sender, RoutedEventArgs e)
        {
           
            if (FName.Text == "" && LName.Text == "")
            {
                MessageBox.Show("Please Enter FirstName and Last Name","Empty Fields");
            }
            else
            {
                PeopleManager.people.Add(new Person(FName.Text, LName.Text));
                UpdateDataGrid();
                FName.Text = "";
                LName.Text = "";
            }
        }
        private void UpdateDataGrid()
        {
            testDataGrid.ItemsSource = null;
            testDataGrid.ItemsSource = PeopleManager.people;
        }

      

       
    }
}
