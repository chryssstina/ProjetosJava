public class Carga{
    private double peso;
    private String tipoCarga;
    private double valor;

    public Carga(double peso, String tipoCarga, double valor){
        this.peso = peso;
        this.tipoCarga = tipoCarga;
        this.valor = valor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipoCarga() {
        return tipoCarga;
    }

    public void setTipoCarga(String tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void valorSeguro(){
      
    }


}