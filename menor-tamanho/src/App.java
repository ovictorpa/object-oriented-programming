import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        int tam1 = input.nextInt();
        int tam2 = input.nextInt();
        int tam3 = input.nextInt();
        int tam4 = input.nextInt();
        int tam5 = input.nextInt();

        int menor = Integer.MAX_VALUE;

        if(tam1<menor) menor = tam1;
        if(tam2<menor) menor = tam2;
        if(tam3<menor) menor = tam3;
        if(tam4<menor) menor = tam4;
        if(tam5<menor) menor = tam5;

        System.out.println(menor);

        input.close();
    }
}
