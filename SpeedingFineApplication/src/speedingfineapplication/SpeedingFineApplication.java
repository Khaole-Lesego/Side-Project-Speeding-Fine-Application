/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package speedingfineapplication;

import java.util.Scanner;

/**
 * Main application class that handles user interaction.
 * This is like the front desk - it interacts with users and coordinates
 * with the other classes to get the job done.
 */
public class SpeedingFineApplication {
    
    /**
     * The main method - the starting point of our application.
     */
    public static void main(String[] args) {
        // Create a Scanner to read user input (like a microphone for listening to the user)
        Scanner scanner = new Scanner(System.in);
        
        // Get the person's name
        System.out.print("Enter the person name: ");
        String name = scanner.nextLine();
        
        // Get the recorded speed
        System.out.print("Enter the speed: ");
        double speed = scanner.nextDouble();
        
        // Close the scanner to free up resources (like hanging up the phone)
        scanner.close();
        
        // Create a SpeedingFines object with the provided information
        // This is like filling out a fine form with the person's details
        SpeedingFines fine = new SpeedingFines(name, speed);
        
        // Print the fine details (like printing the completed fine form)
        fine.printFine();
    }
}
