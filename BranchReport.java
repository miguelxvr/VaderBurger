
/**
 * Write a description of class BranchReport here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BranchReport
{
    public static void reportTotalSales(Branch []branches) {
        int totalSales = 0;
        for(int i = 0; i < branches.length; i++) {
            if(branches[i] == null)
                break;
            totalSales += branches[i].getTotalSales();
        }
        System.out.println("Total de vendas: " + totalSales);
    }
}
