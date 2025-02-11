public class Endereco {
    private String cep;
    private String rua;
    private int numero;
    private String pontoReferencia;
    private String complemento;
    
    public Endereco(String cep, String rua, int numero, String pontoReferencia, String complemento) {
        Utils.validaNull(cep);
        Utils.validaNull(rua);
        Utils.validaNull(numero);
        Utils.validaNull(pontoReferencia);
        Utils.validaNull(complemento);
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.pontoReferencia = pontoReferencia;
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        Utils.validaNull(cep);
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        Utils.validaNull(rua);
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        Utils.validaNull(numero);
        this.numero = numero;
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }

    public void setPontoReferencia(String pontoReferencia) {
        Utils.validaNull(pontoReferencia);
        this.pontoReferencia = pontoReferencia;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        Utils.validaNull(complemento);
        this.complemento = complemento;
    }

    
}
