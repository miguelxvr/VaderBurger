
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
        Product products[] = new Product[100];
        Branch branches[] = new Branch[100];

        branches[0] = new Branch("Matriz", 200);
        branches[1] = new Branch("Filial 1", 100);
        branches[2] = new Branch("Filial 2", 50);

        products[0] = new Product(1, "SabreDeLuz", 20.00);
        products[1] = new Product(2, "Dart Burger", 28.00);
        products[2] = new Product(3, "Skywalker Burger", 30.00);
        products[3] = new Product(4, "Bauru-Yoda", 25.00);
        
        Branch b1 = branches[0];
        b1.sale(2);
        b1.sale(2);
        b1.sale(2);
    }
}