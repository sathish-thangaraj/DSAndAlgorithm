import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class PreOrderTraversalRecursion {
    public static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

  public static void main(String[] args){
        TreeNode node = new TreeNode(1);
        node.left = null ;
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(3);
        node.right.right = null ;

        traversal(node);
  }

    public static void traversal(TreeNode root){
        List<Integer> output = new ArrayList<Integer>();
        output = helper(root,output);
        System.out.println(output.size());
    }

    public static List<Integer> helper(TreeNode root,List<Integer> output){
        if(root!=null){
            output.add(root.val);
            helper(root.left,output);
            helper(root.right,output);
        }
        return output;
    }
}



