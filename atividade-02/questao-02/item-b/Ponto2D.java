public class Ponto2D {
    
    int coordX;
    int coordY;

    
    public static void ehRetangulo(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4){

        if((y1 == y2 && y3 == y4)  ||  (y1 == y4 && y2 == y3) || (y1 == y3 && y2 == y4)){

            System.out.println("(" + x1+","+y1+")");
            System.out.println("(" + x2+","+y2+")");
            System.out.println("(" + x3+","+y3+")");
            System.out.println("(" + x4+","+y4+")");
        }
        else System.out.println("Não é um retângulo!");
    }

    public static void Retangulo(){

        Ponto2D ponto1 = new Ponto2D();
        ponto1.coordX = 5;
        ponto1.coordY = 10;

        Ponto2D ponto2 = new Ponto2D();
        ponto2.coordX = 0;
        ponto2.coordY = 10;

        Ponto2D ponto3 = new Ponto2D();
        ponto3.coordX = 0;
        ponto3.coordY = 0;

        Ponto2D ponto4 = new Ponto2D();
        ponto4.coordX = 5;
        ponto4.coordY = 0;

        ehRetangulo(ponto1.coordX, ponto1.coordY, ponto2.coordX, ponto2.coordY, ponto3.coordX, ponto3.coordY, ponto4.coordX, ponto4.coordY);
    }

    public static void main(String[] args) {
        
        Retangulo();
    }
}
