
public class Rota {
    private double distancia;
    private String tipoEstrada;
    private String pontosParada; // pensar como implementar

    public Rota(double distancia, String tipoEstrada, String pontosParada) {
        this.distancia = distancia;
        this.tipoEstrada = tipoEstrada;
        this.pontosParada = pontosParada;
    }
    
    // Procurar se tem como formatar pra mostrar so duas casas decimais
    public void calcularTempoEstimado() {
        if(tipoEstrada.equalsIgnoreCase("ruim")){
            double tempo = distancia*2/60;
            System.out.printf("O tempo médio da viagem é de %.2f",tempo," horas \n");
        }else if(tipoEstrada.equalsIgnoreCase("medio")){
            double tempo = distancia*1.5/60;
            System.out.println("O tempo médio da viagem é de "+tempo+" horas");
        }else{
            double tempo = distancia/60;
            System.out.println("O tempo médio da viagem é de "+tempo+" horas");
        }
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getTipoEstrada() {
        return tipoEstrada;
    }

    public void setTipoEstrada(String tipoEstrada) {
        this.tipoEstrada = tipoEstrada;
    }

    public String getPontosParada() {
        return pontosParada;
    }

    public void setPontosParada(String pontosParada) {
        this.pontosParada = pontosParada;
    }

}