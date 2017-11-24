package Kata5P2.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Histograms<T> {
    Map<T, Integer> map = new HashMap<>();
    
    public int get(T key){
        return map.get(key);
    }
    
    public Set<T> keySet(){
        return map.keySet();
    }
    
    public void increment(T key, int value){
        map.put(key, map.containsKey(key)
                ? map.get(key) + value : value);
    }
}
