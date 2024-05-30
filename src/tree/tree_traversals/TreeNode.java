package tree.tree_traversals;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    // data of tree node (can be in any datatype, based on requirements)
    int data;

    // children of tree node
    List<TreeNode> children;

    public TreeNode(int data) {
        this.data = data;
        this.children = new ArrayList<TreeNode>();
    }

    public TreeNode(int data, List<TreeNode> children) {
        this.data = data;
        this.children = children;
    }

    public void addChild(TreeNode child) {
        this.children.add(child);
    }
}