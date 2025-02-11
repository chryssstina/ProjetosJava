//package LogisticaTransporte;

public class Rota {
    private double distancia;
    private String tipoEstrada;
    private String pontosParada; // pensar como implementar

    public Rota(double distancia, String tipoEstrada, String pontosParada) {
        this.distancia = distancia;
        this.tipoEstrada = tipoEstrada;
        this.pontosParada = pontosParada;
    }
    
    public void calcularTempoEstimado() {
        if(tipoEstrada.equalsIgnoreCase("ruim")){
            double tempo = (distancia*2)/60;
            System.out.printf("O tempo médio da viagem é de %.2f horas \n",tempo);
        }else if(tipoEstrada.equalsIgnoreCase("medio")){
            double tempo = (distancia*1.5)/60;
            System.out.printf("O tempo médio da viagem é de %.2f horas \n",tempo);
        }else if(tipoEstrada.equalsIgnoreCase("boa")){
            double tempo = distancia/60;
            System.out.printf("O tempo médio da viagem é de %.2f horas \n",tempo);
        }else{
            System.out.println("O tipo da estrada está invalido");
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
