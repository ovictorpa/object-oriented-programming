public class NumeroComplexo {

    private double i;
    private double pReal;
    private double pImaginaria;
   
    public void inicializaNumero(int a, int b){
        pReal = a;
        pImaginaria = b;
    }

    public void imprimeNumero(){

        System.out.printf("%.2f\n", pReal+(pImaginaria*i));
    }
    
    public boolean ehIgual(NumeroComplexo n, int p1, int p2){
        
        n.inicializaNumero(p1, p2);
        if(n.pReal == pReal && n.pImaginaria == pImaginaria) return true;
        else return false;
    }

    public double soma(NumeroComplexo n, int p1, int p2){
        n.inicializaNumero(p1, p2);
        return (pReal + (pImaginaria*i)) + (n.pReal + (n.pImaginaria*i));
    }

    public double subtrai(NumeroComplexo n, int p1, int p2){

        n.inicializaNumero(p1, p2);
        return (pReal + (pImaginaria*i)) - (n.pReal + (n.pImaginaria*i));
    }

    public double multiplica(NumeroComplexo n, int p1, int p2){

        n.inicializaNumero(p1, p2);
        return (pReal + (pImaginaria*i)) * (n.pReal + (n.pImaginaria*i));
    }

    public double divide(NumeroComplexo n, int p1, int p2){

        n.inicializaNumero(p1, p2);
        return (pReal + (pImaginaria*i))/(n.pReal + (n.pImaginaria*i));
    }   
}
