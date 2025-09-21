package Tree;

import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main (String [] args){

        Set<String> set = new TreeSet<>();

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");

        set.remove("e");

        set.stream().forEach(System.out::println);
    }
}
