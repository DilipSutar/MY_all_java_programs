package treval.management.system;
import java.awt.Color;
import java.awt.Image;
import javax.swing.*;

public class Login extends JFrame{
    Login(){
        setSize(900,400);
        setLocation(350,200);
        setLayout(null);//to make own layout
        
        getContentPane().setBackground(Color.WHITE);
        JPanel p1=new JPanel();
        p1.setBackground(new Color(131,193,233));
        p1.setBounds(0,0,400,400);
        p1.setLayout(null);
        add(p1);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2=i1.getImage().getScaledInstance(200,200 ,Image.SCALE_DEFAULT );//default image
        ImageIcon i3=new ImageIcon(i2);
        JLabel image =new JLabel(i3);
        
        image.setBounds(100, 120, 200,200);
        p1.add(image);
       JPanel p2 =new JPanel();
       p2.setBounds(400, 30,450, 300);
        add(p2);
        JLabel lblusername =new JLabel("username") {
        	lblusername.set
        }
        setVisible(true);
        
    }
public static void main(String[]args){
   new Login();
}    
}
