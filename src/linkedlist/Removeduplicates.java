package linkedlist;

import java.util.Scanner;

public class Removeduplicates {
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
	
public static Node<Integer> remove(Node<Integer> head){
	if(head==null){
		return head;
	}
	Node<Integer> currhead=head;
	while(currhead.next!=null){
		if(currhead.data.equals(currhead.next.data)){
			currhead.next=currhead.next.next;
		}
		else{
			currhead=currhead.next;
		}
	}
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
		remove(head);
		print(head);
	}

}
