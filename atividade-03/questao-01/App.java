public class App {
    public static void main(String[] args) {
        
        NumeroComplexo n1 = new NumeroComplexo();
        NumeroComplexo n2 = new NumeroComplexo();

        n1.inicializaNumero(2, 3);
        n1.imprimeNumero();
        n2.inicializaNumero(5, 4);
        n2.imprimeNumero();

        System.out.println("Números Iguais: " + n1.ehIgual(n2, 5, 4) + "\n");
        System.out.println("Soma:");
        n1.soma(n2, 5, 4);
        System.out.println("Subtracao:");
        n1.subtrai(n2, 5, 4);
        System.out.println("Multiplicacao:");
        n1.multiplica(n2, 5, 4);
        System.out.println("Divisao Aproximada:");
        n1.divide(n2, 5, 4);
      
    }
}