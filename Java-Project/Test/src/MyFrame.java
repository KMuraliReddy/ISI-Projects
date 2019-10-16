import java.awt.BorderLayout;

import java.beans.PropertyChangeEvent;

import java.beans.PropertyChangeListener;

import java.util.List;

 

import javax.swing.JFrame;

import javax.swing.JProgressBar;

import javax.swing.JTable;

import javax.swing.SwingUtilities;

import javax.swing.SwingWorker;

import javax.swing.event.TableModelEvent;

import javax.swing.event.TableModelListener;

 

 

public class MyFrame extends JFrame {

 

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
             
            public void run() {
            	System.out.println("hello");

                new MyFrame();

            }

        });

    }

     

    static JProgressBar bar;

    static JTable table;

     

     

    public MyFrame() {

        bar = new JProgressBar();

        bar.setMinimum(0);

        bar.setMaximum(100);

        bar.setIndeterminate(false);

         

        //Add some random rows and columns

        Object[] columns = { "Test", "Test", "Test" };

        Object[][] tableValues = { { "one", "two", "three" },

                                                             { "four", "five", "six" }};

        table = new JTable(tableValues, columns);

        //We want to listen on changes on the model

        table.getModel().addTableModelListener(new MyModelListener());

         

        add(table, BorderLayout.CENTER);

        add(bar, BorderLayout.SOUTH);

         

        setVisible(true);

        pack();

        setDefaultCloseOperation(EXIT_ON_CLOSE);

         

        MySwingWorker worker = new MySwingWorker();
        worker.execute();

    }
}
