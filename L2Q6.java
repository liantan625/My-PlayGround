import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount of water in gram: ");
        int Mass = scanner.nextInt();
        System.out.println("Enter the initial temperature of water in Fahrenheit : ");
        float initial_temperature = scanner.nextFloat();
        System.out.println("Enter the final temperature of water in Fahrenheit : ");
        float final_temperature = scanner.nextFloat();
        float energy_needed = Mass * (final_temperature - initial_temperature) * 4184;
        System.out.println("The energy needed is " + String.format("%.6e%n",energy_needed));
        
    }
}
