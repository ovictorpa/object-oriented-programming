public class EmpregadoB {

    String nome;
    String departamento;
    int horasTrabalhadasNoMes;
    int horasExtrasDoMes;
    double salarioPorHora;
    double salarioPorHoraExtra;

    public static double calculaSalarioMensal(int horasTrabalhadasNoMes, double salarioPorHora, int horasExtrasDoMes, double salarioPorHoraExtra){

        return horasTrabalhadasNoMes*salarioPorHora + horasExtrasDoMes*salarioPorHoraExtra;

    }

    public static void mostraDados(){

        EmpregadoB empregado = new EmpregadoB();
        empregado.nome = "Victor Anthony Pereira Alves";
        empregado.departamento = "Recursos Humanos";
        empregado.horasTrabalhadasNoMes = 200;
        empregado.salarioPorHora = 11.87;
        empregado.horasExtrasDoMes = 6;
        empregado.salarioPorHoraExtra = 12.00;

        System.out.println("Nome do funcionário: " + empregado.nome);
        System.out.println("Departamento do funcionário: " + empregado.departamento);
        System.out.printf("Salário desse Mês: R$ $.2f", calculaSalarioMensal(empregado.horasTrabalhadasNoMes, empregado.salarioPorHora));
    }

    public static void main(String[] args) {
        
        mostraDados();
    }
}