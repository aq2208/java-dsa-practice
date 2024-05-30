package tree.rooted_tree_representation;

public class Tree {
    TreeNode root;

    // init tree
    public Tree(int rootData) {
        this.root = new TreeNode(rootData);
    }

    public void addChild(TreeNode parent, int childData) {
        parent.addChild(new TreeNode(childData));
    }

    public void printAllNodesInTree(TreeNode root) {
        System.out.print(root.data + " ");
        for (TreeNode child : root.children) {
            printAllNodesInTree(child);
        }
    }
}
