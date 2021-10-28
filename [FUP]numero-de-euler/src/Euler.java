import java.util.Scanner;
import java.util.Locale;

public class Euler {

    public static double fatorial(int n){

        double fatorial = n;
        while(n>1){
            fatorial*= n-1;
            n--;
        }
        return fatorial;
    }

    public static double euler(int n){

        double euler = 1;

        for(int i = 1; i<=n; i++){
            double f = fatorial(i);
            euler+= 1/f;
        }
        return euler;
    }

    public static void main(String[] args)  {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        double numeroDeEuler = euler(n);

        System.out.printf("%.6f", numeroDeEuler);
        
        input.close();
    }
}