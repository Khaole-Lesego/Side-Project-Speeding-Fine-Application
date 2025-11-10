/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package speedingfineapplication;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;


/**
 * Unit tests for the fine calculation system.
 * These tests verify that our fine calculation logic works correctly.
 */
public class FineTest {

    /**
     * Test that fines are calculated correctly for speeds at or above 120km/h.
     */
    @Test
    public void testFineCalculationAboveLimit() {
        SpeedingFines fine = new SpeedingFines("Test Person", 185);
        
        // Expected: 185 × 10.20 = 1887
        double expectedFine = 185 * 10.20;
        assertEquals(expectedFine, fine.getFinePayable(), 0.01, "Fine should be speed × 10.20");
    }
    
    /**
     * Test that no fine is charged for speeds below 120km/h.
     */
    @Test
    public void testFineCalculationBelowLimit() {
        SpeedingFines fine = new SpeedingFines("Test Person", 119);
        
        assertEquals(0.0, fine.getFinePayable(), 0.01, "No fine should be charged below 120km/h");
    }
    
    /**
     * Test that citizen name is stored correctly.
     */
    @Test
    public void testCitizenNameStorage() {
        SpeedingFines fine = new SpeedingFines("John Doe", 150);
        
        assertEquals("John Doe", fine.getCitizenName(), "Citizen name should be stored correctly");
    }
    
    /**
     * Test that speed is stored correctly.
     */
    @Test
    public void testSpeedStorage() {
        SpeedingFines fine = new SpeedingFines("John Doe", 150);
        
        assertEquals(150.0, fine.getSpeed(), 0.01, "Speed should be stored correctly");
    }
}
