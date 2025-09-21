package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String [] args){
        Map<Integer,String> map = new HashMap();

        map.put(1,"we");
        map.put(2,"NOFX");

        //map.entrySet().stream().forEach(System.out::println);

        //System.out.println(map.get(1));
        //System.out.println(map.get(2));

        map.remove(1);

        map.entrySet().stream().forEach(System.out::println);
    }
}
