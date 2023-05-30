import java.util.Scanner;

public class TokenRing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Number Of Nodes You Want In The Ring: ");
        int n = scanner.nextInt();

        System.out.print("Enter Sender: ");
        int sender = scanner.nextInt();

        System.out.print("Enter Receiver: ");
        int receiver = scanner.nextInt();

        System.out.print("Enter Data To Send: ");
        int data = scanner.nextInt();

        System.out.println("Token Passing:");
        int currentNode = sender;
        while (currentNode != receiver) {
            System.out.print(currentNode + " -> ");
            currentNode = (currentNode + 1) % n;
        }
        System.out.println(currentNode);

        System.out.println("Sender: " + sender + " Sending Data: " + data);
        for(int i=sender; i!=receiver; i = (i+1)%n){
        System.out.println("Data: " + data + " Forwarded By: " + i);
      }
        System.out.println("Receiver: " + receiver + " Received The Data: " + data);

        scanner.close();
    }
}