import java.util.*;

class cf{
public static void main(String[] args){
    HashMap<Integer, String> ll = new HashMap<>();
    ll.put(1,"A");
    ll.put(2,"B");
    System.out.println("\nHashMap");
    for(Map.Entry<Integer, String> entry : ll.entrySet()){
        System.out.println(entry.getKey() + " " + entry.getValue());
        
    }
}
}