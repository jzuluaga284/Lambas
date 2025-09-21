package CodeEntreview.anagrama;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public void test(){
        System.out.println("hi");
    }
    
    public static void main(String [] args){

        String palabra1 = "listen";
        String palabra2  = "silent";

        char[] array1 = palabra1.toCharArray();
        char[] array2 = palabra2.toCharArray();


        if(palabra1.length() == palabra2.length()){

            Arrays.sort(array1);
            Arrays.sort(array2);
            System.out.println(array1);
            System.out.println(array2);
            if(Arrays.equals(array1,array2)){
                System.out.println("Es un anagram");
            }
            else{
                System.out.println("No es un anagram");
            }
        }
        else{
            System.out.println("No es un anagram");
        }
    }
}
