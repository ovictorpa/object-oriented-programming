public class Ponto2D {
    
    int coordX;
    int coordY;

    public static double tamanhoDaLinha(int x1, int y1, int x2, int y2){


        return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
    }

    public static void Linha(){

        Ponto2D ponto1 = new Ponto2D();
        ponto1.coordX = 5;
        ponto1.coordY = 10;

        Ponto2D ponto2 = new Ponto2D();
        ponto2.coordX = 8;
        ponto2.coordY = 10;

        System.out.println("(" + ponto1.coordX +", " + ponto1.coordY +")");
        System.out.println("(" + ponto2.coordX +", " + ponto2.coordY + ")");
        System.out.printf("Tamanho aproximado da linha: %.2f ", tamanhoDaLinha(ponto1.coordX, ponto1.coordY, ponto2.coordX, ponto2.coordY));
    }

    public static void mostraLinha(){
        Linha();
    }

}