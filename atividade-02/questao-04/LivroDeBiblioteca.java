public class LivroDeBiblioteca {
   
    String titulo;
    String autor;
    String editora;
    String genero;
    String dataDoEmprestimo;
    String dataDaDevolucao;
  

    //Livro que a pessoa vai pegar emprestado
    public void DetalhesDoLivro(){

        LivroDeBiblioteca livro = new LivroDeBiblioteca();
        livro.titulo = "Novembro de 63";
        livro.autor = "Stephen king";
        livro.editora = "Suma das Letras";
        livro.genero = "Triller";

        System.out.println("Titulo: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Editora: " + livro.editora);
        System.out.println("Gênero: " + livro.genero);
    }

    public static void EmprestarLivro(){

        LivroDeBiblioteca livro = new LivroDeBiblioteca();
        livro.DetalhesDoLivro();
        livro.dataDoEmprestimo = "19/10/2021";
        livro.dataDaDevolucao = "26/10/2021";

        System.out.println("Data do Emprestimo: " + livro.dataDoEmprestimo);
        System.out.println("Data da Devolução: " + livro.dataDaDevolucao);

    }

    public static void main(String[] args) {
        
        EmprestarLivro();
    }
}