import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.*;
import java.rmi.*;

public class Client {
 public static void main(String args[]) {
  Client c = new Client();
  c.connectRemote();
 }
 public void connectRemote() {
  Scanner sc = new Scanner(System.in);
  try {
   Registry reg = LocateRegistry.getRegistry(9999);
   Adder ad = (Adder) reg.lookup("hi server");
   
   int a = sc.nextInt();
   int b = sc.nextInt();
   
   int c = ad.add(a, b);
   
   System.out.println("Addition is : "+c);
  }
  catch(Exception e) {
   
  }
 }
}