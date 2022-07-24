public class InvertTree {
    public static void invertTree(Tree root) {
        if (root == null) return;
        if (root.left == null && root.right != null || root.left != null && root.right == null || root.left != null && root.right != null) {
            Tree temp = root.left;
            root.left = root.right;
            root.right = temp;
        } else if (root.left == null && root.right == null) {
            return;
        }
        invertTree(root.right);
        invertTree(root.left);
    }

    public static void main(String[] args) {

        Tree root = new Tree(5);
        root.left = new Tree(1);
        root.left.left = new Tree(2);
        //root.right = new Tree(3);
        //root.right.left = new Tree(6);
//        root.right.right = new Tree(7);
        InorderTraversal.inorderTraversal(root);
        invertTree(root);
        InorderTraversal.inorderTraversal(root);

    }
}
