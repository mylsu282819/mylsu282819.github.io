package impedancecalculator;

import java.util.Scanner;

/**
 * This program computes and displays the impedance
 * of an RC circuit for values of the inductive
 * reactance and resistance entered by the end-user.<br>
 * course: csc 1350<br>
 * sections: 1-3
 * @author Duncan
 * @version 2 prompts user for both inputs at the same time;
 * Also, the two declaration statements for the inputs are
 * consolidated into one since both variables are of the same type.
 * We also avoid the use of the 'impedance' variable. That variable
 * is unnecessary. A rule of thumb is that whenever a calculated
 * value is used only once in a program, there is no need to save
 * it to memory. Simply, calculate and use the value on the fly.
 * However, if a calculated value will be used more than once, 
 * save it to a variable to avoid calculating the same value more
 * then once. This version of the code is more efficient.
 * @since 99-99-9999
 */
public class ImpedanceCalculator 
{
   public static void main(String[] args) 
   {        
      Scanner cin = new Scanner(System.in);
      System.out.print("Enter the inductance and resistance of the RC circuit in ohms-> ");
      double inductance = cin.nextDouble(), resistance = cin.nextDouble();                
      System.out.println("The impedance of the circuit is "+Math.sqrt(Math.pow(inductance,2)+Math.pow(resistance,2))+" ohms.");
   }
}
