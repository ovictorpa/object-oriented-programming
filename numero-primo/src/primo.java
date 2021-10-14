import java.util.Scanner;
import java.util.Locale;

public class primo {

    public static boolean primo(int n){

        int flag = 1;
        for(int i = 2; i<n; i++){

            if(n%i == 0) flag = 0;
        }
        if(flag == 1) return true;
        else return false;
    }
    
    public static void main(String[] args)  {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n1 = input.nextInt();
        int n2 = input.nextInt();

        for(int i = n1; i<=n2; i++){
            boolean numeroPrimo = primo(i);
            if(numeroPrimo == true) System.out.println(i);
        }
    }
}
