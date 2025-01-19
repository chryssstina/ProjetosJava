public class ContaCorrente extends Conta{
    private double limiteExtraSaque;

    public ContaCorrente(String idConta, Cliente cliente, double saldoEmConta){
        super(idConta, cliente, saldoEmConta);
        this.limiteExtraSaque = limiteExtraSaque;
    }

    
    public double getLimiteExtraSaque() {
        return limiteExtraSaque;
    }
    public void setLimiteExtraSaque(double limiteExtraSaque) {
        this.limiteExtraSaque = limiteExtraSaque;
    }

    @Override
    public double valorTotalPermitidoSaque(){
        double valorTotalPermitidoSaque = getLimiteExtraSaque() + getSaldoEmConta();
        return valorTotalPermitidoSaque;
    }


    public void calculoLimiteSaque(){
        setLimiteExtraSaque(getSaldoEmConta()/2);
        //double valorTotalPermitidoSaque = getLimiteExtraSaque() + getSaldoEmConta();

        System.out.println("Seu limite especial é de R$ " +getLimiteExtraSaque());
        System.out.println("Você pode sacar no máximo R$ " +valorTotalPermitidoSaque());
        //ex.: ana tem 300, seu limite extra é de 150, seu saque máximo permitido é de 450
    }



}
