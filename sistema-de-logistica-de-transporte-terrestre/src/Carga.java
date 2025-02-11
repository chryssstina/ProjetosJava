public abstract class Carga{
    protected double peso;
    protected String tipoCarga;
    protected double valor;

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

    public abstract void valorSeguro();


}
