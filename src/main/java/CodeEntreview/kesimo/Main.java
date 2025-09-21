package CodeEntreview.kesimo;

import java.util.Arrays;

public class Main {

    public static void main(String [] args){

        int [] array = {1,2,345,3,78,3};
        int kesimo = 0;

        array = Arrays.stream(array).sorted().toArray();

        System.out.println(array[array.length-2]);

    }
}
