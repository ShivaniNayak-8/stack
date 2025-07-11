package sjb.mca.tree;

public class BinarySearchTree {
	TreeNode root;
	void insert(int value) {
		root=insertNode(root,value);
	}
	TreeNode insertNode(TreeNode node,int value)
	{
		if(node==null)
		{
			node=new TreeNode(value);
			return node;
		}
		if (value<node.data)
		{
			node.left=insertNode(node.left,value);
		}
		else if(value>node.data)
		{
			node.right=insertNode(node.right,value);
		}
		return node;
	}
	void inorder()
	{
		inorderNode(root);
	}
	void inorderNode(TreeNode node) {
		if(node!=null) {
			inorderNode(node.left);
			System.out.println(node.data);
			inorderNode(node.right);
		}
	}
	public static void main (String args[]) {
		BinarySearchTree b=new BinarySearchTree();
		
		//inorder
//		b.insert(10);
//		b.insert(40);
//		b.insert(5);
//		b.inorder();
		
		//inorder
		b.insert(17);
		b.insert(10);
		b.insert(16);
		b.insert(3);
		b.insert(20);
		b.inorder();
		
		
		
	}
}

