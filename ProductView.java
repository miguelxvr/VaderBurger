
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
        System.out.println("Informe os dados do produto:");
        Scanner in = new Scanner(System.in);
        String params = in.nextLine(); 
        this.ctrl.create(1, "SabreDeLuz", 20.00);
        in.close();
    }
}
