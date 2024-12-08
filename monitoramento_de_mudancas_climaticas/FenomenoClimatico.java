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
    


    public String calcularImpactoAmbiental(){
                if(getTipo().equals("Chuva")){
                
                    if(this.intensidade < 2.5){
                        return "Chuva fraca";
                    }else if(this.intensidade >=2.5 && this.intensidade < 10.00){
                        return "Chuva moderada";
                    }else if(this.intensidade >=10.00 && this.intensidade < 50.00){
                        return "Chuva forte";
                    }else{
                        return "Chuva violenta";
                    }
            
               }else if(getTipo().equals("Terremoto")){
                    if(this.intensidade < 3.5){
                        return "Muito difícil de ser percebido";
                    }else if(this.intensidade >= 3.50 && this.intensidade < 5.4){
                        return "Percebidos com consequências modestas";
                    }else if(this.intensidade >= 5.4 && this.intensidade < 6.0){
                        return "Destruição significativa em edificações com construção frágeis";
                    }else if(this.intensidade >= 6.0 && this.intensidade < 7.0){
                        return "Destruição de tudo em um raio de 100 quilômetros";
                    }else if(this.intensidade >= 7.0 && this.intensidade < 7.9){
                        return "Surgimento de fendas";
                    }else if(this.intensidade >= 8.0 && this.intensidade < 8.9){
                        return "Destruição de todas as construções existentes";
                    }else{
                        return "Destruição total...";
                    }
                    
               }else{
                    return "Fenômeno não encontrado. Digite outro";     
              }
    }


   
    public void addArea(AreaGeografica area){
        areaAfetada.add(area);
    }


    public void listaAreaAfetada(){
        for (AreaGeografica areaAtual : areaAfetada) {
            System.out.println(areaAtual.getNome());
        }
    }

    @Override
    public void gerarRelatorio(){
        System.out.println("----------------------------");
        System.out.println("|  NFORMAÇÕES DO FENÕMENO  |");
        System.out.println("----------------------------");
        System.out.println("CATEGORIA: " +getTipo());
        System.out.println("INTENSIDADE: " +getIntensidade());
        System.out.println("DURAÇÃO DE: "+getDuracao());
        System.out.println("IMPACTO BASEADO NO TIPO: " +calcularImpactoAmbiental());
        System.out.println("lOCAIS AFETADOS: ");
            listaAreaAfetada();
            
    }



} 
