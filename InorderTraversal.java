public class InorderTraversal {
    public static void inorderTraversal(Tree root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(6);
        root.right = new Tree(2);
        root.right.left = new Tree(3);
        InorderTraversal.inorderTraversal(root);
    }
}
