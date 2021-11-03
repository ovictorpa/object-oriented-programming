package motorcycle;

public class Motorcycle {
    private Person person; //agregacao
    private int power;
    private int time;
    //Inicia o atributo power, time com zero e person com null
    public Motorcycle(int power){

    };
    //Comprar mais tempo
    public void buy(int time){

    };
    //Se estiver vazio, coloca a pessoa na moto e retorna true
    public boolean in(Person person){
        return true;
    };
    //Se houver uma person, retira e retorna
    //Se não, retorna null
    public Person out(){
        return this.person;
    };
    public void drive(int time){

    };
    //buzinar
    public void honk(){

    };
    public String toString(){
        return "";
    };
}
