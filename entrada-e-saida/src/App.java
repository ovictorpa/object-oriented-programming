import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int idade = input.nextInt();
        String nome = input.next();
        input.nextLine();

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        input.close();
    }
}
