public class FenomenoClimatico{
    private String nome;
    private double intensidade;
    private double duracao;
    //private AreaGeografica areaAfetada;
    
    public FenomenoClimatico(String nome, double intensidade, double duracao) {
        this.nome = nome;
        this.intensidade = intensidade;
        this.duracao = duracao;
      //  this.areaAfetada = areaAfetada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getIntensidade() {
        return intensidade;
    }

    public void setIntensidade(double intensidade) {
        this.intensidade = intensidade;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

  //  public AreaGeografica getAreaAfetada() {
    //    return areaAfetada;
  //  }

//    public void setAreaAfetada(AreaGeografica areaAfetada) {
//        this.areaAfetada = areaAfetada;
//    }


public void calcularImpacto(){
        if(this.getNome().equals("Chuva")){
          
                if(this.intensidade < 2.5){
                    System.out.println("Chuva fraca");
                }else if(this.intensidade >=2.5 && this.intensidade < 10.00){
                    System.out.println("Chuva moderada");
                }else if(this.intensidade >=10.00 && this.intensidade < 50.00){
                    System.out.println("Chuva forte");
                }else{
                    System.out.println("Chuva violenta");
                }
          
        }else if(this.getNome().equals("Terremoto")){
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
                System.out.println("Fenômeno não encontrado");     
        }

        
}



}
