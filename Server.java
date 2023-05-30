import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements Adder{
 
 public Server() throws RemoteException {
 }

 public int add(int n1, int n2) {
  return n1+n2;
 }
 
 public static void main(String args[]) {
  try {
   Registry reg = LocateRegistry.createRegistry(9999);
   reg.rebind("hi server", new Server());
   
   System.out.println("Server started...");
   
  }
  catch(Exception e){
   
  }
  
 }

}