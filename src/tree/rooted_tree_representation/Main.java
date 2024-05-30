package tree.rooted_tree_representation;

public class Main {
    public static void main(String[] args) {
        // Creating a tree with root node 1
        Tree tree = new Tree(1);

        // Adding children to the root
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        tree.root.addChild(node2);
        tree.root.addChild(node3);
        tree.root.addChild(node4);

        // Adding children to node 2
        tree.addChild(node2, 5);
        tree.addChild(node2, 6);

        // Adding a child to node 3
        tree.addChild(node3, 7);

        // Adding children to node 4
        tree.addChild(node4, 8);
        tree.addChild(node4, 9);

        // Print out all nodes in the tree
        tree.printAllNodesInTree(tree.root);
    }
}
