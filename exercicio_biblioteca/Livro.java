
import java.util.ArrayList;
import java.util.List;

public class Livro{
    private String titulo;
    private String isbn;
    private List<Autor> autoria;
    private Biblioteca biblioteca;

    public Livro(String titulo, String isbn, Biblioteca biblioteca) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autoria = new ArrayList<>();
        this.biblioteca = biblioteca;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public List<Autor> getAutoria() {
        return autoria;
    }

    public void setAutoria(List<Autor> autoria) {
        this.autoria = autoria;
    }

    public Biblioteca getBiblioteca() {
        return biblioteca;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    
    public void addAutoria(Autor autor){
        autoria.add(autor);
    }

    
    public void exibirInformacoesLivro(){
        System.out.println("Título: " +getTitulo());
        System.out.println("ISBN: " +getIsbn());
        System.out.println("Presente na biblioteca: " +getBiblioteca().getNome());
        System.out.println("Informações do autor: ");
            for(Autor autorAtual : autoria){
                autorAtual.exibirInformacoesAutor();
            }
    }
    

    
    
} 
// for (Autor autor : autores)
// Autor: o tipo (classe) dos objetos que estão sendo iterados. Poderia ser 
// (String autor : autores) já que a primeira palavra é para o tipo 
// autor: a variável de iteração que vai armazenar cada objeto da lista, um de cada vez.
// autores: o nome da lista que contém os objetos da classe Autor.