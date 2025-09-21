package CodeEntreview.OrderValues;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String [] args){
         int[] array = {0,1,2,1,1,0,2,2,1,0};
         List<Integer> arrayCero = new ArrayList<>();
         List<Integer> arrayUno = new ArrayList<>();
         List<Integer> arrayDos = new ArrayList<>();
         List<Integer> arraySum = new ArrayList<>();

         for(int i = 0; i < array.length; i++){
            if(array[i] == 0){
                arrayCero.add(0);
            }
            if(array[i] == 1){
                arrayUno.add(1);
            }
             if(array[i] == 2){
                 arrayDos.add(2);
             }
         }

        arraySum.addAll(arrayCero);
        arraySum.addAll(arrayUno);
        arraySum.addAll(arrayDos);

        arraySum.stream().forEach(System.out::println);

    }
}
