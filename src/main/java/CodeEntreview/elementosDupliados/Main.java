package CodeEntreview.elementosDupliados;

public class Main {

    public static void main(String [] args){

        String [] arreglo = {"A","B","C","D","D","F","G","A"};

        for(int i = 0; i < arreglo.length; i++ ){
            String value = arreglo[i];
            for(int j = 0; j < arreglo.length; j++) {
                if(i != j) {
                    if (value == arreglo[j ]) {
                        System.out.println(arreglo[i]);
                    }
                }
            }
        }
    }
}
