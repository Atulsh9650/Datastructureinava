package linkedlist;

import java.util.Scanner;

public class Insertion {
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
	public static Node<Integer> insert(Node<Integer> head,int data,int pos) {
		Node<Integer> newNode=new Node<Integer>(data);
		if(pos==0) {
			newNode.next=head;
			return newNode;
		}
		int i=0;
       Node<Integer> temp=head;
       while(i<pos-1) {
    	   temp=temp.next;
    	   i++;
       }
       newNode.next=temp.next;
       temp.next=newNode;
       return head;
	}
	public static Node<Integer> delete(Node<Integer> head,int pos) {
		Node<Integer> temp=head;
		 if(head==null )
	            return head;
		if(pos==0) {
			head=temp.next;
			return head;
		}
		int i=0;
       
       while(i<pos-1 && temp!=null) {
    	   temp=temp.next;
    	   i++;
       }
       if(temp==null)
           return head;
       if(temp.next!=null)
           temp.next=temp.next.next;
       
       return head;
	}
	public static int length(Node<Integer> head){
		int count=0;
		if(head==null) {
			return count;
		}
		Node<Integer> temp=head;
		while(temp!=null) {
			temp=temp.next;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Node<Integer> head=takeinput();
   //head=insert(head,80,0);
    //head=delete(head,3);
    
    print(head);
   int len= length(head);
   System.out.println(len);
	}

}
