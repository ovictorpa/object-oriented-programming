public class Empregado{

    String nome;
    String departamento;
    int horasTrabalhadasNoMes;
    double salarioPorHora;

    public static double calculaSalarioMensal(int horasTrabalhadasNoMes, double salarioPorHora){

        return horasTrabalhadasNoMes*salarioPorHora;

    }

    public static void mostraDados(){

        Empregado empregado = new Empregado();
        empregado.nome = "Victor Anthony Pereira Alves";
        empregado.departamento = "Recursos Humanos";
        empregado.horasTrabalhadasNoMes = 200;
        empregado.salarioPorHora = 11.87;

        System.out.println("Nome do funcionário: " + empregado.nome);
        System.out.println("Departamento do funcionário: " + empregado.departamento);
        System.out.printf("Salário desse Mês: R$ $.2f", calculaSalarioMensal(empregado.horasTrabalhadasNoMes, empregado.salarioPorHora));
    }

    public static void main(String[] args) {
        
        mostraDados();
    }
}