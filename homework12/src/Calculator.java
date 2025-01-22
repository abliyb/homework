import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {
    public Calculator() {
        setTitle("Калькулятор");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        setLayout(new GridLayout(4, 1));

        JTextField txt = new JTextField();
        add(txt);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1,5));
        for(int i = 0; i < 5; i++) {
            JButton btn = new JButton(String.valueOf(i));
            panel1.add(btn);
        }
        add(panel1);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1,5));
        for(int i = 5; i < 10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            panel2.add(btn);
        }
        add(panel2);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(1,5));

        JButton btnPlus = new JButton("+");
        panel3.add(btnPlus);
        JButton btnMinus = new JButton("-");
        panel3.add(btnMinus);
        JButton btnDivide = new JButton("/");
        panel3.add(btnDivide);
        JButton btnMult = new JButton("*");
        panel3.add(btnMult);
        JButton btnEq = new JButton("=");
        panel3.add(btnEq);

        add(panel3);

    }
}
