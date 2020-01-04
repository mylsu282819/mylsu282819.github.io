
package circledemo;

/**
 * Describes a circle in the graphical coordinate system
 * @author Duncan
 * @since 99-99-9999
 * Classroom Demo: csc 1350
 * Illustrates implementing a simple class with instance
 * variables, accessor and mutators.
 */
public class Circle 
{
    /**
     * The x-coordinate of the top-left corner of the 
     * bounding box.
     */
    private double x;
    /**
     * The y-coordinate of the top-left corner of the bounding box.
     */
    private double y;
    /**
     * The diameter of the circle.
     */	
    private double width;
    
    
    /**
     * Modifies this circle using the specified parameters
     * @param xVal the new x-coordinate of the top-left corner 
     *        of the bounding box
     * @param yVal the new y-coordinate of the top-left corner 
     *        of the bounding box
     * @param w the new diameter of the circle
     */
    public void setCircle (double xVal, double yVal, double w)
    {
        x = xVal;
        y = yVal;
        width = w;
    }
    
    /**
     * Gives the x-coordinate of this circle
     * @return the x-coordinate of the top-left corner of the
     * bounding box of this circle.
     */
    public double getX()
    {
        return x;
    }
    
    /**
     * Gives the y-coordinate of this circle
     * @return the y-coordinate of the top-left corner of the
     * bounding box of this circle.
     */
    public double getY()
    {
        return y;
    }
    
    /**
     * Gives the diameter of this circle
     * @return the diameter of this circle
     */	
    public double getWidth()
    {
        return width;
    }    
}
