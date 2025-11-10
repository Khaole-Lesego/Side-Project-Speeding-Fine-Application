/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package speedingfineapplication;

/**
 * Abstract class that defines the basic structure for handling fines.
 * An abstract class is like a partially built template - it has some complete
 * functionality and some parts that need to be finished by child classes.
 * 
 * Think of it like a pre-built car chassis - the basic structure is there,
 * but the specific model details need to be added.
 */
public abstract class Fine implements iFine {
    // These are the characteristics (variables) every fine will have
    private String citizenName;  // Who got the fine
    private double speed;        // How fast they were going
    protected double finePayable; // How much they have to pay (protected = child classes can access)
    
    /**
     * Constructor - this is called when we create a new Fine object.
     * It's like a factory machine that sets up the basic information.
     * 
     * @param name - the name of the person who got the fine
     * @param speed - how fast they were going
     */
    public Fine(String name, double speed) {
        this.citizenName = name;
        this.speed = speed;
        calculateFine(); // Automatically calculate the fine when object is created
    }
    
    /**
     * Calculates how much the fine should be based on the speed.
     * If speed is 120km/h or more: fine = speed × R10.20
     * If speed is less than 120km/h: no fine (R0)
     */
    private void calculateFine() {
        if (speed >= 120) {
            finePayable = speed * 10.20; // R10.20 per km/h over (actually per km/h of speed)
        } else {
            finePayable = 0.0; // No fine if under 120km/h
        }
    }
    
    // These methods allow other classes to "get" the information (like asking questions)
    
    /**
     * Gets the citizen's name
     * @return the name of the person who got fined
     */
    public String getCitizenName() {
        return citizenName;
    }
    
    /**
     * Gets the recorded speed
     * @return how fast the person was going
     */
    public double getSpeed() {
        return speed;
    }
    
    /**
     * Gets the amount to be paid
     * @return the fine amount in Rands
     */
    public double getFinePayable() {
        return finePayable;
    }
}
