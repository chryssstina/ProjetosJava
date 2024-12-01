import java.util.List;
import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private List<Pedido> listaPedidos;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.listaPedidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public void setListaPedidos(List<Pedido> listaPedidos) {
        this.listaPedidos = listaPedidos;
    }

    
    public void exibirInformacoesProduto(){
        System.out.println("Produto: "+getNome());
        System.out.println("Preço: " +getPreco()+ " R$");
    }
    
    //um mesmo produto pode está em diferentes pedidos
    public void addPedidosComProduto(Pedido pedido){
        listaPedidos.add(pedido);
    }

    //mostra em quais diferentes pedidos um produto-item está
    public void exibirListaPedidosDoProduto(){
        System.out.println("O produto " +getNome()+ " faz parte dos seguintes pedidos: ");
        for (Pedido pedidoAtual : listaPedidos) {
            System.out.println(pedidoAtual.getIdPedido());
            
        }
    }
}
