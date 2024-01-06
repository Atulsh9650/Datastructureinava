package linkedlist;

import java.util.Scanner;

public class Deletennode {
public static Node<Integer> deleten(Node<Integer> head,int m,int n){
	if(head==null || m==0) {
		return null;
	}
	if(n==0) {
		return head;
	}
	Node<Integer> currhead=head;
	Node<Integer> temp=null;
   while(currhead!=null) {
   int take=0;
   int skip=0;
   while(currhead!=null && take<m) {
	   if(temp==null) {
		   temp=currhead;
	   }
	   else {
		   temp.next=currhead;
		   temp=currhead;
	   }
	   take++;
	   currhead=currhead.next;
   }
   while(currhead!=null && skip<n) {
	   currhead=currhead.next;
	   skip++;
   }
   }
   if(temp!=null) {
	   temp.next=null;
   }
   return head;
}
public static void print(Node<Integer> head) {
	while(head!=null) {
		System.out.print(head.data+ " ");
		head=head.next;
	}
}
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

			tail.next=newNode;
			tail=newNode;
		}
		data=s.nextInt();
	}
	return head;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Node<Integer> head=takeinput();
   head=deleten(head,2,3);
   print(head);
	}

}
