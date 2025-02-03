import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class UI extends JFrame implements MouseMotionListener {
    JPanel panel = new JPanel();
    JTextField colorFieldR = new JTextField("0", 3);
    JTextField colorFieldG = new JTextField("0",3);
    JTextField colorFieldB = new JTextField("0",3);
    Counter cnt = new Counter(1, 20, 10);
    int x = 0;
    int y = 0;

    public UI(){
        setSize(500, 700);
        setVisible(true);
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        JPanel counterPanel = new JPanel();
        counterPanel.add(new JLabel("Розмір лінії: "));
        counterPanel.add(cnt);
        c.fill = GridBagConstraints.HORIZONTAL;
        c.anchor = GridBagConstraints.PAGE_START;
        c.insets = new Insets(0, 0, 0, 0);
        c.weighty = 0;
        c.weightx = 1;
        c.gridy = 0;
        add(counterPanel, c);

        JPanel colorPanel = new JPanel();
        colorPanel.add(new JLabel("Колір (RBG, кожне значення від 0 до 256): "));
        colorPanel.add(colorFieldR);
        colorPanel.add(colorFieldG);
        colorPanel.add(colorFieldB);
        c.gridy = 1;
        add(colorPanel, c);

        panel.setBackground(Color.WHITE);
        c.anchor = GridBagConstraints.PAGE_END;
        c.fill = GridBagConstraints.BOTH;
        c.gridy = 2;
        c.weighty = 1;
        add(panel, c);
        panel.addMouseMotionListener(this);
    }


    @Override
    public void mouseDragged(MouseEvent e) {
        Graphics gr = panel.getGraphics();
        Graphics2D g = (Graphics2D) gr;
        g.setStroke(new BasicStroke(cnt.getCurrentValue()));
        g.setColor(new Color(
                Integer.parseInt(colorFieldR.getText()),
                Integer.parseInt(colorFieldG.getText()),
                Integer.parseInt(colorFieldB.getText())
        ));



        if (x == 0 && y == 0){
            x = e.getX();
            y = e.getY();
            return;
        }

        g.drawLine(x,y,e.getX(),e.getY());
        x = e.getX();
        y = e.getY();


    }

    @Override
    public void mouseMoved(MouseEvent e) {
        x = 0;
        y = 0;

    }
}
