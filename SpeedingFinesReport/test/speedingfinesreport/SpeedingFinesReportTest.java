/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package speedingfinesreport;



import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the SpeedingFinesReport class.
 * These tests verify that our program works correctly by checking specific scenarios.
 * Think of these as quality control checks for our code.
 */
public class SpeedingFinesReportTest {

    /**
     * Test to verify that we correctly find the maximum fine.
     * We create sample data and check if our method returns the right maximum value.
     */
    @Test
    public void testFindMaxFine() {
        SpeedingFinesReport report = new SpeedingFinesReport();
        
        // Create test data - similar to our actual data but with known values
        int[][] testFines = {
            {128, 135, 139},
            {155, 129, 175},
            {129, 130, 185},
            {195, 155, 221}
        };
        
        // We expect 221 to be the maximum (from PE in March)
        int expectedMax = 221;
        int actualMax = report.findMaxFine(testFines);
        
        // If these don't match, our test fails and we know something is wrong
        assertEquals(expectedMax, actualMax, "The maximum fine should be 221");
    }

    /**
     * Test to verify that we correctly find the minimum fine.
     * We use the same test data but look for the smallest value.
     */
    @Test
    public void testFindMinFine() {
        SpeedingFinesReport report = new SpeedingFinesReport();
        
        int[][] testFines = {
            {128, 135, 139},
            {155, 129, 175},
            {129, 130, 185},
            {195, 155, 221}
        };
        
        // We expect 128 to be the minimum (from JHB in January)
        int expectedMin = 128;
        int actualMin = report.findMinFine(testFines);
        
        assertEquals(expectedMin, actualMin, "The minimum fine should be 128");
    }
}
