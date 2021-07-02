
/**
 * Write a description of class BranchView here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.Scanner;

public class BranchView
{
    private BranchController ctrl;

    public BranchView(BranchController branchController)
    {
        this.ctrl = branchController;
    }

    public void show()
    {
        boolean running = true;
        while(running) {
            System.out.println("Tela Lojas:");
            System.out.println("1 - Registrar uma loja");
            System.out.println("2 - Listar lojas");
            System.out.println("3 - Voltar");

            Scanner in = new Scanner(System.in);
            int escolha = in.nextInt(); 
            switch(escolha){
                case 1: 
                this.showBranchCreation();
                break; 
                case 2:
                this.showBranchList();
                break;
                case 3:
                running = false;
                break;
                default:
                System.out.println("Escolha inválida.");
                break;
            }
            in.close();
        }
    }

    private void showBranchCreation()
    {
        System.out.println("Informe os dados da loja:");
        Scanner in = new Scanner(System.in);

        System.out.print("Razao Social:");
        String name = in.nextLine();

        System.out.print("Limite de Vendas:");
        int saleLimit = Integer.parseInt(in.nextLine());        
        this.ctrl.create(name, saleLimit);
        in.close();
    }

    private void showBranchList()
    {
        this.ctrl.printBranches();
    }
}
