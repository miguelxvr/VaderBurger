
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
    private int countSales;
    private Sale[] sales;

    /**
     * Constructor for objects of class Loja
     */
    public Branch(String name, int saleLimit)
    {
        this.name = name;
        this.saleLimit = saleLimit;
        this.countSales = 0;
        this.sales = new Sale[1000];
    }

    public Sale createSale() {
        Sale sale = new Sale();
        this.addSale(sale);
        return sale;
    }

    public void addSale(Sale sale) {
        this.sales[this.countSales] = sale;
        this.countSales++;
    }

    /* Reports */
    public int getTotalSales() {
        return this.countSales;
    }
}
