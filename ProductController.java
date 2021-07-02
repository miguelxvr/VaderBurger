
/**
 * Write a description of class ProductController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProductController
{
    private ProductModel products[];
    private int countProducts;
    private int countId;

    public ProductController()
    {
        this.products = new ProductModel[100];
        this.countProducts = 0;
        this.countId = 1;
    }

    public ProductModel create(String name, double price) {
        ProductModel product = new ProductModel(this.countId, name, price);
        this.products[this.countProducts] = product;
        this.countProducts++;
        this.countId++;
        return product;
    }

    public ProductModel read(int id) {
        for(int i = 0; i < this.countProducts; i++) {
            if(this.products[i].getId() == id)
                return this.products[i];
        }
        return null;
    }

    public ProductModel[] list() {
        return this.products;
    }

    public void printProducts() {
        for(int i = 0; i < this.countProducts; i++) {
            System.out.println(this.products[i].toString());
        }
    }
}
