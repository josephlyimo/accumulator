import java.util.Scanner;

public class Accumulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        boolean running = true;
        
        System.out.println("Welcome to the Accumulator App!");
        
        while (running) {
            System.out.println("Enter a number to add (or type 'quit' to exit): ");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("quit")) {
                running = false;
            } else {
                try {
                    int number = Integer.parseInt(input);
                    total += number;
                    System.out.println("Total: " + total);
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }
        }
        
        System.out.println("Accumulator App! Terminated");
        scanner.close();
    }
}
