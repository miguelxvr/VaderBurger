public class Sale
{
    private int products[];
    private int countProduct;
    private Status status;

    public enum Status {
        INITIAL, OPEN, CONFIRMED
    }

    /**
     * Constructor for objects of class Venda
     */
    public Sale()
    {
        this.products = new int[10];
        this.countProduct = 0;
        this.status = Status.INITIAL;
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

    public void open() {
        this.status = Status.OPEN;
    }

    public void confirm() {
        this.status = Status.CONFIRMED;
    }

}
