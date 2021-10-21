public class HoraPrecisa {
    
    int hora, minutos, segundos, centSeg;

    public static void mostraHoraAproximada(){

        HoraPrecisa hora = new HoraPrecisa();
        hora.hora = 14;
        hora.minutos = 35;
        hora.segundos = 41;
        hora.centSeg = 98;

        boolean flag = false;
        if(hora.hora < 0 && hora.hora > 23) flag = true;
        else if(hora.minutos < 0 && hora.minutos > 59) flag = true;
        else if (hora.segundos < 0 && hora.segundos > 59) flag = true;
        else if (hora.centSeg < 0 && hora.centSeg > 99) flag = true;

        if(flag) System.out.println("Hora Inválida");
        else System.out.println(hora.hora + ":" + hora.minutos + ":" + hora.segundos + ":" + hora.centSeg);
    }
}
