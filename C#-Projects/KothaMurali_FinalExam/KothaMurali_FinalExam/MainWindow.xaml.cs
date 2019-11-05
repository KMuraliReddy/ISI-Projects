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

namespace KothaMurali_FinalExam
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
        }

        private void Add_Click(object sender, RoutedEventArgs e)
        {
          float left= ConvertTextBoxesToFloat(LeftOprValue.Text);
          float right= ConvertTextBoxesToFloat(RightOprValue.Text);
            float result = left + right;
            Result_Val.Text = result.ToString();

        }
       

        private void Sub_Click(object sender, RoutedEventArgs e)
        {
            float left = ConvertTextBoxesToFloat(LeftOprValue.Text);
            float right = ConvertTextBoxesToFloat(RightOprValue.Text);
            float result = left - right;
            Result_Val.Text = result.ToString();
        }

        private void Mul_Click(object sender, RoutedEventArgs e)
        {
            float left = ConvertTextBoxesToFloat(LeftOprValue.Text);
            float right = ConvertTextBoxesToFloat(RightOprValue.Text);
            float result = left * right;
            Result_Val.Text = result.ToString();
        }

        private void Div_Click(object sender, RoutedEventArgs e)
        {
            float left = ConvertTextBoxesToFloat(LeftOprValue.Text);
            float right = ConvertTextBoxesToFloat(RightOprValue.Text);
            float result = left / right;
            Result_Val.Text = result.ToString();
        }
       

        private void Square_Click(object sender, RoutedEventArgs e)
        {
            float left = ConvertTextBoxesToFloat(LeftOprValue.Text);
            int right = (int)ConvertTextBoxesToFloat(RightOprValue.Text);
            float result = 1;
            for(int i = 0; i < right; i++)
            {
                result = result * left;
            }

            Result_Val.Text = result.ToString();

        }
        private float ConvertTextBoxesToFloat(string textValue)
        {
            float val = 0;
            if (float.TryParse(textValue, out val))
                return val;
            else
                MessageBox.Show("Enter Valid number");
            return val;
        }

        
    }
}
