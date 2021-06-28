
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
            System.out.println("Menu de opções (Loja):");
            System.out.println("1 - Registrar uma loja");
            System.out.println("2 - Listar lojas");
            System.out.println("3 - Voltar");

            Scanner in = new Scanner(System.in);
            int escolha = in.nextInt(); 
            switch(escolha){
                case 1: 
                this.showBranchCreate();
                break; 
                case 2:
                this.ctrl.printBranches();
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

    private void showBranchCreate()
    {
        System.out.println("Informe os dados da loja:");
        Scanner in = new Scanner(System.in);
        String params = in.nextLine(); 
        this.ctrl.create(1, "Matriz", 200);
        in.close();
    }
}
