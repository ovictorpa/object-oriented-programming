//Esse modelo já contém as respostas dos itens C e D

public class DataHora {
    
    int hora, minuto, dia, mes, ano;

    public boolean DataEhValida(int dia, int mes, int ano){

        boolean flag = false;

        if(dia == 0 || mes == 0 || ano ==0) flag = true;

        return flag;
    }

    public void mostraData(){

        DataHora datahora = new DataHora();
        datahora.dia = "15";
        datahora.mes = "06";
        datahora.ano = "2022";

        boolean dataValida = dataEhValida(datahora.dia, datahora.mes, datahora.ano);
        if(dataValida == true) System.out.println("Data Inválida");
        else System.out.print(datahora.dia+"/"+datahora.mes+"/"+datahora.ano+" ");
    }

    public void mostraHoraAproximada(){

        DataHora datahora = new DataHora();
        datahora.hora = 14;
        datahora.minuto = 35;

        boolean flag = false;
        if(datahora.hora < 0 && datahora.hora > 23) flag = true;
        else if(datahora.minuto < 0 && datahora.minuto > 59) flag = true;
        if(flag) System.out.println("Hora Inválida");
        else System.out.println(datahora.hora + ":" + datahora.minuto);
    }

    public static void mostraDataEHora(){

        DataHora datahora = new DataHora();
        datahora.mostraData();
        datahora.mostraHoraAproximada();
        
    }

}


