package arraylist;
import java.util.ArrayList;
public class Remove {
public static ArrayList<Integer> removeelement(int arr[]){
	ArrayList<Integer> result =new ArrayList<Integer>();
	result.add(arr[0]);
	for(int i=1;i<arr.length;i++) {
		if(arr[i]!=arr[i-1]) {
			result.add(arr[i]);
		}
	}
	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,10,20,20,30};
		ArrayList<Integer> result=removeelement(arr);
		for(int ele :result) {
			System.out.print(ele+" ");
		}
	}

}
