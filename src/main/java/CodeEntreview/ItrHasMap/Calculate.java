package CodeEntreview.ItrHasMap;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Calculate {

    List<User> userList = Arrays.asList(
            new User(1, "John", "Doe", LocalDate.of(1990, 1, 15)),
            new User(2, "Jane", "Smith", LocalDate.of(1985, 5, 10)),
            new User(3, "Michael", "Johnson", LocalDate.of(2000, 3, 25))
    );

    public User olderAge(){
        LocalDate oldestBirthDate = userList.stream().map(User::getBirthday).min(Comparator.naturalOrder()).orElseThrow( () -> new RuntimeException("La lista esta vacida"));
        return userList.stream().filter(user ->user.getBirthday().equals(oldestBirthDate)).findFirst().orElseThrow(() -> new RuntimeException("No se encontro considencia"));
    }

    public User findByFirstName(String firstNameUser){
        return userList.stream().filter(user -> user.getFirstName().equals(firstNameUser)).findFirst().orElseThrow(() -> new RuntimeException("no se encontro concidencia"));
    }

    public static void main(String [] args){
        System.out.println(new Calculate().olderAge().getFirstName());
        System.out.println(new Calculate().findByFirstName("Jane").getBirthday());
    }

}
