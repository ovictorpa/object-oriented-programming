public class poligono {

    int lados;

    public int nomeDoPoligono(lados[] lados){

        switch(lados){

            case 3:
            return "Triangulo";
            break;

            case 4:
            return "Quadrilatero";
            break;
        
            case 5:
            return "Pentagono";
            break;

            case 6:
            return "Hexagono";
            break;

            case 7:
            return "Heptagono";
            break;

            case 8:
            return "Octagono";
            break;

            case 9:
            return "Nonagono";
            break;

            case 10:
            return "Decagono";
            break;
        }
    }

    public static void ladosDoPoligono(){

        poligono poligono = new poligono();
        poligono.lados = 5;

        nomeDoPoligono(poligono.lados);
    }

    public static void mostraPoligono(){
        ladosDoPoligono();
    }
}
