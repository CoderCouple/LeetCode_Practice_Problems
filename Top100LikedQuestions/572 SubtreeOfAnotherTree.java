package Top100LikedQuestions;

public class SubtreeOfAnotherTree {

	public boolean isSubtree(TreeNode s, TreeNode t) {

		if (s == null && t == null)
			return true;

		if (s == null || t == null)
			return false;

		if (s.val == t.val) {
			if (isMatched(s, t))
				return true;
		}

		return isSubtree(s.left, t) || isSubtree(s.right, t);

	}

	public boolean isMatched(TreeNode parent, TreeNode child) {

		if (parent == null && child == null)
			return true;

		if (parent == null || child == null)
			return false;

		if (parent.val != child.val)
			return false;

		return isMatched(parent.left, child.left) && isMatched(parent.right, child.right);
	}

	public static void main(String[] args) {

	}

}
