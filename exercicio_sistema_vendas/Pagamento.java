

public class Pagamento {
    private String idPagamento;
    private Cliente cliente;
    private Pedido pedido;
    private String metodoPagamento;

    public Pagamento(String idPagamento, Cliente cliente, String metodoPagamento, Pedido pedido) {
        this.idPagamento = idPagamento;
        this.cliente = cliente;
        this.metodoPagamento = metodoPagamento;
        this.pedido = pedido;
    }

    public String getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(String idPagamento) {
        this.idPagamento = idPagamento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public String getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void exibirInformacoesPagamento(){
        System.out.println("Identificação do pagamento: "+getIdPagamento());
        System.out.println("Pertence a: "+getCliente().getNome());
        System.out.println("Referente ao pedido nº "+getPedido().getIdPedido());
        System.out.println("Pago via "+getMetodoPagamento());
    }
    
}
