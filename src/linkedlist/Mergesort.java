package linkedlist;

import java.util.Scanner;

public class Mergesort {
	
	
	
	
	public static Node<Integer> middle(Node<Integer> head) {
		Node<Integer> slow=head,fast=head;
		while(fast.next!=null && fast.next.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}
	public static Node<Integer> mergeSort(Node<Integer> head)
	{
		if(head==null||head.next==null) {
			return head;
		}
		Node<Integer> left=head;
		
		Node<Integer> mid=middle(head);
		Node<Integer> right=mid.next;
		mid.next=null;
		
		left=mergeSort(left);
		right=mergeSort(right);
		
		Node<Integer> newnode=merge(left,right);
		 
		return newnode;
		
	}
	public static Node<Integer> merge(Node<Integer> head1, Node<Integer> head2) {
        //Your code goes here
        if(head1==null){
            return head2;
        }
        if(head2==null){
            return head1;
        }
        Node<Integer> t1= head1, t2= head2;
        Node<Integer> head= null, tail=null;
      if(t1.data<= t2.data){
          head=t1;
          tail=t1;
          t1=t1.next;
      }else{
        head= t2;
        tail=t2;
        t2=t2.next;
      }
      while(t1 != null && t2!= null){
        if(t1.data <= t2.data){
          tail.next= t1;
          tail=t1;
          t1= t1.next;
        }else{
        tail.next= t2;
        tail=t2;
        t2= t2.next;
        }
      }
      if(t1!= null){
        tail.next= t1;
      }else{
        tail.next=t2;
      }
      return head;
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Node<Integer> head=takeinput();
   head=mergeSort(head);
   print(head);
	}

}
