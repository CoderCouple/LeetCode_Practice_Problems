package Top100LikedQuestions;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SymmetricTree {

	public static boolean isSymmetric(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.add(root);
		q.add(root);
		while (!q.isEmpty()) {

			TreeNode root1 = q.remove();
			TreeNode root2 = q.remove();
			if (root1 == null && root2 == null)
				continue;
			if (root1 == null || root2 == null)
				return false;

			if (root1.val != root2.val)
				return false;

			q.add(root1.left);
			q.add(root2.right);
			q.add(root1.right);
			q.add(root2.left);

		}
		return true;
	}

	public static boolean isSymmetric_rec(TreeNode root) {
		return isMirror(root, root);
	}

	public static boolean isMirror(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null)
			return true;
		if (t1 == null || t2 == null)
			return false;
		return (t1.val == t2.val) && isMirror(t1.right, t2.left) && isMirror(t1.left, t2.right);
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(2);

		root.left = left;
		root.right = right;

		System.out.println(isSymmetric(root));
		System.out.println(isSymmetric_rec(root));
	}

}
