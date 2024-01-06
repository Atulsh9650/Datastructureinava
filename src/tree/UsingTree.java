package tree;

public class UsingTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeNode<Integer> root=new TreeNode<>(4);
     TreeNode<Integer> child1=new TreeNode<>(5);
     TreeNode<Integer> child2=new TreeNode<>(6);
     TreeNode<Integer> child3=new TreeNode<>(7);
     TreeNode<Integer> leaf1=new TreeNode<>(8);
     
     root.children.add(child1);
     root.children.add(child2);
     root.children.add(child3);
     child1.children.add(leaf1);
     
     System.out.println("root");
	}

}
