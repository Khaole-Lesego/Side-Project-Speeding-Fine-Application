/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package speedingfinesreport;

/**
 * This program creates a report of speeding fines for four cities over three months.
 * It displays the fines in a table format and calculates statistics (highest and lowest fines).
 * 
 * Think of it like a spreadsheet with rows (cities) and columns (months) where we track
 * how fast people were going when they got speeding tickets.
 */
public class SpeedingFinesReport {

    /**
     * The main method is where the program starts running.
     * It's like the "start button" for our application.
     */
    public static void main(String[] args) {
        // Create and display the speeding fines report
        SpeedingFinesReport report = new SpeedingFinesReport();
        report.displayReport();
    }
    
    /**
     * This method does all the work for creating and displaying the report.
     * It's like a factory worker who follows specific steps to build our report.
     */
    public void displayReport() {
        // STEP 1: Create and fill our 2D array (like a spreadsheet grid)
        // A 2D array is like a table with rows and columns
        // [4 rows] for cities × [3 columns] for months
        int[][] speedingFines = {
            {128, 135, 139},  // Johannesburg fines for Jan, Feb, Mar
            {155, 129, 175},  // Durban fines for Jan, Feb, Mar
            {129, 130, 185},  // Cape Town fines for Jan, Feb, Mar
            {195, 155, 221}   // Port Elizabeth fines for Jan, Feb, Mar
        };
        
        // City names corresponding to each row in our array
        String[] cities = {"JHB", "DBN", "CTN", "PE"};
        // Month names for our columns
        String[] months = {"JAN", "FEB", "MAR"};
        
        // STEP 2: Display the report header
        System.out.println("*******************************");
        System.out.println("SPEEDING FINES REPORT");
        System.out.println("*******************************");
        
        // STEP 3: Print the column headers (month names)
        System.out.print("    "); // Add some space before the first column
        for (String month : months) {
            System.out.print(month + "    "); // Print each month name with spacing
        }
        System.out.println(); // Move to the next line
        
        // STEP 4: Print each city's data row by row
        for (int i = 0; i < speedingFines.length; i++) {
            System.out.print(cities[i] + "   "); // Print city name
            
            // Print each month's fine for this city
            for (int j = 0; j < speedingFines[i].length; j++) {
                System.out.print(speedingFines[i][j] + "km   "); // Print fine + "km"
            }
            System.out.println(); // Move to next line after each city
        }
        
        // STEP 5: Calculate and display statistics
        displayStatistics(speedingFines);
    }
    
    /**
     * This method finds and displays the highest and lowest speeding fines.
     * It's like a detective searching through all the data to find records.
     * 
     * @param fines - the 2D array containing all the speeding fine data
     */
    public void displayStatistics(int[][] fines) {
        // Start by assuming the first fine is both highest and lowest
        int maxFine = fines[0][0]; // Start with Johannesburg's January fine
        int minFine = fines[0][0]; // Start with Johannesburg's January fine
        
        // Search through every single fine in our table
        // Outer loop goes through each city (row)
        for (int i = 0; i < fines.length; i++) {
            // Inner loop goes through each month (column) for the current city
            for (int j = 0; j < fines[i].length; j++) {
                // If we find a fine higher than our current maximum, update maximum
                if (fines[i][j] > maxFine) {
                    maxFine = fines[i][j];
                }
                
                // If we find a fine lower than our current minimum, update minimum
                if (fines[i][j] < minFine) {
                    minFine = fines[i][j];
                }
            }
        }
        
        // Display the statistics section
        System.out.println("\nSPEEDING FINES STATISTICS");
        System.out.println("*******************************");
        System.out.println("Maximum speed captured: " + maxFine + "km");
        System.out.println("Minimum speed captured: " + minFine + "km");
        System.out.println("*******************************");
    }
    
    /**
     * This method is used for testing - it returns the maximum fine.
     * @param fines - the 2D array of fines
     * @return the highest fine found
     */
    public int findMaxFine(int[][] fines) {
        int maxFine = fines[0][0];
        for (int i = 0; i < fines.length; i++) {
            for (int j = 0; j < fines[i].length; j++) {
                if (fines[i][j] > maxFine) {
                    maxFine = fines[i][j];
                }
            }
        }
        return maxFine;
    }
    
    /**
     * This method is used for testing - it returns the minimum fine.
     * @param fines - the 2D array of fines
     * @return the lowest fine found
     */
    public int findMinFine(int[][] fines) {
        int minFine = fines[0][0];
        for (int i = 0; i < fines.length; i++) {
            for (int j = 0; j < fines[i].length; j++) {
                if (fines[i][j] < minFine) {
                    minFine = fines[i][j];
                }
            }
        }
        return minFine;
    }
}
