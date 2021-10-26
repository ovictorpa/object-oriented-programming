public class NumeroComplexo {

    private double pReal, pImaginaria;
   
    public void inicializaNumero(int a, int b){
        pReal = a;
        pImaginaria = b;
    }

    public void imprimeNumero(){

        System.out.printf("%.2f + %.2fi\n", pReal, pImaginaria);
        System.out.println();
    }
    
    public boolean ehIgual(NumeroComplexo n, int p1, int p2){
        
        n.inicializaNumero(p1, p2);
        if(n.pReal == pReal && n.pImaginaria == pImaginaria) return true;
        else return false;
    }

    public void soma(NumeroComplexo n, int p1, int p2){

        n.inicializaNumero(p1, p2);
        pReal = (pReal + n.pReal);
        pImaginaria = (pImaginaria + n.pImaginaria);
        imprimeNumero();
    }

    public void subtrai(NumeroComplexo n, int p1, int p2){

        n.inicializaNumero(p1, p2);
        pReal = (pReal - n.pReal);
        pImaginaria = (pImaginaria - n.pImaginaria);
        imprimeNumero();
    }

    public void multiplica(NumeroComplexo n, int p1, int p2){

        n.inicializaNumero(p1, p2);
        pReal = (pReal * n.pReal) - (pImaginaria * n.pImaginaria);
        pImaginaria = (pReal * n.pImaginaria) + (pImaginaria * n.pReal);
        imprimeNumero();
    }

    public void divide(NumeroComplexo n, int p1, int p2){

        n.inicializaNumero(p1, p2);
        pReal = ((pReal * n.pReal) - (pImaginaria * n.pImaginaria))/((n.pReal*n.pReal) + (n.pImaginaria*n.pImaginaria));
        pImaginaria = (pReal * n.pImaginaria) + (pImaginaria * n.pReal)/((n.pReal*n.pReal) + (n.pImaginaria*n.pImaginaria));
        imprimeNumero();
    }   
}
