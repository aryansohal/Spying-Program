
import java.rmi.*;  
import java.rmi.registry.*; 
public class MyServer2 
{
    public static void main(String args[])
    {
        try
        {
            Adder2 stub=new AdderRemote2();
            Naming.rebind("rmi://192.168.43.153/sonoo",stub);
            System.out.println("server running...");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }   
    }
}