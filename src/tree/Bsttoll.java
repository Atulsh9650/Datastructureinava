package tree;

public class Bsttoll {

	public static Node<Integer> bsttoll(Binarysearchtreenode<Integer> root){
		if(root==null) {
			Pair<Node<Integer>,Node<Integer>> pair=new Pair<>();
			pair.head=null;
			pair.tail=null;
			return pair.head;
		}
		Node<Integer> lhead=bsttoll(root.left);
		Node<Integer> rootnode=new Node<>(root.data);
		Node<Integer> rhead=bsttoll(root.right);
		Pair<Node<Integer>,Node<Integer>> output=new Pair<>();
		if(lhead!=null) {
			lhead.next=rootnode;
		}
		else {
			output.head=lhead;
		}
		if(rhead!=null) {
			rootnode.next=rhead;
			output.tail=rhead;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
