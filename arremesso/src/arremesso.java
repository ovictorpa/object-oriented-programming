import java.util.Scanner;
import java.util.Locale;

public class arremesso {

    public static void main(String[] args)  {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int ganhador = -1, menorDist = 0;
        int n = input.nextInt();
        int dist1, dist2, distFinal;

        for(int i = 0; i<n; i++){
            dist1 = input.nextInt();
            dist2 = input.nextInt();

            if(dist1 >= 10 && dist2 >=10){

                distFinal = dist1 - dist2;
                if(dist2>dist1) distFinal*= -1;
                
                if(ganhador == -1 || distFinal < menorDist){
                    ganhador = i;
                    menorDist = distFinal;
                }
            }
        }

        if(ganhador != -1) System.out.println(ganhador);
        else System.out.println("sem ganhador");
        
        input.close();
    }

}