public class HeightOfTree {
    public static int heightOfTree(Tree root, int height) {
        if (root == null) {
            return 0;
        }
        return Math.max(1 + heightOfTree(root.left, height), 1 + heightOfTree(root.right, height));
    }

    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(3);
        root.right = new Tree(4);
//        root.right.left = new Tree(3);
        System.out.println(HeightOfTree.heightOfTree(root, 0));
    }
}
