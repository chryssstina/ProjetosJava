import java.util.List;
import java.util.ArrayList;

public class Pedido {
    private String idPedido;
    private Cliente cliente;
    private List<Produto> itens;
    //private Pagamento pagamento;

    public Pedido(String idPedido, Cliente cliente) {
        this.idPedido = idPedido;
        this.cliente = cliente;
        this.itens = new ArrayList<>();
    }

    public String getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(String idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public List<Produto> getItens() {
        return itens;
    }

    public void setItens(List<Produto> itens) {
        this.itens = itens;
    }
    
    //adicionando um item-produto a um pedido do cliente
    public void addProduto(Produto produto){
        itens.add(produto);
        produto.addPedidosComProduto(this);
    }

    //exibindo a lista de produtos que estão presentes em um pedidos
    public void exibirListaProdutosdoPedido(){
        System.out.println("O  pedido " +getIdPedido()+ " tem os itens : ");
        for (Produto itemAtual : itens) {
            System.out.println(itemAtual.getNome());
        }
    }
    
    public double valorTotal(){
        double valorTotal = 0.0;
        for (Produto produtoAtual : itens) {
            valorTotal += produtoAtual.getPreco();
       }
       return valorTotal;
    }

    public void exibirInformacoesPedido(){
        System.out.println("ID do pedido: "+getIdPedido());
        System.out.println("Pedido feito por: "+getCliente().getNome());
        System.out.println("Valor total: "+valorTotal());

    }
}
