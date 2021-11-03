package car;

class Car {
    private int pass; // Passageiros
    private int passMax = 2; // limite de Passageiros
    private int gas; // tanque
    private int gasMax = 100; // limite do tanque
    private int km; // quantidade de quilometragem

    public Car() {

    };

    public String toString() {
        return "pass: " + pass + ", gas: " + gas + ", km: " + km;
    };

    public void in() {
        if (pass < passMax)
            pass++;
        else
            System.out.println("fail: limite de pessoas atingido");
    };

    public void out() {
        if (pass > 0)
            pass--;
        else
            System.out.println("fail: nao ha ninguem no carro");
    };

    public void fuel(int inpGas) {
        if ((inpGas + gas) <= gasMax)
            gas += inpGas;
        else
            gas = gasMax;

    };

    public void drive(int inpKm) {

        if (gas < inpKm) {

            if (gas == 0)
                System.out.println("fail: tanque vazio");
            else {
                System.out.println("fail: tanque vazio apos andar " + gas + " km");
                km += gas;
                gas = 0;
            }
        }

        else if (pass >= 1 && gas != 0) {
            km = inpKm;
            gas -= km;
        } else if (pass == 0)
            System.out.println("fail: nao ha ninguem no carro");

    };
};
