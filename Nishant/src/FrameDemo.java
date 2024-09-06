//import java.awt.event.WindowEvent;
//import java.awt.event.WindowListener;
//import javax.swing.JFrame;
//import java.awt.*;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//
///**
// *
// * @author HP
// */
//public class FrameDemo extends JFrame implements WindowListener,Runnable{
//    static FrameDemo fr;
//    int x,y,xflag,yflag;
//
//
//    public FrameDemo()
//    {
//        x = 0;
//        y = 0;
//        xflag = 0;
//        yflag = 0;
//        addWindowListener(this);
//        setSize(300, 400);
//        setVisible(true);
//    }
//
//    public void paint(Graphics g)
//    {
//        g.clearRect(0, 0, this.getWidth(), this.getHeight());
//
//        if(xflag == 0 && yflag == 0)
//            g.setColor(Color.red);
//        if(xflag == 1 && yflag == 0)
//            g.setColor(Color.MAGENTA);
//        if(xflag == 1 && yflag == 1)
//            g.setColor(Color.GREEN);
//        if(xflag == 0 && yflag == 1)
//            g.setColor(Color.blue);
//
//        g.fillOval(x,y,100,100);
//    }
//
//    public static void main(String args[])
//    {
//        fr = new FrameDemo();
//        Thread tx = new Thread(fr);
//        tx.start();
//    }
//
//    @Override
//    public void windowOpened(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void windowClosing(WindowEvent e) {
//        dispose();
//    }
//
//    @Override
//    public void windowClosed(WindowEvent e) {
//        System.exit(0);
//
//    }
//
//    @Override
//    public void windowIconified(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void windowDeiconified(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void windowActivated(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void windowDeactivated(WindowEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public void run() {
//
//        while(true)
//        {
//            if(xflag == 0)
//            {
//                x = x+10;
//                if(x>=this.getWidth()-100) xflag = 1;
//            }
//            if(xflag == 1)
//            {
//                x = x -10;
//                if(x<=0) xflag = 0;
//            }
//            if(yflag == 0)
//            {
//                y = y +10;
//                if(y>=this.getHeight()-100) yflag = 1;
//            }
//            if(yflag == 1)
//            {
//                y = y -10;
//                if(y<=0) yflag = 0;
//            }
//
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(FrameDemo.class.getName()).log(Level.SEVERE, null, ex);
//            }
//
//            repaint();
//        }
//    }
//
//}