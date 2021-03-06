public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        
        Voo passageiros = new Voo();
        passageiros.construtorVoo(14, 29, 05, 2001);
        passageiros.imprimeNumeroeData();

        System.out.println("Cadeira: 20");;
        System.out.println("Proxima cadeira livre: " + passageiros.proximoLivre(20));
        passageiros.verifica(20);
        System.out.println("Cadeira ocupada: " + passageiros.ocupa(20));
        System.out.println("Vagas disponiveis: " + passageiros.vagas() + "\n");

        
        System.out.println("Cadeira: 50");
        System.out.println("Proxima cadeira livre: " + passageiros.proximoLivre(50));
        passageiros.verifica(50);
        System.out.println("Cadeira ocupada: " + passageiros.ocupa(50));
        System.out.println("Vagas disponiveis: " + passageiros.vagas() + "\n");

        Voo clonePass = (Voo) passageiros.clone();
        System.out.println("Clone dos dados do voo: ");
        clonePass.imprimeNumeroeData();
    }
}
