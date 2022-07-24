public class PostOrderTraversal {
    public static void postOrderTraversal(Tree root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(6);
        root.right = new Tree(2);
        root.right.left = new Tree(3);
        PostOrderTraversal.postOrderTraversal(root);
    }
}
