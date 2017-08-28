package Top100LikedQuestions;

public class MaximumDepthOfBinaryTree {

	public static int maxDepth(TreeNode root) {
		if (root == null)
			return 0;

		int left = maxDepth(root.left);
		int right = maxDepth(root.right);

		if (left >= right)
			return left + 1;
		return right + 1;
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		System.out.println("Maximum depth of the tree : " + maxDepth(root));
	}

}
