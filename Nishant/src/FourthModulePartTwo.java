public class FourthModulePartTwo
{
    // Question 6
    /*
import javax.swing.*;

 public class Menu {

    JMenu menu, submenu; JMenuItem i1, i2, i3, i4, i5; Menu(){
    JFrame f= new JFrame("Title");
    JMenuBar mb=new JMenuBar(); menu=new
    JMenu("Menu"); i1=new JMenuItem("Option 1");
    i2=new JMenuItem("Option 2");
    i3=new JMenuItem("Option 3");
    i4=new JMenuItem("Option 4");
    i5=new JMenuItem("Option 5"); menu.add(i1);

    menu.add(i2);
    menu.add(i3);
    menu.add(i4);
    menu.add(i5);
    mb.add(menu);
   f.setJMenuBar(mb);
   f.setSize(400,400);
   f.setLayout(null);
   f.setVisible(true);
   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   f.setTitle("Menu Window");
    }
    public static void main(String args[])
    {
    new Menu();
    System.out.println("Program executed successfully !");
    }


    }

     */
    // Question 7
    /*
import javax.swing.*;
import java.awt.*;

public class Program { Program(){
    JFrame f = new JFrame();
    JLabel l1 = new JLabel();
    JLabel l2 = new JLabel(); J
    Label l3 = new JLabel();

    f.setSize(400,400); f.setLayout(null);
    f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setTitle("Student Information");
    f.add(l1);
    f.add(l2);
    f.add(l3);

    l1.setBounds(10,10,500,500);
    l1.setFont(new Font("SF Pro",Font.BOLD,18)); l1.setText("Student Name : Nishant Vekariya");

    l2.setBounds(10,30,500,500);
    l2.setFont(new Font("SF Pro",Font.BOLD,18)); l2.setText("Student Roll Number : 21BCP238");

    l3.setBounds(10,50,500,500);
    l3.setFont(new Font("SF Pro",Font.BOLD,18)); l3.setText("Course : Computer Science Engineering");
}
    public static void main(String args[])
    {
        new Program();
        System.out.println("Program executed successfully !");
    }
}

     */
    // Question 8
    /*
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dialogebox {
    private static Dialog d;

    Dialogebox() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        d = new Dialog(f, "Dialog Box Window", true);
        d.setLayout(new FlowLayout());
        Button b = new Button("Dialog Box");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(f, "This is Dialog Box");
            }
        });
        d.add(new Label("Click button to open Dialog Box !"));
        d.add(b);
        d.setSize(300, 300);
        d.setVisible(true);
    }

    public static void main(String args[]) {
        new Dialogebox();
        System.out.println("Program executed successfully !");
    }
}

     */
    // Question 9
    /*
import java.awt.*;
import javax.swing.*;
public class Program {
JFrame frameObj; Program()
{
    frameObj = new JFrame();
    frameObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    frameObj.add(b1);
    frameObj.add(b2);
    frameObj.add(b3);
    frameObj.add(b4);
    frameObj.add(b5);
    frameObj.add(b6);
    frameObj.add(b7);
    frameObj.setLayout(new FlowLayout());
    frameObj.setSize(300, 300);
    frameObj.setVisible(true);
}
public static void main(String args[])
{
    new Program();
    System.out.println("Program exeuted successfully !");
}
}

     */
    // Question 10
    /*
import java.awt.*;
import javax.swing.*;

public class GridCardL {
    JFrame f;

    GridCardL() {
        f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");
        JButton b6 = new JButton("6");
        JButton b7 = new JButton("7");
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.setLayout(new GridLayout(3, 3));
        f.setSize(300, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new GridCardL();
        System.out.println("Program executed successfully !");
    }
}

     */
    // Question 11
    /*
import java.awt.*;
import javax.swing.*;

public class GridBoxL extends Frame {
    Button buttons[];

    public GridBoxL() {
        buttons = new Button[7];
        for (int i = 0; i < 7; i++) {
            buttons[i] = new Button("Button " + (i + 1));
            add(buttons[i]);
        }
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(400, 400);
        setVisible(true);
    }

    public static void main(String args[]) {
        new GridBoxL();
        System.out.println("Program executed successfully !");
    }
}

     */
}
