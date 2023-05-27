package university;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Splash extends JFrame implements Runnable
{
    Thread t;
    
    //constructor της κλάσης Splash
    Splash()
    {
        //ακολουθούν οι επόμενες εντολές έτσι ώστε να δημιουργήσουμε και να βάλουμε την φωτογραφία στο παράθυρο
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/first.jpg"));
        Image i2=i1.getImage().getScaledInstance(1000, 700, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        add(image);
        
        t=new Thread(this);
        t.start();
        
        setLocation(250, 50); //επιλέγω την τοποθεσία που θα βρισκεται το παράθυρο
        setSize(1000, 700); //ορίζω το μέγεθος του παραθύρου
        setVisible(true); //για να είναι ορατό το παράθυρο
        
        try
        {
            Thread.sleep(10);
        }
        catch(Exception e)
        {
            
        }
        
        
    }
    
    @Override
    public void run() 
    {
        try
        {
            Thread.sleep(7000);
            setVisible(false); //το παράθυρο κλείνει μετά από κάποια seconds
            
            //new Frame
            new Login(); //δημιουργούμε ένα αντικείμενο της κλάσης Login καλώντας τον δημιουργό της 
            //κλάσης και με την μέθεδο setVisible(true) κάνουμε το παράθυρο της Login ορατό
        }
        catch(Exception e) {}
        
    }
    
    public static void main(String[] args)
    {
        Splash s=new Splash(); //Δημιουργώ ένα αντικείμενο της κλάσης Splash
        
    }

    
}
