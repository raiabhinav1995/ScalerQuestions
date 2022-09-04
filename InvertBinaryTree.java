public class InvertBinaryTree {
    public static void invertTree(Tree root) {
        if (root == null)
            return;
        invertTree(root.left);
        invertTree(root.right);
        Tree temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    public static boolean isSameTree(Tree root1, Tree root2) {
        if (root1 == null && root2 == null)
            return true;
        if (root1 == null || root2 == null)
            return false;
        if (root1.val != root2.val)
            return false;
        return isSameTree(root1.left, root2.left) && isSameTree(root1.right, root2.right);
    }

    public static void main(String[] args) {
        Tree t = new Tree(5);
        t.left = new Tree(7);
        t.right = new Tree(12);
        Tree t2 = new Tree(5);
        t2.left = new Tree(7);
        t2.right = new Tree(11);
        System.out.println(isSameTree(t, t2));

    }
}
