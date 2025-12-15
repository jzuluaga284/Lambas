package test;

import java.util.*;
import java.util.stream.Collectors;

public class TestTwo {

    public static void main(String [] args){

        Map<String, String> map = new HashMap<>();
        map.put("1", "juan");
        map.put("2", "lisi");
        map.put("3", "kuru");
        map.put("4", "pepito");
        map.put("5", "zebra");

        Map<User, Integer> mapUsers =  new HashMap<>();
        mapUsers.put(new User("juan", "10"), 1);
        mapUsers.put(new User("lisi", "20"), 2);
        mapUsers.put(new User("juan", "30"), 3);
        mapUsers.put(new User("pepito", "40"), 4);
        mapUsers.put(new User("pepito", "50"), 4);

        List<String> list = new ArrayList<>();
        list.add("AD");
        list.add("DE");
        list.add("HI");
        list.add("JUAN");

        //map.values().stream().forEach(System.out::println);
        //map.keySet().stream().forEach(System.out::println);

        //Set<String> set = map.values().stream().collect(Collectors.toSet());
        //set.forEach(System.out::println);

        //map.entrySet().stream().filter(x -> x.getValue().equals("juan")).forEach(System.out::println);

        //mapUsers.keySet().stream().map(x ->  x.getName()).forEach(System.out::println);

        //double averageAge = mapUsers.keySet().stream().filter(x -> x.getName().equals("juan")).mapToInt(x -> Integer.parseInt(x.getAge())).average().orElse(0.0);
        //System.out.println(averageAge);

        //list.stream().filter(x -> x.startsWith("A")).forEach(System.out::println);

        //list.stream().filter(x -> x.equalsIgnoreCase("ad")).forEach(System.out::println);

        //list.stream().filter(x -> x.equals("AD") || x.equalsIgnoreCase("de")).forEach(System.out::println);

        //map.entrySet().stream().map(entry -> entry.getValue().concat(entry.getKey())).forEach(System.out::println);

        //map.values().forEach(System.out::println);

        //map.keySet().forEach(System.out::println);

        //map.entrySet().stream().filter(e -> e.getValue().equals("juan")).forEach(System.out::println);
        
        //Set<String> uniqueValues = map.values().stream().collect(Collectors.toSet());

        //uniqueValues.stream().forEach(System.out::println);

        System.out.println(mapUsers.entrySet().stream().filter(x -> x.getKey().getName().equals("juan")).count());



    }
}
