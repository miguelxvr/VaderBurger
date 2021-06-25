
/**
 * Write a description of class ProductController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProductController
{
    private ProductModel products[];
    private ProductView productView;
    private int countProducts;

    public ProductController(ProductView productView)
    {
        this.products = new ProductModel[100];
        this.productView = productView;
        this.countProducts = 0;
    }

    public ProductModel create(int id, String name, double price) {
        ProductModel product = new ProductModel(id, name, price);
        this.products[this.countProducts] = product;
        this.countProducts++;
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
}
