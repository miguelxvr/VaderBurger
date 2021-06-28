
/**
 * Write a description of class SaleView here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class SaleView
{
    private BranchController branchCtrl;
    private SaleController saleCtrl;
    private ProductController productCtrl;

    public SaleView(BranchController branchController, SaleController saleController, ProductController productController)
    {
        this.branchCtrl = branchController;
        this.saleCtrl = saleController;
        this.productCtrl = productController;
    }

    public void show()
    {
        System.out.println("Informe os dados da venda:");
        Scanner in = new Scanner(System.in);
        String params = in.nextLine(); 
        BranchModel branch = branchCtrl.read(2);
        SaleModel sale = saleCtrl.create(branch);

        ProductModel product;
        product = productCtrl.read(1);
        saleCtrl.addProduct(sale, product);

        product = productCtrl.read(2);
        saleCtrl.addProduct(sale, product);

        product = productCtrl.read(3);
        saleCtrl.addProduct(sale, product);

        saleCtrl.confirm(sale);
        in.close();
    }
}
