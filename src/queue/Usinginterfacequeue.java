package queue;
import java.util.LinkedList;
import java.util.Queue;
public class Usinginterfacequeue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Queue<Integer> queue=new LinkedList<>();
       queue.add(60);
       queue.add(20);
       queue.add(30);
       queue.add(40);
       queue.remove();
       System.out.println(queue.poll());
	}

}
