package binarytree;

public class Nodesatdistancek {

	public static void atdistancek(Binarytreenode<Integer> root,int target,int k) {
		atdistancekhelper(root,target,k);
	}
	public static int atdistancekhelper(Binarytreenode<Integer> root,int target,int k) {
    if(root==null) {
    	return -1;
    }
    if(root.data==target) {
    	printatdistancekdown(root,k);
    	return 0;
    }
    int ld=atdistancekhelper(root.left,target,k);
    if(ld!=-1) {
    	if(ld+1==k) {
    		System.out.print(root.data+" ");
    	}
    	else {
    		printatdistancekdown(root.right,k-ld-2);
    	}
    	return 1+ld;
    }
    int rd=atdistancekhelper(root.right,target,k);
    if(rd!=-1) {
    	if(rd+1==k) {
    		System.out.print(root.data+" ");
    	}
    	else {
    		printatdistancekdown(root.left,k-rd-2);
    	}
    	return 1+rd;
    }
    return -1;
	}
	public static void printatdistancekdown(Binarytreenode<Integer> root,int k) {
		if(root==null) {
			return;
		}
		if(k==0) {
			System.out.print(root.data+" ");
		}
		printatdistancekdown(root.left,k-1);
		printatdistancekdown(root.right,k-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Binarysearchtree bst=new Binarysearchtree();
  	bst.insert(10);
	bst.insert(9);
	bst.insert(11);
	bst.insert(5);
	bst.insert(6);
	bst.insert(7);
	bst.insert(8);
	atdistancek(bst.root,5,3);
	
	}

}
