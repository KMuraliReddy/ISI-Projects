import java.util.List;

import javax.swing.SwingWorker;

public class MySwingWorker extends SwingWorker<Integer, String> {

 

        @Override

        protected Integer doInBackground() throws Exception {

            //This work will get done in a background thread

             

            for (int i=0; i<100; i++) {

                //Get new values for our JTable

                //In this case our new value will be foo

                publish("foo");

                 

                //Sleep so we can see changes

                Thread.sleep(200);

            }

             

                        //We have nothing to return to the done method, we do not care about this part.

            return null;

        }

         

        @Override

        protected void process(List<String> chunks) {

            //We are now in the event dispatching thread, so update our JTable with our new data

            MyFrame.table.setValueAt(chunks.get(0), 0, 0);

        }

    }


