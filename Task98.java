package Sobes;

public class Task98 {
    public static void main(String[] args) {

    }


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


    public static boolean isValidBST(TreeNode root) {
        return checkNode(root, null, null);
    }

    public static boolean checkNode(TreeNode root, TreeNode min, TreeNode max) {
        if (root == null) {
            return true;
        }
        if (min != null && root.val <= min.val)
            return false;
        if (max != null && root.val >= max.val)
            return false;

        return checkNode(root.left, min, root) &&
                checkNode(root.right, root, max);
    }

}
