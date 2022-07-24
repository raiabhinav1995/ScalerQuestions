public class NodeCountOfTree {
    static int countNodes(Tree root) {
        if (root == null) {
            return 0;
        }
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        return 1 + leftCount + rightCount;
    }

    public static void main(String[] args) {
        Tree root = new Tree(1);
        root.left = new Tree(3);
        root.right = new Tree(5);
        System.out.println(NodeCountOfTree.countNodes(root));

    }
}
