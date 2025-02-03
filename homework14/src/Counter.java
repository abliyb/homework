import javax.swing.*;

public class Counter extends JPanel {
    int min;
    int max;
    int val;

    public Counter(int min, int max, int startValue) {
        super();
        this.min = min;
        this.max = max;
        this.val = startValue;
        JLabel valueLabel =  new JLabel(String.valueOf(startValue));
        JButton btnMinus = new JButton("-");
        JButton btnPlus = new JButton("+");
        btnMinus.addActionListener(e -> {
            if(this.val > this.min) {
                this.val--;
                valueLabel.setText(String.valueOf(this.val));
            }
        });
        btnPlus.addActionListener(e -> {
            if(this.val < this.max) {
                this.val++;
                valueLabel.setText(String.valueOf(this.val));
            }
        });
        add(btnMinus);
        add(valueLabel);
        add(btnPlus);
    }

    public int getCurrentValue() {
        return this.val;
    }
}
