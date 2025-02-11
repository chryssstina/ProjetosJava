public class CNH {
    private String dataEmissao;
    private String validade;
    private String Cpf;


    public CNH(String dataEmissao, String validade, String Cpf)
    {
        Utils.validaNull(dataEmissao);
        Utils.validaNull(validade);
        Utils.validaNull(Cpf);
        
        this.dataEmissao = dataEmissao;
        this.validade = validade;
        this.Cpf = Cpf;
    }


    public String getDataEmissao() {
        return dataEmissao;
    }


    public void setDataEmissao(String dataEmissao) {
        Utils.validaNull(dataEmissao);
        this.dataEmissao = dataEmissao;
    }


    public String getValidade() {
        return validade;
    }


    public void setValidade(String validade) {
        Utils.validaNull(validade);
        this.validade = validade;
    }


    public String getCpf() {
        return Cpf;
    }


    public void setCpf(String cpf) {
        Utils.validaNull(cpf);
        Cpf = cpf;
    }

    
}
