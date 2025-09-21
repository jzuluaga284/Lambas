package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    /**
     * Operaciones intermedias: Transforman un Stream en otro Stream.
     * Son "perezosas", lo que significa que no se ejecutan hasta que se invoca una operación terminal.
     *
     * Ejemplos: filter(), map(), flatMap(), sorted(), distinct(), limit(), skip().
     *
     * Operaciones terminales: Producen un resultado o un efecto secundario y terminan el procesamiento del Stream.
     * Una vez que se invoca una operación terminal, el Stream ya no puede ser utilizado.
     *
     * Ejemplos: forEach(), collect(), reduce(), count(), findFirst(), findAny(), allMatch(), anyMatch(), noneMatch().
     * @param args
     */



    public static void main(String[] args) {

        List<String> lists;
        List<Integer> numbers2;
        List<Integer> numbers;
        Map<String,Integer> movies =  new HashMap<>();
        List<List<Integer>> listTotal = new ArrayList<>();

        lists =  new ArrayList<>();
        lists.add("DA");
        lists.add("DA");
        lists.add("DA");
        lists.add("DA");
        lists.add("D");
        lists.add("DA");
        lists.add("DC");

        movies.put("Camila", 2);
        movies.put("Paulina", 1);
        movies.put("Patricia", 5);
        movies.put("Sofia", 7);
        movies.put("Camila Samanta", 8);

        numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers2 = new ArrayList<>();
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);

        listTotal.add(numbers);
        listTotal.add(numbers2);

        List<Persona> people = new ArrayList<>();
        people.add(new Persona("Alice",30));
        people.add(new Persona("Bob",25));
        people.add(new Persona("Charlie", 35));

        //lists.stream().filter(x -> x.startsWith("D")).forEach(System.out::println);
        //lists.stream().filter(x -> x.equalsIgnoreCase("Da")).forEach(System.out::println);
        //lists.stream().filter(x -> x.equals("DA") || x.equals("DX")).forEach(System.out::println);
        //lists.stream().sorted().forEach(System.out::println);
        //lists.stream().sorted((x,y) ->x.compareTo(y)).forEach(System.out::println);
        //lists.stream().map(x -> x.replace("A", "X")).forEach(System.out::println);
        //lists.stream().map(x->x.toLowerCase()).forEach(System.out::println);
        //lists.stream().map(String::toLowerCase).forEach(System.out::print);
        //lists.stream().filter(x->x.startsWith("D")|| x.startsWith("Z")).map(x -> x.concat("Hiwearenofx")).forEach(System.out::println);
        //lists.stream().map(x-> x.replace("D","TEST")).forEach(System.out::println);
        //lists.stream().filter(x -> x.equals("DC")).map(x -> x.concat("Hi")).forEach(System.out::println);
        //lists.stream().limit(2).filter(x-> x.equals("DA")).forEach(System.out::println);
        //System.out.println(lists.stream().filter(x -> x.startsWith("D")).count());
        //System.out.println(lists.stream().limit(2).count());
        //System.out.println(lists.stream().allMatch(x -> x.startsWith("A")));
        //System.out.println(lists.stream().anyMatch(x -> x.startsWith("D")));
        //System.out.println(lists.stream().reduce((x,y) -> x + "-" + y));

        //movies.values().stream().forEach(System.out::println);
        //System.out.println(movies.values());
        //movies.keySet().stream().forEach(System.out::println);
        //movies.entrySet().stream().forEach(x -> System.out.println(x.getKey() + ": " + x.getValue()));
        //System.out.println(movies.entrySet());

        //System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());
        //numbers.stream().sorted().forEach(System.out::println);
        //numbers.stream().map(x -> x+1).forEach(System.out::println);
        //movies.entrySet().stream().forEach(System.out::println);

        //System.out.println(movies.entrySet().stream().allMatch(entry -> entry.getKey().toString().startsWith("C")));
        //System.out.println(movies.entrySet().stream().anyMatch(entry -> entry.getKey().toString().startsWith("C")));
        //movies.entrySet().stream().map(x -> x.getValue()).forEach(System.out::print);
        //System.out.println(movies.entrySet().stream().anyMatch(entry-> entry.getKey().equals("Camila")));
        //System.out.println(movies.entrySet().stream().count());
        //System.out.println((movies.entrySet().stream().filter(x -> x.getKey().startsWith("C"))).count());

        //System.out.println(lists.stream().count());
        //System.out.println(numbers.stream().max(Integer::compareTo)); //--> OPTIONAL
        //System.out.println(numbers.stream().min(Integer::compareTo)); //--> OPTIONAL
        //System.out.println(lists.stream().findAny());
        //System.out.println(lists.stream().findFirst());

        //System.out.println(movies.entrySet().stream().allMatch(x-> x.getKey().contains("a")  ));
        //System.out.println(movies.entrySet().stream().noneMatch(x -> x.getKey().contains("a")));
        //System.out.println(movies.entrySet().stream().anyMatch(x -> x.getKey().contains("S")));
        //movies.entrySet().stream().filter(x -> x.getKey().equals("Camila")).forEach(System.out::print);
        //System.out.println(numbers.stream().reduce((x,y) -> x+y));
        //System.out.println(numbers.stream().filter(x -> x < 3).reduce((y,z) -> y +z));
        //System.out.println(lists.stream().reduce((x,y)-> x.concat(y)));

        //*******collect()***********//
        //Map<String, Integer> nameToAgeMap = people.stream().collect(Collectors.toMap(Persona::getName, Persona::getAge));
        //System.out.println("Mapa de nombres a edades: " + nameToAgeMap);
        //List num = numbers.stream().filter(x -> x > 10).collect(Collectors.toList());
        //System.out.println(num);
        //Set num = numbers.stream().filter(x -> x < 3).collect(Collectors.toSet());
        //System.out.println(num);
        //String cadena = lists.stream().collect(Collectors.joining(","));
        //System.out.println(cadena);


        //List num = numbers.stream().distinct().collect(Collectors.toList());
        //System.out.println(num);
        //lists.stream().distinct().forEach(System.out::println);

        //lists.stream().limit(2).forEach(System.out::println);
        //lists.stream().skip(2).forEach(System.out::println);

        //List<Integer> flatList = listTotal.stream().flatMap(List::stream).collect(Collectors.toList());
        //System.out.println(flatList);

        //numbers.stream().sorted().forEach(System.out::println);
        numbers.stream().peek(n -> System.out.println(n)).filter(x -> x < 5).peek(n -> System.out.println(n));
    }
}