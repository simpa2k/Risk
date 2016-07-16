/**
 * Created by simpa2k on 2016-07-16.
 */
public class Main {

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Window window = new Window();
                window.setVisible(true);
            }
        });
    }

}
