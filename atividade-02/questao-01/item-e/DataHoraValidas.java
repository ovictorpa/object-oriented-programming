public class DataHoraValidas {
    
    int hora, minuto, dia, mes, ano;

    public boolean dataEhValida(int dia, int mes, int ano){

        boolean flag = false;
        if (mes == 2) {
        
            if (dia <= 28) flag = true ;
            if (dia == 29 && (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))) flag = true;
        }

        if (mes == 4 || mes == 6|| mes == 9|| mes == 11) {
            if (dia <= 30) flag = true;
        }

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10|| mes == 12) {
            if (dia <= 31) flag = true;
        }
        
        return flag;
    }

    public void mostraData(){

        DataHoraValidas datahora = new DataHoraValidas();
        datahora.dia = 15;
        datahora.mes = 06;
        datahora.ano = 2022;

       boolean dataValida = dataEhValida(datahora.dia, datahora.mes, datahora.ano);
       if (dataValida == true) System.out.println("Data Inválida");
       else System.out.print(datahora.dia+"/"+datahora.mes+"/"+datahora.ano);


    }

    public void mostraHoraAproximada(){

        DataHoraValidas datahora = new DataHoraValidas();
        datahora.hora = 14;
        datahora.minuto = 35;

        boolean flag = false;
        if(datahora.hora < 0 && datahora.hora > 23) flag = true;
        else if(datahora.minuto < 0 && datahora.minuto > 59) flag = true;
        if(flag) System.out.println("Hora Inválida");
        else System.out.println(datahora.hora + ":" + datahora.minuto);
    }

    public static void mostraDataEHoraValidas(){

        DataHoraValidas datahora = new DataHoraValidas();
        datahora.mostraData();
        datahora.mostraHoraAproximada();
        
    }

}