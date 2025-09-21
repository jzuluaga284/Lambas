package CodeEntreview.Ejercicios;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class EjercicioTres {

    public static void main(String [] args){

        List<String> nombres = new ArrayList<>();

        nombres.add("Daaa");
        nombres.add("aaaa");
        nombres.add("DDaa");
        nombres.add("Aaaa");
        nombres.add("Daaa");
        nombres.add("Da");
        nombres.add("dA");
        nombres.add("DA");
        nombres.add("da");
        nombres.add("DX");
        nombres.add("b");
        nombres.add("z");
        nombres.add("a");

        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);


        //nombres.stream().filter(x-> x.startsWith("D")).forEach(System.out::println);
        //nombres.stream().filter(x -
        //nombres.stream().filter(x -> x.equals("DA") || x.equals("DX")).forEach(System.out::println);
        //nombres.stream().sorted().forEach(System.out::println);
        //numbers.stream().sorted().forEach(System.out::println);
        //numbers.stream().sorted((x,y)-> y.compareTo(x)).forEach(System.out::println);
        //nombres.stream().map(x-> x.replace("A","X")).forEach(System.out::println);
        //nombres.stream().map(x -> x.toLowerCase()).forEach(System.out::println);
        //nombres.stream().filter(x-> x.startsWith("D") || x.startsWith("a")).map(x-> x.concat("Hiwearenofx")).forEach(System.out::println);
        nombres.stream().filter(x -> x.startsWith("D") || x.startsWith("a")).map(x -> x.concat("TEST")).forEach(System.out::println);

    }
}
