import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class JavaSweeper extends JFrame {
    public static void main(String[] args) throws Exception {
        new JavaSweeper();
    }

    public JavaSweeper () {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Sweeper");
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
    }
}
