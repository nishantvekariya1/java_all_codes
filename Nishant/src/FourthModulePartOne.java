public class FourthModulePartOne
{
    // Question 1
    /*
    import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Mov {
    public static void main(String[] args) {
        JFrame app = new JFrame();
        MyPanel mp = new MyPanel();
        app.add(mp);
        app.setSize(300, 300);
        app.setLocationRelativeTo(null);

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
        Thread t = new Thread(mp);
        t.start();
        System.out.println("Program Executed Successfully !");
    }
}

class MyPanel extends JPanel implements Runnable {
    int x = 0;
    int y = 0;
    boolean flagx = true;
    boolean flagy = true;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (flagx == true && flagy == true)
            g.setColor(Color.YELLOW);
        else if (flagx == true && flagy == false)
            g.setColor(Color.GREEN);
        else if (flagx == false && flagy == true)
            g.setColor(Color.RED);
        else
            g.setColor(Color.black);
        g.fillOval(x, y, 100, 100);
    }

    @Override
    public void run() {

        while (true) {
            if (flagx == true) {
                x = x + 20;
                if (x >= (this.getWidth() - 100))
                    flagx = false;
            } else {
                x = x - 20;
                if (x <= 0)
                    flagx = true;
            }
            if (flagy == true) {
                y = y + 20;
                if (y >= (this.getHeight() - 100))
                    flagy = false;
            } else {
                y = y - 20;
                if (y <= 20)
                    flagy = true;
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException ex) {
            }
            this.repaint();
        }
    }
}

     */
    // Question 2
    /*
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class Event implements MouseMotionListener, WindowListener {
    JLabel l;
    JFrame fr;

    public void initGUI() {
        fr = new JFrame();
        l = new JLabel();
        Container c = fr.getContentPane();
        c.setLayout(new BorderLayout());
        c.add(l, BorderLayout.NORTH);
        fr.setSize(512, 512);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.addMouseMotionListener(this);
        fr.addWindowListener(this);
    }

    public void mouseDragged(MouseEvent me) {
        int x = me.getX();
        int y = me.getY();
        l.setText("Dragged at x:[" + x + "] y:[" + y + "]");
    }

    public void windowActivated(WindowEvent we) {
    }

    public void windowClosed(WindowEvent we) {
    }

    public void windowClosing(WindowEvent we) {
        JOptionPane.showMessageDialog(null, "Thank you!");
    }

    public void windowDeactivated(WindowEvent we) {
        JOptionPane.showMessageDialog(null, "Window is Deactivated");
    }

    public void windowDeiconified(WindowEvent we) {
    }

    public void windowIconified(WindowEvent we) {
    }

    public void windowOpened(WindowEvent we) {
        JOptionPane.showMessageDialog(null, "Welcome to Java");
    }

    public void mouseMoved(MouseEvent me) {
        int x = me.getX();
        int y = me.getY();
        l.setText("Moved at x:[" + x + "] y:[" + y + "]");
    }

    public Event() {
        initGUI();
    }

    public static void main(String args[]) {
        Event m = new Event();
        System.out.println("Program executed successfully !");
    }
}
     */
    // Question 3
    /*
import java.awt.*;
import java.awt.event.*;
public class Program extends Frame implements MouseListener{ Label l;
    Program(){ addMouseListener(this); l=new Label(); l.setBounds(20,50,100,20); add(l);
        setSize(300,300); setLayout(null); setVisible(true);
    }
    public void mouseClicked(MouseEvent e) { if(e.getButton() == MouseEvent.BUTTON1) {
        l.setText("Left Click!");
    }
        if(e.getButton() == MouseEvent.BUTTON2) { l.setText("Middle Click!");
        }
        if(e.getButton() == MouseEvent.BUTTON3) { l.setText("Right Click!");
        }
    }
    public void mouseEntered(MouseEvent e) { l.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e) { l.setText("Mouse Exited");
    }
    public void mousePressed(MouseEvent e) { l.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e) { l.setText("Mouse Released");
    }
    public void mouseDragged(MouseEvent e) { l.setText("Mouse Dragged");
    }
    public static void main(String[] args) { new Program();
        System.out.println("Program executed successfully !");
    }
}

     */
    // Question 4
    /*
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Keybh implements KeyListener, ActionListener {
    static JFrame frame;
    static JTextField output;
    static JTextField input;

    public static void main(String args[]) {
        frame = new JFrame("Keyboard Event");
        frame.setBackground(Color.BLUE);
        frame.setSize(500, 500);
        frame.setLayout(null);
        output = new JTextField();
        output.setBounds(0, 0, 500, 50);
        frame.add(output);
        input = new JTextField();
        input.setBounds(0, 400, 500, 50);
        frame.add(input);
        JButton exit = new JButton("Exit");
        exit.setBounds(220, 200, 60, 30);
        frame.add(exit);
        Keybh obj = new Keybh();
        input.addKeyListener(obj);
        exit.addActionListener(obj);
        frame.setVisible(true);
        System.out.println("Program executed successfully !");
    }

    public void actionPerformed(ActionEvent e) {
        frame.dispose();
    }

    public void keyReleased(KeyEvent e) {
        output.setText("");
        output.setText("OUTPUT::" + "Key Released : " + e.getKeyCode());
        if (Character.isLetter(e.getKeyChar()))
            keyTyped(e);
        if (Character.isDigit(e.getKeyChar()))
            keyTyped(e);
    }

    public void keyPressed(KeyEvent e) {
        output.setText("");
        output.setText("OUTPUT::" + "Key Pressed : " + e.getKeyCode());
        if (Character.isLetter(e.getKeyChar()))
            keyTyped(e);
        if (Character.isDigit(e.getKeyChar()))
            keyTyped(e);
    }

    public void keyTyped(KeyEvent e) {
        output.setText("");
        output.setText("OUTPUT::" + "Key Typed : " + e.getKeyChar());
    }
}

     */
    // Question 5
    /*
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Pushb {
    public static void main(String[] args) {
        final JFrame frame = new JFrame();
        JButton btnH = new JButton("Greetings 2");
        btnH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Welcome !");
            }
        });
        JButton btnM = new JButton("Greetings 1");
        btnM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Have a Good Day !");
            }
        });
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(btnM);
        buttonPanel.add(btnH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.getContentPane().add(buttonPanel, BorderLayout.SOUTH);
        frame.setVisible(true);
        System.out.println("Program executed successfully !");
    }
}

     */


}
