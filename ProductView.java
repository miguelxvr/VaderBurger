
/**
 * Write a description of class ProductView here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class ProductView
{
    private ProductController ctrl;

    public ProductView(ProductController productController)
    {
        this.ctrl = productController;
    }

    public void show()
    {
        boolean running = true;
        while(running) {
            System.out.println("Tela Produtos:");
            System.out.println("1 - Registrar um produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Voltar");

            Scanner in = new Scanner(System.in);
            int escolha = in.nextInt(); 
            switch(escolha){
                case 1: 
                this.showProductCreation();
                break; 
                case 2:
                this.showProductList();
                break;
                case 3:
                running = false;
                break;
                default:
                System.out.println("Escolha inválida.");
                break;
            }
            in.close();
        }
    }

    private void showProductCreation()
    {
        System.out.println("Informe os dados do produto:");
        Scanner in = new Scanner(System.in);

        System.out.print("Nome:");
        String name = in.nextLine();

        System.out.print("Preco:");
        double price = Double.parseDouble(in.nextLine());       

        this.ctrl.create(name, price);
        in.close();
    }

    private void showProductList()
    {
        this.ctrl.printProducts();
    }
}
