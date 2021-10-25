public class Livro{

    String titulo;
    String autor;
    String editora;
    String genero;

    public static void mostrarLivro() {
    
        
        Livro livro = new Livro();
        livro.titulo = "Novembro de 63";
        livro.autor = "Stephen king";
        livro.editora = "Suma das Letras";
        livro.genero = "Triller";

        System.out.println("Título: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Editora: " + livro.editora);
        System.out.println("Gênero: " + livro.genero);

    }

}