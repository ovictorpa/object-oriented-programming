public class Data implements Cloneable {
    
    private int dia, mes, ano;

    public String construtor(int dataDia, int dataMes, int dataAno){

        dia = dataDia;
        mes = dataMes;
        ano = dataAno;

        int flag = 0;
        if (mes == 2) {
            if (dia <= 28) flag = 1 ;
            if (dia == 29 && ((ano%400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0)))) flag = 1;
        }

        else if (mes == 4 || mes == 6|| mes == 9|| mes == 11) {
            if (dia <= 30) flag = 1;
        }

        else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10|| mes == 12) {
            if (dia <= 31) flag = 1;
        }
        
        if(flag == 0){
            dia = 01;
            mes = 01; 
            ano = 0001;
        }

        return dia+"/"+mes+"/"+ano;
    }

    public int compara(Data newData, int p1, int p2, int p3){

        newData.construtor(p1, p2, p3);
        int retorno = 2;

        if((dia == newData.dia) && (mes == newData.mes) && (ano == newData.ano)) retorno = 0;

        else if((newData.dia > dia && newData.mes >= mes && newData.ano >= ano) || 
                 (newData.mes > mes && newData.ano >= ano) || (newData.ano > ano)) retorno = -1; 

        else if((newData.dia < dia && newData.mes <= mes && newData.ano <= ano) || 
                (newData.mes < mes && newData.ano <= ano) || (newData.ano < ano))  retorno = 1; 

        return retorno;
    
    }

    public int getDia(){
        return dia;
    }

    public int getMes(){
        return mes;
    }

    public String getMesExtenso(){

        String extenso = "";
        switch(mes){
            case 1: extenso = "Janeiro"; break;
            case 2: extenso = "Fevereiro"; break;
            case 3: extenso = "Março"; break;
            case 4: extenso = "Abril"; break;
            case 5: extenso = "Maio"; break;
            case 6: extenso = "Junho"; break;
            case 7: extenso = "Julho"; break;
            case 8: extenso = "Agosto"; break;
            case 9: extenso = "Setembro"; break;
            case 10: extenso = "Outubro"; break;
            case 11: extenso = "Novembro"; break;
            case 12: extenso = "Dezembro"; break;
        }
        return extenso;
    }

    public int getAno(){
        return ano;
    }

    public boolean isBissexto(){

        if(ano%400 == 0 || ((ano % 4 == 0) && (ano % 100 != 0))) return true;
        return false;
    }

    public Object clone() throws CloneNotSupportedException{
        return (Data)super.clone();
    }
    
}
