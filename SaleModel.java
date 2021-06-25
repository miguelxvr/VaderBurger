public class SaleModel
{
    private ProductModel products[];
    private int countProduct;
    private Status status;
    private BranchModel branchModel;

    public enum Status {
        INITIAL, OPEN, CONFIRMED
    }

    /**
     * Constructor for objects of class Venda
     */
    public SaleModel(BranchModel branchModel)
    {
        this.products = new ProductModel[100];
        this.countProduct = 0;
        this.status = Status.INITIAL;
        this.branchModel = branchModel;
    }

    public ProductModel[] getProducts() {
        return this.products;
    }

    public void setProducts(ProductModel[] products) {
        this.products = products;
        this.countProduct = products.length;
    }

    public void addProduct(ProductModel product) {
        this.products[this.countProduct] = product;
        this.countProduct++;
    }

    public void open() {
        this.status = Status.OPEN;
    }

    public void confirm() {
        this.status = Status.CONFIRMED;
    }
}
