
/**
 * Write a description of class Loja here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BranchModel
{
    private String name;
    private int saleLimit;
    private int id;

    /**
     * Constructor for objects of class Loja
     */
    public BranchModel(int id, String name, int saleLimit)
    {
        this.id = id;
        this.name = name;
        this.saleLimit = saleLimit;
    }

    public int getId() {
        return this.id;
    }

    public String toString() {
        return "Id: " + this.id + " Razao Social: " + this.name + " Limite de Vendas: " + this.saleLimit;
    }
}
