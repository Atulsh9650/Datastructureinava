package linkedlist;

import java.util.Scanner;

public class FindNode {
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
	public static int findNode(Node<Integer> head, int n) {
		Node<Integer> temp=head;
		int result=-1;
		int count=0;
		while(temp!=null) {
			if(temp.data==n) {
				result=count;
				return result;
			}
			else {
				count++;
				temp=temp.next;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Node<Integer> head=takeinput();
int n=findNode(head,5);
System.out.println(n);
	}

}
