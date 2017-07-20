package code;
/****
 * 
 * serialize and deserialize binary tree
 * @author wxq
 *
 */
public class SerializeAndDeserialize {
	private int index = -1;

	public String SerializeTree(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		if (root == null) {
			sb.append("#,");
			return sb.toString();

		}
		sb.append(String.valueOf(root.val)+",");
		sb.append(SerializeTree(root.left));
		sb.append(SerializeTree(root.right));
		return sb.toString();
	}

	public TreeNode DeserializeTree(String str) {
		index++;
		String[] l = str.split(",");
		TreeNode r = null;
		if (!l[index].equals("#")) {
			r = new TreeNode(Integer.valueOf(l[index]));
			r.left = DeserializeTree(str);
			r.right = DeserializeTree(str);
		}
		return r;

	}

}

class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int val) {
		this.val = val;

	}

}
