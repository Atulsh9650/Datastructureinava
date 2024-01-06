package arraylist;
import java.util.ArrayList;
public class Add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> list1=new ArrayList<>();

list1.add(5);
list1.add(2);
list1.add(3);
System.out.println(list1.size());
list1.add(2,34);
System.out.println(list1.get(2));
System.out.println(list1.size());
list1.remove(2);
for(int i=0;i<list1.size();i++) {
	System.out.print(list1.get(i)+" ");
}
list1.set(0,3);
System.out.println();
for(int i=0;i<list1.size();i++) {
	System.out.print(list1.get(i)+" ");
}
System.out.println();
for(int ele :list1) {
	System.out.print(ele+" ");
}
	}

}
