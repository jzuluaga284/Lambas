package CodeEntreview.ItrHasMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class CalculateHashMap {

    Map<Integer,String> map = new HashMap<>();

    public CalculateHashMap(){
        map.put(10, "manzanas");
        map.put(3, "peras");
        map.put(4,"fresas");
        map.put(8,"Sandias");
    }

    public Integer maxFrute(){
         return map.entrySet().stream().map(user -> user.getKey()).max(Comparator.naturalOrder()).orElseThrow(()-> new RuntimeException("No se encontro coincidencia"));
    }

    public static void main(String [] args){

        System.out.println(new CalculateHashMap().maxFrute());
    }
}
