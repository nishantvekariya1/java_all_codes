import javax.swing.*; import java.awt.*;

public class Program { Program(){
    JFrame f = new JFrame(); JLabel l1 = new JLabel(); JLabel l2 = new JLabel(); JLabel l3 = new JLabel();

    f.setSize(400,400); f.setLayout(null); f.setVisible(true);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); f.setTitle("Student Information");
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
