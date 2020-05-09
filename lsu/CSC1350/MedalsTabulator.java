package medalstabulator;

/**
 * Display a table of the number of medals won by four
 * top medaling countries
 * @author Duncan
 * @since 99-99-9999
 * <pre>
 *    Creates the table below:
 *          GOLD    SILVER  BRONZE  Total
 * =======================================
 * USA      20      50      11      ...
 * GER      12      30      5       ...
 * FRA      8       4       15      ...
 * RUS      7       25      3       ...
 * ---------------------------------------
 * </pre>
 */
public class MedalsTabulator 
{
    public static void main(String[] args) 
    {
        String[] countries = {"USA", "GER", "FRA", "RUS"};
        final int NUM_COUNTRIES = countries.length, MEDAL_CATEGORIES = 3;
        int[][] medals = {{20, 50, 11}, {12, 30, 5}, {8, 4, 15}, {7, 25, 3}};
        int i,j, countryTotal;
        System.out.printf("%-5s %-9s %-9s %-9s %s%n"," ","GOLD","SILVER","BRONZE","Total");
        System.out.println("==========================================");
        for (i = 0; i < NUM_COUNTRIES; i++)
        {
            countryTotal = 0;
            System.out.printf("%-5s ",countries[i]);
            for (j = 0; j < MEDAL_CATEGORIES; j++)
            {
                countryTotal += medals[i][j];
                System.out.printf("%-9d ",medals[i][j]);
            }
            System.out.printf("%d%n",countryTotal);
        }
        System.out.println("------------------------------------------");
    }
    
}
