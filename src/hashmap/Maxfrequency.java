package hashmap;
import java.util.HashMap;
public class Maxfrequency {
public static int max(int[] arr) {
	HashMap<Integer,Integer> map=new HashMap<>();
	int max=1;
	int maxfre=arr[0];
	for(int i=0;i<arr.length;i++) {
        if (map.containsKey(arr[i])) {
            map.put(arr[i], map.get(arr[i]) + 1);
            if (map.get(arr[i]) > max) {
                max = map.get(arr[i]);
                maxfre = arr[i];
            }
        } else {
            map.put(arr[i], 1);
        }
    }
    return maxfre;

}
public static void main(String args[]) {
	int arr[]= {1,2,3,3,1,3,4};
	int maxfre=max(arr);
	System.out.println(maxfre);
}
}
