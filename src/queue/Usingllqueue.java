package queue;

public class Usingllqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Implementingllqueuee<Integer> queue=new Implementingllqueuee<>();
		
		 queue.enque(20);
		queue.enque(30);
		queue.enque(40);
		queue.enque(50);
		queue.enque(20);
		queue.enque(30);
		queue.enque(40);
		queue.enque(50);
		queue.enque(20);
		queue.enque(30);
		queue.enque(40);
		queue.enque(50);
	
		while(!queue.isEmpty()){
			try {
			int temp=queue.deque();
			System.out.println(temp);
			}
			catch(QueueEmptyException e){
				System.out.println("queue is empty");
			}
		}
		
	}

}
