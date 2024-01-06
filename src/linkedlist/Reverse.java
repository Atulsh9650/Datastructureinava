package linkedlist;

import java.util.Scanner;

public class Reverse {
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

	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+ " ");
			head=head.next;
		}
	}
	public static Node<Integer> middle(Node<Integer> head) {
		Node<Integer> slow=head,fast=head;
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	public static Node<Integer> reverse(Node<Integer> head){
		if(head==null||head.next==null) {
			return head;
		}
		Node<Integer> newNode=null;
		while(head!=null) {
			Node<Integer> next=head.next;
			head.next=newNode;
			newNode=head;
			head=next;
		}
		return newNode;
	}
	public static boolean isPalindrome(Node<Integer> head) {
		//Your code goes here
		if(head==null || head.next==null) {
			return true;
		}
		Node<Integer> s=middle(head);
		s.next=reverse(s.next);
		s=s.next;
		while(s!=null) {
			if(head.data!=s.data) 
				return false;
			
			head=head.next;
			s=s.next;
		}
		return true;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Node<Integer> head=takeinput();
//head=reverse(head);
print(head);
Node<Integer> middlenode=middle(head);
System.out.println(middlenode.data);
boolean res=isPalindrome(head);
System.out.println(res);
	}

}
