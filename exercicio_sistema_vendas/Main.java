public class Main {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Marcos");

        Produto produto1 = new Produto("Chinelo", 40.00);
        Produto produto2 = new Produto("Arroz", 5.00);
        Produto produto3 = new Produto("Copo", 3.00);

        Pedido pedido1 = new Pedido("1234", cliente1);
        pedido1.addProduto(produto1);
        pedido1.addProduto(produto3);

        pedido1.valorTotal();
        pedido1.exibirInformacoesPedido();

        Pedido pedido2 = new Pedido("4567", cliente2);
        pedido2.addProduto(produto1);
        pedido2.addProduto(produto2);

        pedido2.valorTotal();
        pedido2.exibirInformacoesPedido();

        Pagamento pagamento1 = new Pagamento("123", cliente1, "Dinheiro", pedido1);
        pagamento1.exibirInformacoesPagamento();
    }
}
