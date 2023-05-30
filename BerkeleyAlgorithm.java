import java.util.Arrays;
import java.util.Scanner;

public class BerkeleyAlgorithm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Clocks: ");
        int numNodes = sc.nextInt();

        int[] clocks = new int[numNodes];

        for(int i = 0; i < numNodes; i++){
            System.out.println("Enter the clock value of clock "+ i +": ");
            clocks[i] = sc.nextInt();
        }

        // Calculate average offset
        int sum = Arrays.stream(clocks).sum();
        int average = sum / clocks.length;

        System.out.println("Average offset: " + average);

        // Choose time server node
        System.out.println("Enter the index of the time server node: ");
        int timeServerIndex = sc.nextInt();

        // Adjust time of each process
        for (int i = 0; i < clocks.length; i++) {

                int adjustment = average - clocks[i];
                System.out.println("Adjustment for clock " + i + ": " + adjustment);
                clocks[i] += adjustment;
        
        }

        System.out.println("Adjusted clocks:");
        for (int i = 0; i < clocks.length; i++) {
            System.out.println("Clock " + i + " clock: " + clocks[i]);
        }
    }
}