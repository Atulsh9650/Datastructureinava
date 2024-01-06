package binarytree;
import java.util.Queue;
import java.util.LinkedList;
public class Checkcousin {

	public static int findLevel(Binarytreenode<Integer> root, int target) {
        if (root == null) {
            return -1; // Target not found in the tree
        }
        
        Queue<Binarytreenode<Integer>> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            
            for (int i = 0; i < levelSize; i++) {
            	Binarytreenode<Integer> node = queue.poll();
                
                if (node.data == target) {
                    return level; // Return the level when the target is found
                }
                
                if (node.left != null) {
                    queue.offer(node.left);
                }
                
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            
            level++;
        }
        
        return -1; // Target not found in the tree
    }
	public static boolean isCousin(Binarytreenode<Integer> root, int p, int q) {
		// Write your code here
		if(root==null) {
			return false;
		}
	boolean isp=isCousin(root.left,p,q);
	boolean isq=isCousin(root.right,p,q);
	int plevel=findLevel(root,p);
	int qlevel=findLevel(root,q);
	if(plevel!=-1 && qlevel!=-1 && plevel==qlevel &&) {
		return true;
	}
	return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
