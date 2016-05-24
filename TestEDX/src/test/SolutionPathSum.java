package test;

public class SolutionPathSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public boolean  hasPathSum(TreeNode treeNode, int sum) {
		
		if (sum == getSum(treeNode, treeNode.val)) return true;
		
		return false;
	}
	
	private int getSum(TreeNode treeNode, int sum) {
		if (treeNode.left != null) {
			if (treeNode.right != null) {
				if (treeNode.left.val< treeNode.right.val) {
					return getSum(treeNode.left, sum + treeNode.left.val);
				}else {
					return getSum(treeNode.right, sum + treeNode.right.val);
				}
			}else {
				return getSum(treeNode.left, sum + treeNode.left.val);
			}				
		}else if (treeNode.right != null) {
			return getSum(treeNode.right, sum + treeNode.right.val);
		}else {
			return sum;
		}		
	}
	
	 public class TreeNode {
	    int val;
	    TreeNode left;
	    TreeNode right;
	    TreeNode(int x) { val = x; }
	 }
}
