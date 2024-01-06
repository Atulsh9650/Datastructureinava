package hashmap;
import java.util.HashMap;
import java.util.Set;
public class Newhashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    HashMap<String,Integer> map=new HashMap<>();
    map.put("abc", 1);
    map.put("abc", 2);
    map.put("abc1", 1);
    map.put("abc1", 2);
    int a=0;
    if(map.containsKey("abc")) {
    	System.out.println("has abc");
    	a=map.get("abc");
    }
    System.out.println(a);
    if(map.containsValue(2)) {
    	System.out.println("has 2");
    }
  int v=  map.remove("abc");
  System.out.println(v);
  System.out.println(map.size());
  Set<String> allkeys=map.keySet();
  for(String set:allkeys) {
	  System.out.println(set);
  }
	}

}
