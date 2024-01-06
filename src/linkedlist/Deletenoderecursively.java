package linkedlist;

public class Deletenoderecursively {
	public static Node<Integer> delete(Node<Integer> head,int pos){
		if(pos==0) {
			
			
			return head.next;
		}
		if(head==null ||head.next==null) {
			return head;
		}
		head.next=delete(head.next,pos-1);
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head=new Node<>(10);
        Node<Integer> second=new Node<>(20);
        Node<Integer> third=new Node<>(30);
        head.next=second;
        second.next=third;
        head=delete(head,3);
        while(head!=null) {
        	System.out.print(head.data+" ");
        	head=head.next;
        }
	}

}
