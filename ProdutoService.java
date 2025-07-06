import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoService {
    private ArrayList<Produto> produtos = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void cadastrarProduto() {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade em estoque: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); //Limpar o buffer
        Produto novoProduto = new Produto (nome, preco, quantidade);
        produtos.add(novoProduto);

        System.out.println("Produto cadastrado com sucesso!\n");
    }

    public void listarProdutos() {
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado\n");
        } else {
            for (Produto p: produtos) {
                p.exibirInfo();
            }
        }

    }
    public void buscarProduto() {
        System.out.println("Digite o nome do produto que deseja buscar: ");
        String nomeBusca = scanner.nextLine();

        boolean encontrado = false;
        for (Produto p: produtos) {
            if (p.getNome().equalsIgnoreCase(nomeBusca)) {
                p.exibirInfo();
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("Produto não encontrado\n");
        }
    }
    public void removerProduto() {
        System.out.println("Digite o nome do produto que deseja remover: ");
        String nomeRemover = scanner.nextLine();

        boolean removido = produtos.removeIf(p -> p.getNome().equalsIgnoreCase(nomeRemover));
        if (removido) {
            System.out.println("Produto removido com sucesso\n");
        } else {
            System.out.println("Produto não encontrado\n");
        }
    }
}
