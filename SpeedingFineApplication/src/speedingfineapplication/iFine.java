/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package speedingfineapplication;

/**
 * Interface for fine-related operations.
 * An interface is like a contract - it specifies what methods a class MUST have,
 * but doesn't say how those methods should work.
 * 
 * Think of it like a job description that says "must be able to print fines"
 * but doesn't specify how the printing should be done.
 */
public interface iFine {
    /**
     * This method must be implemented by any class that uses this interface.
     * It's like a requirement that says "you must know how to print fine details".
     */
    void printFine();
}
