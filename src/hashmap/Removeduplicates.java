package hashmap;
import java.util.ArrayList;
import java.util.HashMap;
public class Removeduplicates {

	public static ArrayList<Integer> remove(int[] arr){
		ArrayList<Integer> output=new ArrayList<>();
		HashMap<Integer,Boolean> seen=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			if(seen.containsKey(arr[i])) {
				continue;
			}
			output.add(arr[i]);
			seen.put(arr[i], true);
		}
		return output;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,1,3,1,4,5,4};
ArrayList<Integer> ans=remove(arr);
for(int ele:ans) {
	System.out.println(ele);
}
	}

}
