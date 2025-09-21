package test;

public class Recursividad {

    public int sumar(int num){

        while(num < 10){
            num += 1;
            sumar(num);
        }
        return num;
    }

    public static void main(String [] args){
        Recursividad recursividad= new Recursividad();
        System.out.println(recursividad.sumar(0));
    }
}
