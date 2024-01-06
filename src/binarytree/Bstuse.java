package binarytree;

public class Bstuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Binarysearchtree bst=new Binarysearchtree();
		bst.insert(10);
		bst.insert(9);
		bst.insert(11);
		bst.insert(5);
		bst.insert(6);
		bst.delete(9);
		bst.print();

	}

}
