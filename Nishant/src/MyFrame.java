import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JDialog;

/**
 *
 * @author admin
 */
public class MyFrame extends JFrame implements ActionListener, MouseListener, KeyListener{
    JButton btn_Ok;
    JButton btn_cancel;
    JTextField txt_Ok;
    JDialog jd;

    MyFrame()
    {
        btn_cancel = new JButton("Cancel");
        btn_Ok = new JButton("Ok");
        txt_Ok = new JTextField(20);
        btn_Ok.setSize(100, 100);
        btn_cancel.setSize(500, 500);
        //MyListener ml = new MyListener();
        btn_Ok.addActionListener(this);
        btn_cancel.addActionListener(this);
        this.setSize(1000, 700);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        Container ct = this.getContentPane();
        ct.setLayout(fl);
        ct.add(btn_Ok);
        ct.add(btn_cancel);
        ct.add(txt_Ok);
        this.addMouseListener(this);
        txt_Ok.addKeyListener(this);
    }

    public static void main(String args[])
    {
        MyFrame mf = new MyFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        txt_Ok.setText(e.getActionCommand()+" has been clicked");
        if(e.getActionCommand()=="Cancel")
        {
            jd = new JDialog(this,"Hello I have come",true);
            jd.setVisible(true);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        txt_Ok.setText(e.getX() + ", "+ e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        this.getContentPane().setBackground(Color.MAGENTA);
        System.out.println("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.getContentPane().setBackground(Color.gray);
        System.out.println("Mouse Exited");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        int r = (int)(Math.random()*1000)%256;
        int g = (int)(Math.random()*1000)%256;
        int b = (int)(Math.random()*1000)%256;
        System.out.println("r : "+r+", g : "+g+", b : "+ b);

        Color c = new Color(r,g,b);
        //r,g,b are int variables having the value between 0 to 255
        btn_Ok.setBackground(c);
        //btn_Ok.setBackground(Color.green);
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}