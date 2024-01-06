package linkedlist;

import java.util.Scanner;

public class Appendlastnodetofirst {
	public static Node<Integer> takeinput(){
		Node<Integer> head=null,tail=null;
		Scanner s=new Scanner(System.in);
		int data=s.nextInt();
		while(data!=-1) {
			Node<Integer> newNode=new Node<Integer>(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
//				Node<Integer> temp=head;
//				while(temp.next!=null) {
//					temp=temp.next;
//				}
//				temp.next=newNode;
				tail.next=newNode;
				tail=newNode;
			}
			data=s.nextInt();
		}
		return head;
	}
public static Node<Integer> append(Node<Integer> head,int n){
	if(n==0||head==null) {
		return head;
	}
	int count=0;
	Node<Integer> temp=head;
	while(temp!=null) {
		
		temp=temp.next;
		count++;
	}
	int i=1;
	Node<Integer> tail=head;
	while(i<count-n) {
		tail=tail.next;
		i++;
	}
	Node<Integer> newNode=tail.next;
	tail.next=null;
	tail=newNode;
	int j=1;
	while(j<n) {
		tail=tail.next;
		j++;
	}
	tail.next=head;
	 head=newNode;
	return head;
}
public static void print(Node<Integer> head) {
	while(head!=null) {
		System.out.print(head.data+ " ");
		head=head.next;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Node<Integer> head=takeinput();
append(head,2);
print(head);
	}

}
