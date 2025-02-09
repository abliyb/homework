import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class JTextFieldLimited extends JTextField {

    JTextFieldLimited(int limit) {
        super();
        this.addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                if (getText().length() >= limit )
                    e.consume();
            }
        });
    }
}
