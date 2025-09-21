package CodeEntreview.ItrHasMap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CalculateHasMap2 {

    Map<Integer,String> map = new HashMap<>();

    public CalculateHasMap2(){
        map.put(10, "manzanas");
        map.put(3, "peras");
        map.put(4,"fresas");
        map.put(8,"Sandias");
    }

    public boolean findByName(String name){
        return map.entrySet().stream().filter(x -> x.getValue().equals(name)).findFirst().isPresent();
    }

    public boolean findByKey(Integer key){
        return map.entrySet().stream().filter(x -> x.getKey() ==key).findFirst().isPresent();
    }

    public Map orderByValue(){
        return map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                (oldValue, newValue) -> oldValue,
                HashMap::new));
    }

    public static void main(String [] args){
        //System.out.println(new CalculateHasMap2().findByName("manzanas"));
        //System.out.println(new CalculateHasMap2().findByKey(10));
        System.out.println(new CalculateHasMap2().orderByValue().toString());
    }
}
