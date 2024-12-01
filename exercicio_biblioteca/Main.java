public class Main {
    public static void main(String args[]){

        Biblioteca biblioteca1 = new Biblioteca("Biblioteca Azul", "Cidade Azul");
        System.out.println();

        //Criando autores
        Autor autor1 = new Autor("Alice Oseman","Inglaterra");
        Autor autor2 = new Autor("Rick Riordan","EUA");
        Autor autor3 = new Autor("Mark Oshiro", "EUA");

        //Criando o livro; adicionando seu autor; adicionando livro à lista de obras do autor
        Livro livro1 = new Livro("Sem Amor", "1234567890000",biblioteca1);
        livro1.addAutoria(autor1);
        autor1.addObra(livro1);

        Livro livro2 = new Livro("PJO", "2345678901000", biblioteca1);
        livro2.addAutoria(autor2);
        autor2.addObra(livro2);
        
        Livro livro3 = new Livro("O Sol e a Estrela", "345678901000", biblioteca1);
        livro3.addAutoria(autor2);
        livro3.addAutoria(autor3);


        //Adicionando os livros a Biblioteca Azul
        biblioteca1.addLivros(livro1);
        biblioteca1.addLivros(livro2);
        biblioteca1.addLivros(livro3);

       
        biblioteca1.exibirInformacoesBiblioteca();
        System.out.println();
        autor1.exibirListaAutoria();
        System.out.println();
        livro1.exibirInformacoesLivro();
        System.out.println();

        //Criando leitores
        Leitor leitor1 = new Leitor("Ana", "12345");
        leitor1.pegarLivro(livro1);
        leitor1.exibirListaLivrosPegos();
    }
}
 