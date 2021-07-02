
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
    private SaleModel sale;

    public SaleView(BranchController branchController, SaleController saleController, ProductController productController)
    {
        this.branchCtrl = branchController;
        this.saleCtrl = saleController;
        this.productCtrl = productController;
    }

    public void show()
    {
        boolean running = true;
        while(running) {
            System.out.println("Tela PDV:");
            System.out.println("1 - Realizar uma venda");
            System.out.println("2 - Voltar");

            Scanner in = new Scanner(System.in);
            int escolha = in.nextInt(); 
            switch(escolha){
                case 1: 
                this.showBranchSelect();
                this.showProductAdd();
                this.showSaleConfirm();
                break; 
                case 2:
                running = false;
                break;
                default:
                System.out.println("Escolha inválida.");
                break;
            }
            in.close();
        }
    }

    private void showBranchSelect()
    {
        BranchModel branch;

        Scanner in = new Scanner(System.in);

        System.out.print("Informe o Id da Loja:");
        int branchId =  Integer.parseInt(in.nextLine());
        branch = branchCtrl.read(branchId);
        this.sale = saleCtrl.create(branch);

        in.close();
    }

    private void showProductAdd()
    {
        System.out.println("Lista de produtos");

        productCtrl.printProducts();
        System.out.print("Informe -1 para concluir.");

        while(true) {
            System.out.print("Escolha o produto:");

            Scanner in = new Scanner(System.in);
            int productId =  Integer.parseInt(in.nextLine());
            in.close();

            if(productId == -1)
                break;

            ProductModel product = productCtrl.read(productId);
            this.saleCtrl.addProduct(this.sale, product);
        }
    }

    private void showSaleConfirm()
    {

        this.saleCtrl.confirm(sale);

        System.out.println("Venda Confirmada.");
    }
}
