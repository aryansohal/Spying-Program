import java.rmi.*;  
public class MyClient2{  
public static void main(String args[]){  
try{  
Adder2 stub=(Adder2)Naming.lookup("rmi://localhost:5000/sonoo");  
System.out.println(stub.add());  
}catch(Exception e){}  
}  
}  