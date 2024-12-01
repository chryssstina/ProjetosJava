import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    private String nome;
    private String cidade;
    private List<Livro> acervo;

    public Biblioteca(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.acervo = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public List<Livro> getAcervo() {
        return acervo;
    }

    public void setAcervo(List<Livro> acervo) {
        this.acervo = acervo;
    }
    

    public void addLivros(Livro livro){
        acervo.add(livro);
        livro.setBiblioteca(this);
    }
    

    public void exibirInformacoesBiblioteca(){
        System.out.println("Nome: " +getNome());
        System.out.println("Cidade: " +getCidade());
        System.out.println("Acervo: ");
            for(Livro livroAtual : acervo){
                System.out.println(livroAtual.getTitulo());
            }
    }

    


}
