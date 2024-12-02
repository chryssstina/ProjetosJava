import java.util.ArrayList;
import java.util.List;

public class Leitor {
    private String nome;
    private String id;
    private List<Livro> livrosPegos;

    
    public Leitor(String nome, String id) {
        this.nome = nome;
        this.id = id;
        this.livrosPegos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }




    public void exibirInformacoesLeitor(){
        System.out.println("Nome: "+getNome());
        System.out.println("Número de id: " +getId());
    }

    
    public void pegarLivro(Livro livro){
        livrosPegos.add(livro);
    }

    public void devolverLivro(Livro livro){
        livrosPegos.remove(livro);
    }

    public void exibirListaLivrosPegos(){
        System.out.println("Lista de livros pegos por: " +getNome());
        for (Livro livroAtual : livrosPegos) {
            System.out.println(livroAtual.getTitulo()); 
        }
    }
}
