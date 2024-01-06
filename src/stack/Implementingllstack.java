package stack;

public class Implementingllstack {
private Node<Integer> head;
private int size;
	
public Implementingllstack() {
	head=null;
	size=0;
}
public int size() {
	
		
	return size;
}
public int top() {
	if(size()==0) {
		return -1;
	}
	return head.data;
}
public boolean isempty() {
	if(size()==0) {
		return true;
	}
	else {
		return false;
	}
}
public void push(int ele) {
	Node<Integer> newnode=new Node<>(ele);
	if(head==null) {
		head=newnode;
	}
	else {
		newnode.next=head;
		head=newnode;
	}
	size++;
	
}
public int pop() {
	if(head==null) {
		return -1;
	}
	size--;
	
	int temp=head.data;
	head=head.next;
	return temp;
	

}
}
