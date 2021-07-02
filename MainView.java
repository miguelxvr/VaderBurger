import java.util.Scanner;

public class MainView
{
    private BranchView branchView;
    private ProductView productView;
    private SaleView saleView;

    public MainView(BranchView branchView, ProductView productView, SaleView saleView) {
        this.branchView = branchView;
        this.productView = productView;
        this.saleView = saleView;
    }

    public void show()
    {
        boolean running = true;

        while(running) {
            System.out.println("Seja bem-vindo à Vader Lord!"); 
            System.out.println("Menu de opções:");
            System.out.println("1 - Lojas");
            System.out.println("2 - Produtos");
            System.out.println("3 - Ponto de Vendas");
            System.out.println("4 - Sair");

            Scanner in = new Scanner(System.in);
            int escolha = in.nextInt(); 
            switch(escolha){
                case 1: 
                this.branchView.show();
                break; 
                case 2:
                this.productView.show();
                break;
                case 3:
                this.saleView.show();
                break;
                case 4:
                running = false;
                break;
                default:
                System.out.println("Escolha inválida. Por favor, insira um número de 1 a 9");
                break;
            }
            in.close();
        }
    }

    // public static void showReportMenu()
    // {
    // System.out.println("Menu de opções:");
    // System.out.println("1 - Total de vendas de todas as lojas");
    // System.out.println("2 - Lanche mais vendido");
    // System.out.println("3 - Lanche menos vendido");
    // System.out.println("4 - Diferença de arrecadação dos lanches mais e menos vendidos");
    // System.out.println("5 - A venda com mais lanches vendidos para cada loja");
    // System.out.println("6 - A venda com mais lanches vendidos entre todas as lojas");
    // System.out.println("7 - Vetor (10 posições) com somas das 10 maiores vendas em ordem decrescente");
    // System.out.println("8 - Voltar");

    // Scanner in = new Scanner(System.in);
    // int escolha = in.nextInt(); 
    // switch(escolha){
    // case 1:
    // break; 
    // default:
    // System.out.println("Escolha inválida. Por favor, insira um número de 1 a 9");
    // break;
    // } 
    // in.close();
    // }
}
