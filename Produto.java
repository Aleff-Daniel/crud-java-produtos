public class Produto {
    private String nome;
    private double preco;
    private int quantidade;
    
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }
    
    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    
    public void exibirInfo() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço R$: " + preco);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("------------------------");
    }
}
