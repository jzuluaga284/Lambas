package CodeEntreview.Ejercicios.ejerciocioDos;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String [] args){

        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("Juan", 30, 5000));
        empleados.add(new Empleado("María", 25, 7000));
        empleados.add(new Empleado("Carlos", 35, 5000));
        empleados.add(new Empleado("Ana", 28, 7000));
        empleados.add(new Empleado("Luis", 40, 6000));

        empleados.sort((e1,e2)-> {
            int comparacionSalario = Double.compare(e2.getSalario(), e1.getSalario());
            if(comparacionSalario != 0){
                return comparacionSalario;
            }else{
                return Integer.compare(e1.getEdad(), e2.getEdad());
            }
        });

        empleados.stream().forEach(System.out::println);
    }
}
