package helper;

import android.util.Base64;

import java.io.UnsupportedEncodingException;

public class Base64Custom {

    public static String codificarBase64(String texto){
        return Base64.encodeToString(texto.getBytes(), Base64.NO_WRAP).replaceAll("(\\n|\\r)",""); //Removendo espaços no incio e no final da String
    }

    public static String decodificarBase64(String textoCodificado){
        return new String(Base64.decode(textoCodificado, Base64.DEFAULT)) ;
    }


}
