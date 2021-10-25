public class LivroDeLivraria{

    String titulo;
    String autor;
    String editora;
    String genero;
    double valor;
    double desconto;
    String setor;

    public void DetalhesDoLivro(){

        LivroDeLivraria livro = new LivroDeLivraria();
        livro.titulo = "Novembro de 63";
        livro.autor = "Stephen king";
        livro.editora = "Suma das Letras";
        livro.genero = "Triller";

        System.out.println("Titulo: " + livro.titulo);
        System.out.println("Autor: " + livro.autor);
        System.out.println("Editora: " + livro.editora);
        System.out.println("Gênero: " + livro.genero);
    }

    public static double DescontoAVista(double desconto, double valor){

        valor *= (1-desconto);
        return valor;
    }

    public static void venderLivro(){

        LivroDeLivraria livro = new LivroDeLivraria();
        livro.DetalhesDoLivro();
        livro.setor = "4A0";
        livro.valor = 59.90;
        livro.desconto = 0.15;

        System.out.println("Valor do livro: " + livro.valor);
        System.out.printf("Valor do livro com desconto: %.2f", DescontoAVista(livro.desconto, livro.valor));
    }

}