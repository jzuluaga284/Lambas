package CodeEntreview.Ejercicios;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EjerciocioUno {

    public static void main(String [] args){

        List<String> listaNombres = new ArrayList<>();

        listaNombres.add("Juan Perez");
        listaNombres.add("Pipo Paes");
        listaNombres.add("Camilo Trujillo");
        listaNombres.add("Paloma basilio");
        listaNombres.add("Pacho Malo");

        Map<String, String> mapaApellidosNopmbres = listaNombres.stream().map(nombres -> {
            String[] partes = nombres.split(" ");
            String nombre = partes[0];
            String apellido = partes[1];
            return new AbstractMap.SimpleEntry<>(nombre,apellido);
        }).collect(Collectors.toMap(
            entrada -> entrada.getKey(), entrada ->  entrada.getValue(), (nombre1, nombre2) -> nombre1 + ", " +  nombre2
        ));

        System.out.println(mapaApellidosNopmbres);



    }
}
