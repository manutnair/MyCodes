public class Main {
  public static void main(String[] args) throws Exception {
  
    BinaryTree bt = BinaryTree.create();
  
    System.out
        .println("printing nodes");
    bt.inOrder();
  }
}
class BinaryTree {
  static class TreeNode {
    String data;
    TreeNode left, right;
    TreeNode(String value) {
      this.data = value;
      left = right = null;
    }
  }

  TreeNode root;

  public void inOrder() {
    inOrder(root);
  }
  private void inOrder(TreeNode node) {
    if (node == null) {
      return;
    }
    inOrder(node.left);
    System.out.printf("%s ", node.data);
    inOrder(node.right);
  }
 
  public static BinaryTree create() {
    BinaryTree tree = new BinaryTree();
    TreeNode root = new TreeNode("4");
    tree.root = root;
    tree.root.left = new TreeNode("5");
    tree.root.left.left = new TreeNode("2");
    tree.root.left.left.left = new TreeNode("1");
    tree.root.left.right = new TreeNode("6");
        tree.root.left.right.left = new TreeNode("3");
       return tree;
  }
}