package henrro.solvedproblems.leetcode;

/*
    Name: 1123. Lowest Common Ancestor of Deepest Leaves
    Link: https://leetcode.com/problems/lowest-common-ancestor-of-deepest-leaves/description/
*/
public class Problem1123 {

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode lcaDeepestLeaves(TreeNode root) {
        int maxDepth = maxDepth(root);
        return dfs(root, maxDepth, 0);
    }

    private TreeNode dfs(TreeNode root, int maxDepth, int len) {
        if (root == null) return null;
        if (maxDepth - 1 == len) return root;
        TreeNode left = dfs(root.left, maxDepth, len + 1);
        TreeNode right = dfs(root.right, maxDepth, len + 1);

        if (left != null && right != null) return root;
        return left != null ? left : right;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        Problem1123 instance = new Problem1123();
        TreeNode root = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6, null, null),
                        new TreeNode(2,
                                new TreeNode(7, null, null),
                                new TreeNode(4, null, null)
                        )
                ),
                new TreeNode(1,
                        new TreeNode(0, null, null),
                        new TreeNode(8, null, null)
                ));
        System.out.println(instance.lcaDeepestLeaves(root).val);
    }

}
