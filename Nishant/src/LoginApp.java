import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Payal.Chaudhari
 */
public class LoginApp extends JFrame implements WindowListener, ActionListener{

    JButton login,cancel;
    JTextField tf1, tf2;
    JLabel lab1, lab2;

    public LoginApp()
    {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(0,0,500,500);
        this.setLayout(new GridBagLayout());

        login = new JButton("Submit");
        login.addActionListener(this);
        cancel = new JButton("Cancel");
        cancel.addActionListener(this);
        tf1 = new JTextField(20);
        tf1.setEditable(true);
        tf2 = new JTextField(20);
        tf2.setEditable(true);
        lab1 = new JLabel("UserName");
        lab2 = new JLabel("Password");

        GridBagConstraints g = new GridBagConstraints();

        g.fill = GridBagConstraints.HORIZONTAL;
        g.ipadx = 50;
        g.ipady = 20;
        g.gridx = 0;
        g.gridy = 0;
        this.add(lab1,g);
        g.fill = GridBagConstraints.HORIZONTAL;
        g.ipadx = 50;
        g.ipady = 20;
        g.gridx = 1;
        g.gridy = 0;
        this.add(tf1,g);
        g.fill = GridBagConstraints.HORIZONTAL;
        g.ipadx = 50;
        g.ipady = 20;
        g.gridx = 0;
        g.gridy = 1;
        this.add(lab2,g);
        g.fill = GridBagConstraints.HORIZONTAL;
        g.gridx = 1;
        g.gridy = 1;
        this.add(tf2,g);
        g.fill = GridBagConstraints.HORIZONTAL;
        g.gridx = 0;
        g.gridy = 2;
        g.gridwidth = 2;
        this.add(login,g);
        g.fill = GridBagConstraints.HORIZONTAL;
        g.gridx = 0;
        g.gridy = 3;
        g.gridwidth = 2;
        this.add(cancel,g);
        //this.setLayout(new FlowLayout(FlowLayout.LEFT,25,20));

        this.pack();
        this.setVisible(true);
        this.addWindowListener(this);
    }

    public static void main(String args[])
    {
        LoginApp la = new LoginApp();
    }
    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowClosing(WindowEvent e) {
        dispose();
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowIconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowActivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // System.out.println(e.getActionCommand());
        if(e.getActionCommand().equals("Submit"))
        {
            String uname = tf1.getText();
            String pwd  = tf2.getText();
            System.out.println("uname = "+ uname + "pwd : "+pwd);
            if(uname.equals("admin")&& pwd.equals("admin"))
            {
                JDialog jd = new JDialog(this,"Login Successful",true);
                jd.setVisible(true);
            }
            else
                new JDialog(this,"Login Failure",true).setVisible(true);
        }
        else
        {
            tf1.setText("");
            tf2.setText("");
        }
    }

}