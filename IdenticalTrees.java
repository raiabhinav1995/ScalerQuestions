public class IdenticalTrees {
    public static boolean identicalTrees(Tree t1, Tree t2) {
        if ((t1 == null && t2 != null) || (t1 != null && t2 == null)) {
            return false;
        } else if (t1 == null && t2 == null) {
            return true;
        }
        boolean leftTreeIdentical = identicalTrees(t1.left, t2.left);
        boolean rightTreeIdentical = identicalTrees(t1.right, t2.right);
        return t1.val == t2.val && (leftTreeIdentical && rightTreeIdentical);


    }

    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(3);
        root.right = new Tree(5);
        Tree root1 = new Tree(1);
        root1.left = new Tree(3);
        root1.right = new Tree(4);
        System.out.println(identicalTrees(root, root1));
    }
}
