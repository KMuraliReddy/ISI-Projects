import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

public class MyModelListener implements TableModelListener {

 

        @Override

        public void tableChanged(TableModelEvent e) {

            //The table model has been changed, update the progressbar

            MyFrame.bar.setValue(MyFrame.bar.getValue() + 1);

        }

	

    }