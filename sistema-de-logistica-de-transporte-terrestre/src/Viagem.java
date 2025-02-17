public class Viagem {
    private Endereco origem;
    private Endereco destino;
    private String dataSaida;
    private Carga carga;
    private Rota rota;

    public Viagem(Endereco origem, Endereco destino, String dataSaida, Carga carga, Rota rota) {

        Utils.validaNull(origem);
        Utils.validaNull(destino);
        Utils.validaNull(dataSaida);
        Utils.validaNull(carga);
        Utils.validaNull(rota);
        this.origem = origem;
        this.destino = destino;
        this.dataSaida = dataSaida;
        this.carga = carga;
        this.rota = rota;
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

    public Rota getRota() {
        return rota;
    }

    public void setRota(Rota rota) {
        Utils.validaNull(rota);
        this.rota = rota;
    }
    
    
    
}
