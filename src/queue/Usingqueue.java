package queue;

public class Usingqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementingqueue queue=new Implementingqueue();
		try {
		queue.enqueue(4);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		queue.enqueue(50);
		queue.enqueue(50);
		int front=queue.front();
		System.out.println(front);
		while(!queue.isEmpty()) {
			int temp=queue.dequeue();
			System.out.println(temp);
		}
		}
		catch(Exception e) {
			
		}
		
	}

}
