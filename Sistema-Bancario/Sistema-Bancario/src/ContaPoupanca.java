public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(String idConta, Cliente cliente, double saldoEmConta, double taxaJuros){
        super(idConta, cliente, saldoEmConta);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }
    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public double valorTotalPermitidoSaque(){
        return getSaldoEmConta();
    };

    public void calculoRendimento(){
        double rendimento = getSaldoEmConta() * taxaJuros;
        setSaldoEmConta(rendimento + getSaldoEmConta());
        System.out.println("Sua conta rendeu R$" +rendimento+ ". Seu saldo agora é de R$ " +getSaldoEmConta());
    }
}
