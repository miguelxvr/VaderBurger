
/**
 * Write a description of class BranchController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BranchController
{
    private BranchModel[] branches; 
    private BranchView branchView;
    private int countBranches;

    public BranchController(BranchView branchView)
    {
        this.branches = new BranchModel[100];
        this.branchView = branchView;
    }

    public void create(int id, String name, int saleLimit) {
        BranchModel branch = new BranchModel(id, name, saleLimit);
        this.branches[this.countBranches] = branch;
        this.countBranches++;
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
}
