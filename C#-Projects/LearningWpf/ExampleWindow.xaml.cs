﻿using System;
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
using System.Windows.Shapes;

namespace LearningWpf
{
    /// <summary>
    /// Interaction logic for ExampleWindow.xaml
    /// </summary>
    public partial class ExampleWindow : Window
    {
        public ExampleWindow()
        {
            InitializeComponent();
        }

        private void Return_Click(object sender, RoutedEventArgs e)
        {
            Application.Current.MainWindow.Show();
            Close();
            
        }
    }
}
