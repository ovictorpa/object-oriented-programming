public class Voo implements Cloneable {
    
    private int numeroVoo;
    private int numeroCadeira;
    private int cadeirasOcupadas = 0;
    private boolean cadeiras[] = new boolean[100]; 
    private Data dataVoo = new Data();

    public void construtorVoo(int numero, int dia, int mes, int ano){

        numeroVoo = numero;
        dataVoo.construtor(dia, mes, ano);
    }

    public void imprimeNumeroeData(){

        System.out.println("Numero do Voo: " + numeroVoo);
        System.out.println("Data do Voo: " + dataVoo.getDia() + "/" + dataVoo.getMes() + "/" + dataVoo.getAno() +'\n');

    }

    public int proximoLivre(int numero){

        numeroCadeira = numero;
        int cadeiraProx = numeroCadeira + 1;
        return cadeiraProx;

    }

    public boolean verifica(int cadeiraLivre){

        return !this.cadeiras[cadeiraLivre];
    }

    
    public boolean ocupa(int cadeiraLivre){

        if(this.cadeiras[cadeiraLivre - 1] == false){
            this.cadeiras[cadeiraLivre - 1] = true;
            cadeirasOcupadas++;
            return true;
        }
        else return false;
    } 
        
    public int vagas(){
        return this.cadeiras.length - cadeirasOcupadas;
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
