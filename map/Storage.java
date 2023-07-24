package map;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Storage {
    private Map<String,List<String>> map;

    public Map<String, List<String>> getMap() {
        return map;
    }

    public void addToStorage(String key, String value) {
        this.map.put(key, addToStorageMethod(key,value));
    }

    public void printValues(String key) {
        System.out.println(this.map.get(key));
    }

    public void findValues(String value) {
        System.out.println(this.map.keySet().stream().filter(key->this.map.get(key).contains(value)));
    }

    private List<String> addToStorageMethod(String key,String value){
       var stringList =  this.map.get(key);
       stringList.add(value);
       return stringList;
    }

    public void setMap(Map<String, List<String>> map) {
        this.map = map;
    }
}
