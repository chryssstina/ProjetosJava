public class Viagem {
    public Endereco origem;
    public Endereco destino;
    public String dataSaida;
    public Carga carga;

    public Viagem(Endereco origem, Endereco destino, String dataSaida, Carga carga) {

        Utils.validaNull(origem);
        Utils.validaNull(destino);
        Utils.validaNull(dataSaida);
        Utils.validaNull(carga);
        this.origem = origem;
        this.destino = destino;
        this.dataSaida = dataSaida;
        this.carga = carga;
    }

    public Endereco getOrigem() {
        return origem;
    }

    public void setOrigem(Endereco origem) {
        Utils.validaNull(origem);
        this.origem = origem;
    }

    public Endereco getDestino() {
        return destino;
    }

    public void setDestino(Endereco destino) {
        Utils.validaNull(destino);
        this.destino = destino;
    }

    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        Utils.validaNull(dataSaida);
        this.dataSaida = dataSaida;
    }

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        Utils.validaNull(carga);
        this.carga = carga;
    }
    
    
    
}
