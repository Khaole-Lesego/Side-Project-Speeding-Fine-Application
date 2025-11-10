/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package speedingfineapplication;

/**
 * Concrete class that handles specific speeding fine operations.
 * This class extends (builds upon) the Fine class and provides the actual
 * implementation for the printFine method.
 * 
 * Think of this as the finished car model that uses the pre-built chassis.
 */
public class SpeedingFines extends Fine {
    
    /**
     * Constructor that passes the name and speed to the parent (Fine) class.
     * It's like saying "parent class, you handle setting up the basic information".
     * 
     * @param name - the citizen's name
     * @param speed - the recorded speed
     */
    public SpeedingFines(String name, double speed) {
        super(name, speed); // "super" means "call the parent class constructor"
    }
    
    /**
     * Implements the printFine method required by the iFine interface.
     * This method displays all the fine information in a formatted way.
     * It's like printing a receipt for the speeding fine.
     */
    @Override
    public void printFine() {
        System.out.println("*********************");
        System.out.println("PERSON: " + getCitizenName());
        System.out.println("SPEED: " + (int)getSpeed() + "km"); // Convert to int to remove decimals
        System.out.println("FINE PAYABLE: R " + (int)getFinePayable()); // Convert to int for whole Rands
        System.out.println("*********************");
    }
}
