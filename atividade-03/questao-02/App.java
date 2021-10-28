public class App {
    public static void main(String[] args) throws CloneNotSupportedException{
        
        Data data = new Data();
        Data data2 = new Data();

        System.out.println("Data Corrente: " + data.construtor(29, 2, 2008));
        System.out.println("Por Extenso: " + data.getDia() + " de " + data.getMesExtenso() + " de " + data.getAno());
        System.out.println("Ano bissexto: " + data.isBissexto() + "\n");
        System.out.println("Data a ser comparada: " + data2.construtor(17, 9, 2021));
        System.out.println("Por Extenso: " + data2.getDia() + " de " + data2.getMesExtenso() + " de " + data2.getAno());
        System.out.println("Ano bissexto: " + data2.isBissexto() + "\n");
        System.out.println("Resultado da comparação: " + data.compara(data2, 17, 9, 2021) + "\n");
        
        Data cloneData = (Data) data.clone();
    
        System.out.println("Data Corrente Clonada: " + cloneData.getDia() + " de " + cloneData.getMesExtenso() + " de " + cloneData.getAno());

        

    }
}