
public class Manutencao {
    private String data;
    private double custo;
    private String tipo;

    public Manutencao(String data, double custo, String tipo) {
        this.data = data;
        this.custo = custo;
        this.tipo = tipo;
    }
    
    //Talvez adicionar uma ligaçao com o veiculo que foi feita a manutençao
    public void detalhesManutencao(){
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
    
    
}