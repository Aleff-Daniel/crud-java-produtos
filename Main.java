import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProdutoService service = new ProdutoService();
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("==== MENU ====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Buscar produto");
            System.out.println("4 - Remover produto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                service.cadastrarProduto();
                break;

                case 2:
                service.listarProdutos();
                break;

                case 3:
                service.buscarProduto();
                break;

                case 4:
                service.removerProduto();
                break;

                case 0:
                System.out.println("Encerrando...");
                break;
                default:
                System.out.println("Opção inválida!\n");
            }
        } while (opcao != 0);
        scanner.close();
    }
}