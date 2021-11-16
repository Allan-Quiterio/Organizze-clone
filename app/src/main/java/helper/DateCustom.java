package helper;

import java.text.SimpleDateFormat;

public class DateCustom {

    public static String dataAtual(){

        long date = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dataString = simpleDateFormat.format(date);
        return dataString;
    }

    public static String mesAnoDataEscolhida(String data){

        String retornoData[] = data.split("/"); //Separando a data em um array
        String dia = retornoData[0]; //dia 02
        String mes = retornoData[1]; //mes 11
        String ano = retornoData[2]; //ano 2021 - 112021

        String mesAno = mes + ano;
        return mesAno;
    }
}
