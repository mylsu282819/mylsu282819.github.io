
package circledemo;

/**
 * A program that serves as a test bed for the Circle
 * class implementation
 * @author Duncan
 * @since 99-99-9999
 * @see Circle
 */
public class CircleDemo 
{
   public static void main(String[] args) 
   {
      Circle one = new Circle();
      System.out.printf("Location: (%.2f,%.2f) and width = %.2f%n",one.getX(), one.getY(), one.getWidth());
      one.setCircle(one.getY()+5,one.getX()+10, 50+one.getWidth());
      System.out.println("After translating and resizing the circle: ");
      System.out.printf("Location: (%.2f,%.2f) and width = %.2f%n",one.getX(), one.getY(), one.getWidth());
		
      Circle two = new Circle();
      two.setCircle(one.getX(), one.getY(), one.getWidth());
      System.out.println("After creating an overlapping circle: ");
      System.out.printf("First Circle: location: (%.2f,%.2f) and width = %.2f%n",one.getX(), one.getY(), one.getWidth());
      System.out.printf("Second Circle: location: (%.2f,%.2f) and width = %.2f%n",two.getX(), two.getY(), two.getWidth());		

      one.setCircle(50,50,one.getWidth());
      System.out.println("After translating the first circle to (50,50): ");
      System.out.printf("First Circle: location: (%.2f,%.2f) and width = %.2f%n",one.getX(), one.getY(), one.getWidth());
      System.out.printf("Second Circle: location: (%.2f,%.2f) and width = %.2f%n",two.getX(), two.getY(), two.getWidth());				
	  
      two.setCircle(one.getX()-one.getWidth()/2,one.getY()-one.getWidth()/2, 2*one.getWidth());
      System.out.println("After modifying the second circle so that it is concentric with the first");
      System.out.println("and its diameter is twice that of the first: ");
      System.out.printf("First Circle: location: (%.2f,%.2f) and width = %.2f%n",one.getX(), one.getY(), one.getWidth());
      System.out.printf("Second Circle: location: (%.2f,%.2f) and width = %.2f%n",two.getX(), two.getY(), two.getWidth());				
   }    
}
