import java.util.List;
import java.util.ArrayList;

public class Cliente {
    private String nome;
    private List<Pedido> pedidosRealizados;

    public Cliente(String nome) {
        this.nome = nome;
        this.pedidosRealizados = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Pedido> getPedidosRealizados() {
        return pedidosRealizados;
    }

    public void setPedidosRealizados(List<Pedido> pedidosRealizados) {
        this.pedidosRealizados = pedidosRealizados;
    }

    public void addPedido(Pedido pedido){
        pedidosRealizados.add(pedido);
    }

    public void exibirInformacoesCliente(){
        System.out.println("Nome: "+getNome());
        System.out.println("Lista de pedidos feitos: ");
            for (Pedido pedidoAtual : pedidosRealizados) {
                System.out.println(pedidoAtual.getIdPedido());
            }
    }
}
