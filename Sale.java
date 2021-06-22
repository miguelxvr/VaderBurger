public class Sale
{
    private int products[];
    private int countProduct;

    /**
     * Constructor for objects of class Venda
     */
    public Sale()
    {
        this.products = new int[10];
        this.countProduct = 0;
    }

    public int[] getProducts() {
        return this.products;
    }

    public void setProducts(int[] products) {
        this.products = products;
        this.countProduct = products.length;
    }

    public void addProduct(int productId) {
        this.products[this.countProduct] = productId;
        this.countProduct++;
    }
}
