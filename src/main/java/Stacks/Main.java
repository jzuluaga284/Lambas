package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

    public static void main(String [] args){

        Deque<String> dq = new ArrayDeque<>();

        dq.add("a");
        dq.add("b");
        dq.add("c");
        dq.add("e");
        dq.add("d");

        //dq.stream().sorted().forEach(System.out::println);

        System.out.println(dq.getFirst());
        System.out.println(dq.getLast());
    }
}
