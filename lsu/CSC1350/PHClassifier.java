/**
 * This program classifies a solution based on its pH value
 * and displays the number of comparisons made to determine the
 * classification.
 * @author Duncan
 * file: PHClassifier.java
 * Note: This program classifies a solution based on its pH value.
 *          Precondition: User's input is in the range [0,14]
 *          pH < 7 is acidic
 *          pH > 7 alkaline (basic)
 *          pH = 7 is neutral
 * date: 99-99-9999
 * course: CSC 1350
 * @version2 Counts the number of (comparisons) relational expressions
 * evaluated to determine the classification.
 */
package phclassifie;

import java.util.Scanner;
 
public class PHClassifier
{
    public static void main(String[] args) 
    {
       Scanner cin = new Scanner(System.in);
       System.out.print("Enter a pH value in [0,14] of the solution -> ");
       double pHValue = cin.nextDouble();
       System.out.printf("A solution with a pH value of %.2f is ",pHValue);
       int numCmps = 1;
       if (pHValue < 7)
           System.out.println("acidic.");
       else
       {
          numCmps = numCmps + 1;		   
          if (pHValue > 7)
             System.out.println("basic.");
          else
             System.out.println("neutral.");      
       }     
       System.out.printf("There were %d comparisons made.",numCmps);	   
    }
}
