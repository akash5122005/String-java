import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int max = Integer.MIN_VALUE; 
        int number;

        while (true) {
            number = scanner.nextInt();
            if (number == -1) {
                break;  
            }
            if (number > max) {
                max = number; 
            }
        }

        System.out.println("The maximum element in the stream is: " + max);

        scanner.close();
    }
}
