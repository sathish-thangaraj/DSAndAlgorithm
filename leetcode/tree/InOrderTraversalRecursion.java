/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class InOrderTraversalRecursion {
    public List<Integer> inorderTraversal(TreeNode root) {
        
        List<Integer> output = new ArrayList<Integer>();
        output = traversal(root,output);
        return output;
    }
    
    public List<Integer> traversal(TreeNode root , List<Integer> output){
        
        if(root!=null){
            traversal(root.left,output);
            output.add(root.val);
            traversal(root.right,output);
            
        }
        return output;
    }
}
