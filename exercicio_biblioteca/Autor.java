import java.util.ArrayList;
import java.util.List;

public class Autor {
    private String nome;
    private List<Livro> obras;
    private String cidade;
    
    public Autor(String nome, String cidade) {
        this.nome = nome;
        this.cidade = cidade;
        this.obras = new ArrayList<>();

    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getObras() {
        return obras;
    }

    public void setObras(List<Livro> obras) {
        this.obras = obras;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public void exibirInformacoesAutor(){
        System.out.println("Nome: "+getNome());
        System.out.println("Cidade: "+getCidade());
    }

    public void addObra(Livro livro){
        obras.add(livro);
    }


    public void exibirListaAutoria(){
        System.out.println("Lista de livros publicados por "+getNome());
        for (Livro livroAtual : obras) {
            System.out.println(livroAtual.getTitulo()); 
        }
    }


}
