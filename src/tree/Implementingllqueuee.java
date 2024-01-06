package tree;

public class Implementingllqueuee<T> {
	private Node<T> front;
	private Node<T> rear;
	private int size;

	public Implementingllqueuee() {
		front=null;
		rear=null;
		size=0;
	}
	public int size() {
		return size;
	}
	public boolean isEmpty() {
		return size==0;
	}
	public T front()  throws QueueEmptyException {
		if(size==0) {
			 throw new QueueEmptyException();
		}
		return front.data;
	}
	public void enque(T ele) {
		Node<T> newnode=new Node<T>(ele);
		if(rear==null) {
			front=newnode;
			rear=newnode;
		}
		else {
	         
			rear.next=newnode;	
			rear=newnode;
		}
		size++;
	}
	public T deque()throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
		}
		T temp=front.data;
		front=front.next;
		if(size==1) {
			rear=null;
		}
		size--;
		return temp;
	}
	}

