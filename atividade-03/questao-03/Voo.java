public class Voo implements Cloneable {
    
    private int numeroVoo;
    private int numeroCadeira;
    private int cadeirasOcupadas = 0;
    private int cadeirasLivres= 100;
    private Data dataVoo = new Data();

    public void construtorVoo(int numero, int dia, int mes, int ano){

        numeroVoo = numero;
        dataVoo.construtor(dia, mes, ano);
    }

    public void imprimeNumeroeData(){

        System.out.println("Numero do Voo: " + numeroVoo);
        System.out.println("Data do Voo: " + dataVoo.getDia() + "/" + dataVoo.getMes() + "/" + dataVoo.getAno());

    }

    public int proximoLivre(int numero){

        numeroCadeira = numero;
        int cadeiraProx = numeroCadeira + 1;
        return cadeiraProx;

    }

    public int verifica(int cadeiraLivre){

        proximoLivre(cadeiraLivre);
        if(cadeiraLivre == numeroCadeira) return 0;
        else return 1;
    }

    
    public boolean ocupa(int cadeiraLivre){

        int flag = verifica(cadeiraLivre);
    
        if(flag == 1) return true;
        else {
           cadeirasOcupadas++;
           return false;
       }
    } 
        
    public int vagas(){
        return cadeirasLivres - cadeirasOcupadas;
    }
    
    public int getVoo(){
        return numeroVoo;
    }

    public Object getData(){
        return dataVoo;
    }

    public Object clone() throws CloneNotSupportedException{

        return (Voo)super.clone();
    }
}
