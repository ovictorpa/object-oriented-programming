public class HoraAproximada {
    
    int hora, minutos;

    public static void mostraHoraAproximada(){

        HoraAproximada hora = new HoraAproximada();
        hora.hora = 14;
        hora.minutos = 35;

        boolean flag = false;
        if(hora.hora < 0 && hora.hora > 23) flag = true;
        else if(hora.minutos < 0 && hora.minutos > 59) flag = true;
        
        if(flag) System.out.println("Hora Inválida");
        else System.out.println(hora.hora + ":" + hora.minutos);
    }
}


