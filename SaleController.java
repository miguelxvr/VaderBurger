
/**
 * Write a description of class SaleController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SaleController
{
    private SaleModel[] sales;
    private SaleView saleView;
    private int countSales;

    public SaleController(SaleView saleView)
    {
        this.sales = new SaleModel[100];
        this.saleView = saleView;
        this.countSales = 0;
    }

    public SaleModel create(BranchModel branchModel) {
        SaleModel sale = new SaleModel(branchModel);
        sale.open();
        
        this.sales[this.countSales] = sale;
        this.countSales++;
        return sale;
    }

    public void addProduct(SaleModel sale, ProductModel productModel) {
        sale.addProduct(productModel);
    }
    
    public void confirm(SaleModel saleModel) {
        saleModel.confirm();
    }
}
