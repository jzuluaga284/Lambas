package CodeEntreview.invertirCaden;

public class Main {

    public static void main(String [] args){

        String cadena = "Hola";
        String[] cadenaArr = cadena.split("");

        int size = cadenaArr.length;

        while(size > 0){
            System.out.println(cadenaArr[size-1]);
            size -=1;
        }

    }
}
