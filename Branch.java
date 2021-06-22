
/**
 * Write a description of class Loja here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Branch
{
    private String name;
    private int saleLimit;
    private Sale[] sales;
    private int countSales;

    /**
     * Constructor for objects of class Loja
     */
    public Branch(String name, int saleLimit)
    {
        this.name = name;
        this.saleLimit = saleLimit;
        this.countSales = 0;
    }

    public void sale(int []productId) {
        Sale sale = new Sale();
        sale.setProducts(productId);
        sales[this.countSales] = sale;
        countSales++;
    }
}
