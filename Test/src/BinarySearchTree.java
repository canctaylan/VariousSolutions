
public class BinarySearchTree {
	
	
	public static class Node
	{
		public Node left;
		public Node right;
		public int value;
		
		Node(int value) {
	        this.value = value;
	        right = null;
	        left = null;
	    }
	}
	static Node root;
	
	public static Node fill(Node node, int value)
	{
		if(node==null)
		{
			node = new Node(value);
			return node;
		}
		else
		{
			if(node.value>value)
			{
				node.left = fill(node.left,value);
			}
			else if(node.value<value)
			{
				node.right = fill(node.right,value);
			}
			else
			{
				return node;
			}
		}
		return node;
		
	}
	
	public static boolean search(Node node, int value)
	{
		boolean result = false;
		if(node.value == value)
			return true;
		else if(node.value>value)
		{
			if(node.left!=null)
			{ 	result = search(node.left,value);
			
			}
		}
		else if(node.value<value)
		{
			if(node.right!=null)
			{ 	result = search(node.right,value);
			
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] values = {5,1,6,7,3,2};
		
		for(int i = 0; i<values.length;i++)
		{
			root = fill(root,values[i]);
		}
		
		int[] values1 =  {1,8,9,3,5};
		
		for(int j = 0; j<values1.length;j++)
		{
			System.out.println(search(root,values1[j]));
		}
		
	}
	

}
