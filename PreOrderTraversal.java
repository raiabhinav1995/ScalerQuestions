public class PreOrderTraversal {
    public static void preOrderTraversal(Tree root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(6);
        root.right = new Tree(2);
        root.right.left = new Tree(3);
        PreOrderTraversal.preOrderTraversal(root);
    }
}
