package rectangledemo;

/**
 * This program calculates the area and perimeter of
 * a rectangle whose length is 5.2 and width is 7.4<br>
 * CSC 1350 Section 3/4
 * @author Duncan
 * @version 2 uses fewer variable; avoids the use of 
 *            'area' and 'perimeter'
 * @since 9/6/2019
 */
 
public class RectangleDemo
{
   public static void main(String[] args)
   {
      double length = 5.2, width = 7.4;
      System.out.print("The area of a rectangle whose width is ");
      System.out.println(width+" and whose length is " + length);	  
      System.out.print("has an area of "+(length * width)+" and a perimeter of ");
      System.out.println((2*(length + width))+".");
   }
}
	