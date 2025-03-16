
package pkg00825_luisalonsocendra_tarea1;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
                @Override
                public void run() {
                        MainJFrame frame = new MainJFrame();
                        frame.setSize(1000, 900);
                        frame.setDefaultCloseOperation(MainJFrame.EXIT_ON_CLOSE);
                        frame.setVisible(true);
                }
        });
    }
}