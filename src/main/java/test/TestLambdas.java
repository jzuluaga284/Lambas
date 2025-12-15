package test;

import java.util.*;
import java.util.stream.Collectors;

public class TestLambdas {

    public static void main (String [] args){

        Map<String,String> map = new HashMap();
        map.put("1","juan");
        map.put("2","juan");
        map.put("3","zuluaga");
        map.put("4","zuluaga");
        map.put("5","fernando");

        Map<User,Integer> mapUsers = new HashMap<>();
        mapUsers.put(new User("Juan","10"),1);
        mapUsers.put(new User("Juan","11"),1);
        mapUsers.put(new User("Juan","12"),1);
        mapUsers.put(new User("Fernando","10"),1);

        List<String> list = new ArrayList<>();
        list.add("AD");
        list.add("UU");
        list.add("ZB");
        list.add("AX");



        //map.values().stream().forEach(System.out::print);

        //map.entrySet().stream().filter(x-> x.getValue().equals("juan")).forEach(System.out::println);

        //Set<String> set = map.values().stream().collect(Collectors.toSet());
        //set.stream().forEach(System.out::println);

         //double averageAge = mapUsers.keySet().stream().filter(x -> x.getName().equals("Juan")).mapToInt(x -> Integer.parseInt(x.getAge())).average().orElse(0.0);
        //System.out.println(averageAge);

        //list.stream().filter(x -> x.startsWith("A")).forEach(System.out::println);

        //list.stream().filter(x -> x.equalsIgnoreCase("AB")).forEach(System.out::println);

        //list.stream().filter(x -> x.equals("AD") || x.equals("aB") ).forEach(System.out::println);

        list.stream().sorted().forEach(System.out::println);

        //list.stream().map(x -> x.replace("A", "X")).forEach(System.out::println);

        //mapUsers.keySet().stream().map(x -> x.getName().replace("Juan","Fer")).forEach(System.out::println);

        //list.stream().filter(x -> x.startsWith("A") || x.startsWith("U")).forEach(System.out::println);

        //list.stream().limit(2).forEach(System.out::println);

        //System.out.println(list.stream().allMatch(x -> x.startsWith("A")));

        //System.out.println(list.stream().anyMatch(x -> x.startsWith("A")));

        //System.out.println(list.stream().reduce((x,y) -> x + "-" + y));

        //System.out.println(mapUsers.keySet().stream().map(x -> x.getName()).collect(Collectors.toList()).stream().reduce((x,y) -> x +"-"+ y ));

        //System.out.println(mapUsers.keySet().stream().map(x -> x.getAge()).collect(Collectors.toList()).stream().mapToInt(x -> Integer.parseInt(x)).sum());
        //mapUsers.values().stream().forEach();
        // -----> flat map
        /** ---->
        List<Integer> numbers = List.of(5, 3, 1, 4, 2);
        numbers.stream().sorted().forEach(System.out::println); // Orden ascendente
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println); // Orden descendente
         **/

    }
}



class Main {
    public static void main(String[] args) {
        List<User> resultList = buildUsers("Mary Gold, 24; Andru Gold, 27; Alex Gold, 3");
    }
    public static List<User> buildUsers(String usersInfo) {
        List<User> result = new ArrayList<>();

        // your code
        User user = new User();
        if(usersInfo != null){
            String [] array = usersInfo.split(",");
            user.name = array[0];
            user.age = Integer.parseInt(array[1]);
            result.add(user);
        }
        return result;
    }


    public static class User {
        public String name;
        public int age;
    }
}