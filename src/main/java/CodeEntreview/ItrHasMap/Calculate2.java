package CodeEntreview.ItrHasMap;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Calculate2 {

    List<User> userList = Arrays.asList(
            new User(1, "John", "Doe", LocalDate.of(1990, 1, 15)),
            new User(2, "Jane", "Smith", LocalDate.of(1985, 5, 10)),
            new User(3, "Michael", "Johnson", LocalDate.of(2000, 3, 25))
    );

    public boolean finByName(String name) {
        return userList.stream().filter(x -> x.firstName.equals(name)).findFirst().isPresent();
    }

    public boolean findById(int id){

        return userList.stream().filter(x -> x.getId()==id).findFirst().isPresent();
    }

    public List orderByName(){
        return userList.stream().sorted(Comparator.comparing(User::getFirstName)).collect(Collectors.toList());
    }

    public int findMaxId(){
        return userList.stream().max(Comparator.comparing(User::getId)).map(User::getId).orElse(-1);
    }

    public int findMinId(){
        return userList.stream().min(Comparator.comparing(User::getId)).map(User::getId).orElse(-1);
    }

    public static void main (String [] args){
        //System.out.println(new Calculate2().finByName("John"));
        //System.out.println(new Calculate2().findById(1));
        //System.out.println(new Calculate2().orderByName().toString());
        //System.out.println(new Calculate2().findMaxId());
        System.out.println(new Calculate2().findMinId());
    }

}
