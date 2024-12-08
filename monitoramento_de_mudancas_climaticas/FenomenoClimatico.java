import java.util.ArrayList;
import java.util.List;

public class FenomenoClimatico implements Monitoravel{
    private String tipo;
    private double intensidade;
    private String duracao;
    private List<AreaGeografica> areaAfetada;

    public FenomenoClimatico(String tipo, double intensidade, String duracao) {
        this.tipo = tipo;
        this.intensidade = intensidade;
        this.duracao = duracao;
        this.areaAfetada = new ArrayList<>();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(double intensidade) {
        this.intensidade = intensidade;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public List<AreaGeografica> getAreaAfetada() {
        return areaAfetada;
    }

    public void setAreaAfetada(List<AreaGeografica> areaAfetada) {
        this.areaAfetada = areaAfetada;
    }
    


    public void calcularImpactoAmbiental(){
                if(getTipo().equals("Chuva")){
                
                    if(this.intensidade < 2.5){
                        System.out.println("Chuva fraca");
                    }else if(this.intensidade >=2.5 && this.intensidade < 10.00){
                        System.out.println("Chuva moderada");
                    }else if(this.intensidade >=10.00 && this.intensidade < 50.00){
                        System.out.println("Chuva forte");
                    }else{
                        System.out.println("Chuva violenta");
                    }
            
               }else if(getTipo().equals("Terremoto")){
                    if(this.intensidade < 3.5){
                        System.out.println("Muito difícil de ser percebido");
                    }else if(this.intensidade >= 3.50 && this.intensidade < 5.4){
                        System.out.println("Percebidos com consequências modestas");
                    }else if(this.intensidade >= 5.4 && this.intensidade < 6.0){
                        System.out.println("Destruição significativa em edificações com construção frágeis");
                    }else if(this.intensidade >= 6.0 && this.intensidade < 7.0){
                        System.out.println("Destruição de tudo em um raio de 100 quilômetros");
                    }else if(this.intensidade >= 7.0 && this.intensidade < 7.9){
                        System.out.println("Surgimento de fendas");
                    }else if(this.intensidade >= 8.0 && this.intensidade < 8.9){
                        System.out.println("Destruição de todas as construções existentes");
                    }else{
                        System.out.println("Destruição total...");
                    }
                    
               }else{
                    System.out.println("Fenômeno não encontrado. Digite outro");     
              }
    }


   
    public void addArea(AreaGeografica area){
        areaAfetada.add(area);
    }

    @Override
    public void gerarRelatorio(){
        System.out.println("Nome do fenômeno: " +getTipo());
        System.out.println("Intensidade: " +getIntensidade());
        System.out.println("Duração de: "+getDuracao());
        System.out.println("Afetou os seguintes locais: ");
            for (AreaGeografica areaAtual : areaAfetada) {
                System.out.println(areaAtual.getNome());
            }
    }



} 
