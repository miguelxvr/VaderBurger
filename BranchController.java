
/**
 * Write a description of class BranchController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BranchController
{
    private BranchModel[] branches; 
    private int countBranches;
    private int countId;

    public BranchController()
    {
        this.branches = new BranchModel[100];
        this.countBranches = 0;
        this.countId = 1;
    }

    public void create(String name, int saleLimit) {
        BranchModel branch = new BranchModel(this.countId, name, saleLimit);
        this.branches[this.countBranches] = branch;
        this.countBranches++;
        this.countId++;
    }

    public BranchModel read(int id) {
        for(int i = 0; i < this.countBranches; i++) {
            if(this.branches[i].getId() == id)
                return this.branches[i];
        }
        return null;
    }

    public BranchModel[] list() {
        return this.branches;
    }
    
    public void printBranches() {
        for(int i = 0; i < this.countBranches; i++) {
            System.out.println(this.branches[i].toString());
        }
    }
}
