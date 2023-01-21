import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import javax.swing.plaf.DimensionUIResource;


public class JavaSweeper extends JFrame {
    JPanel panel;
    public static void main(String[] args) throws Exception {
        new JavaSweeper();
    }

    public JavaSweeper () {
        
        panel = new JPanel();
        panel.setPreferredSize(new DimensionUIResource(500, 300));
        add (panel);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Java Sweeper");
        setVisible(true);
        setResizable(false);
        
        pack();
        
        setLocationRelativeTo(null);
    }
}
