import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Payal.Chaudhari
 */
public class TestLogin extends JFrame implements WindowListener{
    JTextField tf1,tf2;
    JButton submit,cancel;
    JLabel uname,pwd;
    TestLogin()
    {
        tf1 = new JTextField(20);
        tf1.setEditable(true);
        tf2 = new JTextField(20);
        tf2.setEditable(true);
        uname = new JLabel("User Name");
        pwd = new JLabel("Password");

        submit = new JButton("Submit");
        cancel = new JButton("Cancel");
        GridBagConstraints gc = new GridBagConstraints();

        this.setSize(1000,1000);
        this.setLayout(new GridBagLayout());
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.gridx = 0;
        gc.gridy = 0;
        this.add(uname,gc);
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.gridx = 1;
        gc.gridy = 0;
        this.add(tf1,gc);
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.gridx = 0;
        gc.gridy = 1;
        this.add(pwd,gc);
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.gridx = 1;
        gc.gridy = 1;
        this.add(tf2,gc);
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.gridx = 0;
        gc.gridy = 2;
        gc.gridwidth = 2;
        this.add(submit,gc);
        gc.fill = GridBagConstraints.HORIZONTAL;
        gc.gridx = 0;
        gc.gridy = 3;
        gc.gridwidth = 2;
        this.add(cancel,gc);
        this.pack();
        this.setVisible(true);
        this.addWindowListener(this);
    }

    public static void main(String args[])
    {
        TestLogin tl =  new TestLogin();

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

}