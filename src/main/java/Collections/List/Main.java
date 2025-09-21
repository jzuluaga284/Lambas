package Collections.List;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String [] args){

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        System.out.println(list.get(2));

        list.remove("a");

        //System.out.println(list.stream().filter(x -> x.equals("a")).count());
        list.stream().forEach(System.out::println);
    }

}
