public abstract class Conta implements Transacao {
    private String idConta;
    private Cliente cliente;
    private double saldoEmConta;
    
    public Conta(String idConta, Cliente cliente, double saldoEmConta) {
        this.idConta = idConta;
        this.cliente = cliente;
        this.saldoEmConta = saldoEmConta;
    }

    public String getIdConta() {
        return idConta;
    }
    public void setIdConta(String idConta) {
        this.idConta = idConta;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public double getSaldoEmConta() {
        return saldoEmConta;
    }
    public void setSaldoEmConta(double saldoEmConta) {
        this.saldoEmConta = saldoEmConta;
    }
    

    public void realizarTranferencia(Conta contaClienteOrigem, Conta contaClienteDestino, double valorTranferencia){
        if(contaClienteOrigem == null || contaClienteDestino == null || valorTranferencia == 0){
            System.out.println("Atenção! Você não pode digitar valores nulos!");

        }else if(valorTranferencia > contaClienteOrigem.getSaldoEmConta()){
            System.out.println("O cliente de origem não tem saldo suficiente para realizar a transferência");

        }else{
            contaClienteOrigem.setSaldoEmConta(contaClienteOrigem.getSaldoEmConta() - valorTranferencia);
            contaClienteDestino.setSaldoEmConta(contaClienteDestino.getSaldoEmConta() + valorTranferencia);

            System.out.println("Tranferência de " +valorTranferencia+ " realizada com sucesso! Saldos após tranferência: ");

            //de trás pra frente: pegar nome do cliente da classe Cliente do cliente de origem
            System.out.println("Cliente de origem: " +contaClienteOrigem.getCliente().getNomeCliente());
            System.out.println("Novo Saldo: R$" +contaClienteOrigem.getSaldoEmConta());

            System.out.println("Cliente de destino: " +contaClienteDestino.getCliente().getNomeCliente());
            System.out.println("Novo Saldo: R$" +contaClienteDestino.getSaldoEmConta());

        }

    }


    @Override
    public void depositarValor(double valor){
        if (valor <= 0 ) {
            System.out.println("Você não pode realizar o depósito de um valor nulo ou negativo :(");    
        }else{
            saldoEmConta = getSaldoEmConta() + valor;
            System.out.println("Depósito de R$" +valor+ " realizado."); 
        }
    }

    public abstract double valorTotalPermitidoSaque();
    //conta corrente corrente vai ter um limite extra para saque

    @Override
    public void sacarValor(double valor){
        double valorTotalPermitidoSaque = valorTotalPermitidoSaque();

        if (valor <= 0) {
            System.out.println("Você não pode realizar o saque de um valor nulo ou negativo");    
        }else if(getSaldoEmConta() <= 0 || valor > valorTotalPermitidoSaque){
            System.out.println("Você não tem dinheiro suficiente em conta ou o valor excede seu limite de saque");
        }else{
            saldoEmConta = getSaldoEmConta() - valor;
            System.out.println("Saque de R$" +valor+ " realizado"); 
        }
    }

    
}
