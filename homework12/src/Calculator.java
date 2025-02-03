import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame implements ActionListener {
    int num1 = 0;
    int num2 = 0;
    String action = "";
    JTextField txt = new JTextField();

    public Calculator() {
        setTitle("Моя програма");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        setLayout(new GridLayout(4, 1));
        add(txt);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridLayout(1,5));
        for(int i = 0; i < 5; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(this);
            panel1.add(btn);
        }
        add(panel1);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridLayout(1,5));
        for(int i = 5; i < 10; i++) {
            JButton btn = new JButton(String.valueOf(i));
            btn.addActionListener(this);
            panel2.add(btn);
        }
        add(panel2);

        JPanel panel3 = new JPanel();
        panel3.setLayout(new GridLayout(1,5));

        JButton btnPlus = new JButton("+");
        btnPlus.addActionListener(this);
        panel3.add(btnPlus);
        JButton btnMinus = new JButton("-");
        btnMinus.addActionListener(this);
        panel3.add(btnMinus);
        JButton btnDivide = new JButton("/");
        btnDivide.addActionListener(this);
        panel3.add(btnDivide);
        JButton btnMult = new JButton("*");
        btnMult.addActionListener(this);
        panel3.add(btnMult);
        JButton btnEq = new JButton("=");
        btnEq.addActionListener(this);
        panel3.add(btnEq);

        add(panel3);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String input = e.getActionCommand();
        switch(input) {
            case "+":
            case "-":
            case "/":
            case "*":
                action = input;
                num1 = Integer.parseInt(txt.getText());
                txt.setText("");
                break;
            case "=":
                float result = 0;
                num2 = Integer.parseInt(txt.getText());
                result = switch (action) {
                    case "+" -> num1 + num2;
                    case "-" -> num1 - num2;
                    case "/" -> (float) num1 / num2;
                    case "*" -> num1 * num2;
                    default -> result;
                };
                txt.setText(String.valueOf(result));
                break;
            default:
                txt.setText(txt.getText() + input);
                break;
        }
    }
}
