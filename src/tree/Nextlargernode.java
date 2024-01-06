package tree;

import java.util.Scanner;

public class Nextlargernode {
	public static TreeNode<Integer> takeinput(Scanner s){
		System.out.println("enter the root node");
		int n=s.nextInt();
Implementingllqueuee<TreeNode<Integer>> pendingnodes=new Implementingllqueuee<>();
TreeNode<Integer> root=new TreeNode<>(n);
pendingnodes.enque(root);
while(!pendingnodes.isEmpty()) {
	try {
	TreeNode<Integer> rootnode=pendingnodes.deque();
	System.out.println("enter the no. of child nodes");
	int n1=s.nextInt();
	for(int i=0;i<n1;i++) {
		System.out.println("enter the"+(i+1)+"node");
		int child=s.nextInt();
		TreeNode<Integer> children=new TreeNode<>(child);
		rootnode.children.add(children);
		pendingnodes.enque(children);
	}
	}
	catch(QueueEmptyException e) {
		System.out.println(e);
	}
	}
    return root;
	}
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		if(root==null) {
			return null;
		}
		TreeNode<Integer> ans=null;
		if(root.data>n) {
			ans=root;
		}
		for(int i=0;i<root.children.size();i++) {
			TreeNode<Integer> childnode=findNextLargerNode(root.children.get(i),n);
			if(childnode!=null) {
				if(ans==null||ans.data>childnode.data) {
					ans=childnode;
				}
			}
		}
	     return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	       TreeNode<Integer> root1=takeinput(s);
	       
	}

}
