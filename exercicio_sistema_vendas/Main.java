public class Main {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("João");
        Cliente cliente2 = new Cliente("Marcos");

        Produto produto1 = new Produto("Chinelo", 40.00);
        Produto produto2 = new Produto("Arroz", 5.00);
        Produto produto3 = new Produto("Copo", 3.00);

        System.out.println("------ Pedido 1 do cliente 1");
        Pedido pedido1 = new Pedido("1234", cliente1);
        pedido1.addProduto(produto1);
        pedido1.addProduto(produto3);
        pedido1.exibirInformacoesPedido();
        System.out.println();
        
        Pagamento pagamento1 = new Pagamento("123", cliente1, "Dinheiro", pedido1);
        pagamento1.exibirInformacoesPagamento();
        System.out.println();


        System.out.println("------ Pedido 2 do cliente 2");
        Pedido pedido2 = new Pedido("4567", cliente2);
        pedido2.addProduto(produto1);
        pedido2.addProduto(produto2);
        pedido2.exibirInformacoesPedido();
        System.out.println();
        
        Pagamento pagamento2 = new Pagamento("456", cliente2, "Cartão", pedido2);
        pagamento2.exibirInformacoesPagamento();
        System.out.println();
        
        
        System.out.println("------ Pedido 3 do cliente 1");
        Pedido pedido3 = new Pedido("7890", cliente1);
        pedido3.addProduto(produto2);
        pedido3.addProduto(produto3);
        pedido3.exibirInformacoesPedido();
        System.out.println();
        
        Pagamento pagamento3 = new Pagamento("789", cliente1, "Pix", pedido2);
        pagamento2.exibirInformacoesPagamento();
        System.out.println();
        
        System.out.println("------ Lista de pedidos feito pelo cliente 1 (João)");
        cliente1.addPedido(pedido1);
        cliente1.addPedido(pedido2);
        cliente1.exibirInformacoesCliente();
        
        
         System.out.println("------ Lista dos itens presentes em um pedido");
         pedido1.exibirListaProdutosdoPedido();
    }
}
