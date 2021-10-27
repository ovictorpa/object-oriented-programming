public class App {
    public static void main(String[] args) {
        
        Voo passageiros = new Voo();
        passageiros.construtorVoo(14, 29, 05, 2001);
        passageiros.imprimeNumeroeData();
        System.out.println("Proxima cadeira livre: " + passageiros.proximoLivre(20));
        System.out.println("Cadeira ocupada: " + passageiros.ocupa(20));
        System.out.println("Vagas disponiveis: " + passageiros.vagas());

    }
}
