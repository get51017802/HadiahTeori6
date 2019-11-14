package hadiahteori1;

/**
 *
 * @author User
 */
import javax.swing.*;
import java.awt.event.*;

public  abstract class hadiahteori1 implements ActionListener {

    /**
     */
    
    private static void createAndShowGUI() {
        // TODO code application logic here
        //Make Frame
        JFrame frame = new JFrame ("I am a Frame"); frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(20,30,600,100);
        frame.getContentPane().setLayout(null);
        //make a button
        JButton butt=new JButton("Munculkan Nama");
        JButton butt2=new JButton("Munculkan NIM");
        JButton butt3=new JButton("Munculkan Alamat");
        frame.getContentPane().add(butt);
        frame.getContentPane().add(butt2);
        frame.getContentPane().add(butt3);
        
        butt.setBounds(50,20,200,20);
        hadiahteori1 app = new hadiahteori1() {};
        app.label = new JLabel();
        app.label.setBounds(300, 20, 200,20);
        frame.getContentPane().add(app.label);
        butt.addActionListener(app);
        frame.setVisible(true);
        
        butt2.setBounds(50,60,200,20);
        app.label2 = new JLabel();
        app.label2.setBounds(300, 60, 200,20);
        frame.getContentPane().add(app.label2);
        butt2.addActionListener(app);
        frame.setVisible(true);
        
        butt3.setBounds(50,100,200,20);
        app.label3= new JLabel();
        app.label3.setBounds(300, 100, 200,20);
        frame.getContentPane().add(app.label3);
        butt3.addActionListener(app);
        frame.setVisible(true);
        
    }
    
    private JLabel label2;
    private JLabel label3;
    @Override
    public void actionPerformed(ActionEvent e)
    {
        label .setText("Getrudis");
        label2.setText("51017802");
        label3.setText("JL.Baji Ateka");
        //ini akan dieksekusi ketika button dikli  
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater((new Runnable(){
         public void run(){  
       createAndShowGUI();
    }
         
    });
}
  JLabel label,Jlabel2,Jlabel3;
}