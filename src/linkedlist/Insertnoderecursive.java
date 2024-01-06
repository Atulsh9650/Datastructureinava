package linkedlist;

public class Insertnoderecursive {

	public static Node<Integer> insert(Node<Integer> head,int pos,int ele){
		if(pos==0) {
			Node<Integer> newnode=new Node<Integer>(ele);
			newnode.next=head;
			return newnode;
		}
		if(head==null) {
			return head;
		}
		head.next=insert(head.next,pos-1,ele);
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Node<Integer> head=new Node<>(10);
        Node<Integer> second=new Node<>(20);
        Node<Integer> third=new Node<>(30);
        head.next=second;
        second.next=third;
        head=insert(head,0,40);
        while(head!=null) {
        	System.out.print(head.data+" ");
        	head=head.next;
        }
	}

}
