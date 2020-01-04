package usmoneydemo;

/**
 * A test bed for the USMoney implementation
 * @author Duncan
 * @since 99-99-999
 * @see USMoney
 */
public class USMoneyDemo 
{
    public static void main(String[] args) 
    {
        USMoney five = new USMoney();
        five.setUSMoney(5, 0);
        USMoney ten2 = new USMoney();
        ten2.setUSMoney(five.getDollars()+5, ten2.getCents()+2);
        System.out.printf("The first amount is %s.%n",five);
        System.out.printf("The second amount is %s.%n",ten2);
        System.out.printf("Are %s and %s equal? %b%n",five,ten2,five.equals(ten2));
    }
    
}
