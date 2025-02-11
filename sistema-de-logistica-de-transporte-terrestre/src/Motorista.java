public class Motorista {
    private String nome;
    private CNH cnh;
    private int experiencia;


    public Motorista(String nome, CNH cnh, int experiencia) {
        Utils.validaNull(nome);
        Utils.validaNull(cnh);
        Utils.validaNull(experiencia);
        this.nome = nome;
        this.cnh = cnh;
        this.experiencia = experiencia;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        Utils.validaNull(nome);
        this.nome = nome;
    }


    public CNH getCnh() {
        return cnh;
    }


    public void setCnh(CNH cnh) {
        Utils.validaNull(cnh);
        this.cnh = cnh;
    }


    public int getExperiencia() {
        return experiencia;
    }


    public void setExperiencia(int experiencia) {
        Utils.validaNull(experiencia);
        this.experiencia = experiencia;
    }

    

    
}
