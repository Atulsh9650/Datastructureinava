package binarytree;

public class Ancestor {

	public static int getLCA(Binarytreenode<Integer> root,int x,int y) {
		if(root==null) {
			return -1;
		}
		if(root.data==x || root.data==y) {
			return root.data;
		}
		
		if(getLCA(root.left,x,y)!=-1 && getLCA(root.right,x,y)==-1){
			return getLCA(root.left,x,y);
		}
		else if(getLCA(root.left,x,y)==-1 && getLCA(root.right,x,y)!=-1){
			return getLCA(root.right,x,y);
		}
		else if(getLCA(root.left,x,y)!=-1 && getLCA(root.right,x,y)!=-1){
			return root.data;
		}
		else {
			return -1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Binarysearchtree bst=new Binarysearchtree();
     bst.insert(10);
     bst.insert(7);
     bst.insert(12);
     bst.insert(18);
     bst.print();
     int lca=getLCA(bst.root,4,9);
     System.out.println(lca);
	}

}
