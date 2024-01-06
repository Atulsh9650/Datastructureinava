package binarytree;

public class Binarysearchtree {
	
	public Binarytreenode<Integer> root;
	
	public boolean hasdata(int data) {
		return hasdatahelper(data,root);
	}
	private boolean hasdatahelper(int data,Binarytreenode<Integer> root) {
		if(root==null) {
			return false;
		}
		
		if(root.data==data) {
			return true;
		}
		else if(data>root.data) {
			return hasdatahelper(data,root.right);
		}
		else {
		 return hasdatahelper(data,root.left);
		}	
	}
	public void insert(int data) {
		root=inserthelper(data,root);
	}
	private Binarytreenode<Integer> inserthelper(int data,Binarytreenode<Integer> root) {
		if(root==null) {
			Binarytreenode<Integer> newnode=new Binarytreenode<>(data);
			return newnode;
		}
		
		if(root.data>data) {
			root.left=inserthelper(data,root.left);
		}
		else{
			root.right=inserthelper(data,root.right);
		}
		return root;
	}
	
	public void delete(int data) {
		root= deletehelper(root,data);
	}
	private Binarytreenode<Integer> deletehelper(Binarytreenode<Integer> root,int data) {
		if(root==null) {
			return null;
		}
	if(data<root.data) {
		root.left=deletehelper(root.left,data);
		return root;
	}
	else if(data>root.data) {
		root.right=deletehelper(root.right,data);
		return root;
	}
	else {
		if(root.left==null && root.right==null) {
			return null;
		}
		else if(root.left!=null && root.right==null) {
			return root.left;
		}
		else if(root.left==null && root.right!=null) {
			return root.right;
		}
		else {
			Binarytreenode<Integer> minnode=root.right;
			while(minnode.left!=null) {
				minnode=minnode.left;
			}
			root.data=minnode.data;
			root.right=deletehelper(root.right,minnode.data);
			return root;
		}
	}
		
	}
	public void print() {
		printhelper(root);
	}
	private  void printhelper(Binarytreenode<Integer> root) {
		if(root==null) {
			return;
		}
		String tobeprinted=root.data+": ";
		if(root.left!=null) {
			tobeprinted+="L"+root.left.data+",";
		}
		if(root.right!=null) {
			tobeprinted+="R"+root.right.data;
		}
		System.out.println(tobeprinted);
		printhelper(root.left);
		printhelper(root.right);
	}
}
