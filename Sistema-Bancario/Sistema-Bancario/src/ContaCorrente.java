public class ContaCorrente extends Conta{
    private double limiteSaque;

    public ContaCorrente(String idConta, Cliente cliente, double saldoEmConta, double limiteSaque){
        super(idConta, cliente, saldoEmConta);
        this.limiteSaque = limiteSaque;
    }

    
    public double getLimiteSaque() {
        return limiteSaque;
    }
    public void setLimiteSaque(double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    
}
