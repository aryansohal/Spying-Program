
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.*;  
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.plaf.RootPaneUI;
/**
 *
 * @author amazi
 */

public class AdderRemote2 extends UnicastRemoteObject implements Adder2
{
    AdderRemote2()throws RemoteException
    {
        super();
    }
    public int add()
    {
        try { 
            Thread.sleep(120); 
            Robot r = new Robot(); 
  
            // It saves screenshot to desired path 
            String path = "C:\\Users\\amazi\\OneDrive\\Pictures\\My Shots\\Shot.jpg"; 
  
            // Used to get ScreenSize and capture image 
            Rectangle capture =  
            new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()); 
            BufferedImage Image = r.createScreenCapture(capture); 
            ImageIO.write(Image, "jpg", new File(path)); 
            System.out.println("Screenshot saved"); 
            return 1;
        }
        catch (AWTException | IOException | InterruptedException ex) { 
            Logger.getLogger(AdderRemote2.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex);
            return 0;
        }
    }
}
