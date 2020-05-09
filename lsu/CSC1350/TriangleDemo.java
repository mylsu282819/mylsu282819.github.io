package triangledemo;

import java.util.Scanner;

/**
 * This program computes the perimeter and area
 * of a triangle when the end-user enters the sides
 * of the triangle. It uses Heron's formula to calculate
 * the area. It displays numeric values to the nearest 
 * hundredths.
 * @author Duncan
 * @since 99-99-9999
 */
public class TriangleDemo 
{
    public static void main(String[] args) 
    {
        System.out.print("Enter the sides of the triangle -> ");
        Scanner cin = new Scanner(System.in);
        double side1 = cin.nextDouble(), side2 = cin.nextDouble(), side3 = cin.nextDouble();
        System.out.printf("side A: %.2f%n",side1);
        System.out.printf("side B: %.2f%n",side2);
        System.out.printf("side C: %.2f%n",side3);
        double perimeter = side1 + side2 + side3;
        System.out.printf("%13s%.2f%n","Perimeter:",perimeter);
        double halfPer = perimeter / 2;
        System.out.printf("%13s%.2f%n","area:",Math.sqrt(halfPer*(halfPer-side1)*(halfPer-side2)*(halfPer-side3)));              
    }    
}
