import java.util.Scanner;

public class Menu
{
    public static void showMainMenu()
    {
        System.out.println("Seja bem-vindo à Vader Lord!"); 
        System.out.println("Menu de opções:");
        System.out.println("1 - Venda");
        System.out.println("2 - Relatorio");

        Scanner in = new Scanner(System.in);
        int escolha = in.nextInt(); 
        switch(escolha){
            case 1: 
            Menu.showSaleMenu();
            break; 
            case 2:
            Menu.showReportMenu();
            break;
            default:
            System.out.println("Escolha inválida. Por favor, insira um número de 1 a 9");
            break;
        } 
        in.close();
    }

    public static void showSaleMenu()
    {
        System.out.println("Menu de opções:");
        System.out.println("1 - Registrar uma venda");
        System.out.println("2 - Voltar");

        Scanner in = new Scanner(System.in);
        int escolha = in.nextInt(); 
        switch(escolha){
            case 1: 
            break; 
            default:
            System.out.println("Escolha inválida. Por favor, insira um número de 1 a 9");
            break;
        } 
        in.close();
    }

    public static void showReportMenu()
    {
        System.out.println("Menu de opções:");
        System.out.println("1 - Total de vendas de todas as lojas");
        System.out.println("2 - Lanche mais vendido");
        System.out.println("3 - Lanche menos vendido");
        System.out.println("4 - Diferença de arrecadação dos lanches mais e menos vendidos");
        System.out.println("5 - A venda com mais lanches vendidos para cada loja");
        System.out.println("6 - A venda com mais lanches vendidos entre todas as lojas");
        System.out.println("7 - Vetor (10 posições) com somas das 10 maiores vendas em ordem decrescente");
        System.out.println("8 - Voltar");

        Scanner in = new Scanner(System.in);
        int escolha = in.nextInt(); 
        switch(escolha){
            case 1:
            break; 
            default:
            System.out.println("Escolha inválida. Por favor, insira um número de 1 a 9");
            break;
        } 
        in.close();
    }
}
