public class SistemaBancario {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Banco banco_santander = new Banco("Santander");
        Banco banco_bradesco = new Banco("Bradesco");

        Cliente cliente1 = new Cliente("Ana Maria", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Antonieta", "234.567.456-32");
        Cliente cliente3 = new Cliente("Napoleão Bonaparte", "634.356.224-54");

        ContaCorrente conta1 = new ContaCorrente("246", cliente1,2350, 100);
        ContaCorrente conta2 = new ContaCorrente("672", cliente2, 8700, 3000);
        ContaPoupanca conta3 = new ContaPoupanca("837", cliente2, 4325, 2.0);
        ContaCorrente conta4 = new ContaCorrente("199", cliente3, 245, 300);

        cliente1.addNovaConta(conta1);
        cliente2.addNovaConta(conta2);
        cliente2.addNovaConta(conta3);
        cliente3.addNovaConta(conta4);

        banco_santander.addClientes(cliente1);
        banco_santander.addClientes(cliente2);
        banco_bradesco.addClientes(cliente2);
        banco_bradesco.addClientes(cliente3);

        conta1.depositarValor(300);
        System.out.println();
        conta2.sacarValor(500);
        System.out.println();
        conta3.depositarValor(100);
        System.out.println();
        conta4.depositarValor(500);
        System.out.println();
        conta3.calculoRendimento();
        System.out.println();
        conta1.realizarTranferencia(conta1, conta2,200);

    }   
}
