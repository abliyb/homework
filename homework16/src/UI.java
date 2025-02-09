import javax.swing.*;
import java.awt.*;

public class UI extends JFrame {
    public UI() {
        setSize(500, 700);
        setVisible(true);
        setLayout(new GridLayout(2, 1));
        JTextFieldLimited p = new JTextFieldLimited(10);
        add(p);
    }
}
