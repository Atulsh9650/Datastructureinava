package tree;
import java.util.Scanner;
public class Takeinputrecursive {

	public static TreeNode<Integer> takeinput(Scanner s){
		
		System.out.println("enter root node");
		int n=s.nextInt();
		TreeNode<Integer> root =new TreeNode<Integer>(n);
		System.out.println("enter no. of child nodes");
		int c=s.nextInt();
		for(int i=0;i<c;i++) {
			TreeNode<Integer> child=takeinput(s);
			root.children.add(child);
		}
		return root;
		
	}
	public static void print(TreeNode<Integer> root) {
		String s=root.data+":";
		for(int i=0;i<root.children.size();i++) {
			s=s+root.children.get(i).data+",";
		}
		System.out.println(s);
		for(int i=0;i<root.children.size();i++) {
			print(root.children.get(i));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		 TreeNode<Integer> root=takeinput(s);
		 print(root);
	}

}
