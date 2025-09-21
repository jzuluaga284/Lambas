package CollectionsLinkeList;

import java.util.LinkedList;

public class Main {

    public static void main(String [] args){

        LinkedList<String> list = new LinkedList();

        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        list.stream().forEach(System.out:: println);
    }
}
