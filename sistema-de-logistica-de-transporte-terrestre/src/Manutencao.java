//package LogisticaTransporte;

public class Manutencao implements Notificacao{
    private String data;
    private double custo;
    private String tipo;
    private Veiculo veiculo;

    public Manutencao(String data, double custo, String tipo, Veiculo veiculo) {
        this.data = data;
        this.custo = custo;
        this.tipo = tipo;
        this.veiculo = veiculo;
    }
    
    //Talvez adicionar uma ligaçao com o veiculo que foi feita a manutençao
    public void detalhesManutencao(){
        System.out.println("------------------------------");
        System.out.println("O veiculo de placa "+veiculo.getPlaca()+" se encontgra em manutenção.");
        System.out.println("Data da manutenção: "+data);
        System.out.println("O custo foi de: "+custo+" reais");
        System.out.println("O tipo de manutenção feita foi "+tipo);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void notifica(String remetenteEmail, String titulo){
        System.out.println("------------------------------");
        System.out.println("De: "+remetenteEmail);
        System.out.println("Titulo: "+titulo);
        System.out.println("Veiculo se encontra na manutenção por causa de: "+tipo);
        //System.out.println("------------------------------");
    }

    public void notifica(int numeroRemetente){
        System.out.println("------------------------------");
        System.out.println("Mensagem de: "+numeroRemetente);
        System.out.println("Veiculo na manutenção por causa de: "+tipo);
        //System.out.println("------------------------------");
    }

}
