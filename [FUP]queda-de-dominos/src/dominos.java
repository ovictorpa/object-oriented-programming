import java.util.Scanner;
import java.util.Locale;

public class dominos {

    public static void main(String[] args)  {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int array[] = new int[n];

        for(int i = 0; i<n; i++) array[i] = input.nextInt();

        int flag = 0;
        int antecessor = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){

            if(array[i] >= antecessor){
                antecessor = array[i];
                flag = 1;
            }
            else{
                flag = 0;
                break;
            }
        }

        if(flag == 1) System.out.println("ok");
        else System.out.println("precisa de ajuste");
    }
}
