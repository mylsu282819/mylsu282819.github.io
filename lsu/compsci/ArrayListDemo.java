package arraylistdemo;

import java.util.ArrayList;

/**
 * Illustrates the use of the generic ArrayList
 * class in a program
 * @author Duncan
 * <pre>
 * The discussion on Array Lists can be found in
 * section 7.2 of the textbook
 * </pre>
 */
public class ArrayListDemo 
{
    public static void main(String[] args) 
    {
        ArrayList<Double> gPA = new ArrayList();
        gPA.add(3.24);
        gPA.add(4.00);
        System.out.printf("GPAS: %s size: %d%n",gPA,gPA.size());
        ArrayList<String> roster = new ArrayList();
        roster.add("Emily");
        roster.add("Bob");
        System.out.printf("List: %s Size: %d%n",roster,roster.size());
        roster.add(1,"Cindy");
        System.out.printf("List: %s Size: %d%n",roster,roster.size());
        roster.add(0,"Bill");
        System.out.printf("List: %s Size: %d%n",roster,roster.size());
        System.out.println(roster.set(3,"Carolyn"));
        System.out.printf("List: %s Size: %d%n",roster,roster.size());
        System.out.println("Displaying the List in Reverse Order");
        for (int i = roster.size()-1; i>=0; i--)
        {
            System.out.printf("%s%n",roster.get(i));
        }
        System.out.printf("Enrollment: %d%n",roster.size());
        System.out.printf("List: %s Size: %d%n",roster,roster.size());
        System.out.println(roster.remove(2)); 
        System.out.printf("List: %s Size: %d%n",roster,roster.size());
    } 
}
