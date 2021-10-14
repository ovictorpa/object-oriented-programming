import java.util.Scanner;
import java.util.Locale;

public class fila {

    public static void main(String[] args)  {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int fila[] = new int[n];
        
        int qtdImpares = 0, qtdPares = 0;

        for(int i = 0; i<n; i++){
            fila[i] = input.nextInt();
            if(fila[i]%2 == 0) qtdPares++;
            else qtdImpares++;
        }
        int impares[] = new int[qtdImpares];
        int pares[] = new int[qtdPares];
        int indiceAuxImpar = 0, indiceAuxPar = 0;
        
        for(int i = 0; i<n; i++){

            if(fila[i]%2 == 0){
                pares[indiceAuxPar] = fila[i];
                indiceAuxPar++;
            } else {
                impares[indiceAuxImpar] = fila[i];
                indiceAuxImpar++;
            }
        }
        
        if(qtdImpares == 0)System.out.print("[ ]");
        else {
            for(int i = 0; i< qtdImpares; i++){
                if(i == 0) System.out.print("[ ");
                System.out.print(impares[i] + " ");
                if(i == qtdImpares-1) System.out.print("]");
            }
        }
        System.out.println();

        if(qtdPares == 0) System.out.print("[ ]");
        else {

            for(int i = 0; i< qtdPares; i++){
                if(i == 0) System.out.print("[ ");
                System.out.print(pares[i] + " ");
                if(i == qtdPares-1) System.out.print("]");
            }
        }
        input.close();
    }
}