
/**
 * Write a description of class App here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class App
{
    public static void main(String args[]) {

        BranchController branchCtrl = new BranchController(new BranchView());
        ProductController productCtrl = new ProductController(new ProductView());
        SaleController saleCtrl = new SaleController(new SaleView());

        /*
         * CRUD Branch
         */

        branchCtrl.create(1, "Matriz", 200);
        branchCtrl.create(2, "Filial 1", 300);
        branchCtrl.create(3, "Filial 2", 50);

        /*
         * CRUD Product
         */

        productCtrl.create(1, "SabreDeLuz", 20.00);
        productCtrl.create(2, "Dart Burger", 28.00);
        productCtrl.create(3, "Skywalker Burger", 30.00);
        productCtrl.create(4, "Bauru-Yoda", 25.00);

        /*
         * CRUD Sale
         */

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

        /*
         * Relatoris
         */
        BranchModel[] branches = branchCtrl.list();
        BranchReport.reportTotalSales(branches);
    }
}