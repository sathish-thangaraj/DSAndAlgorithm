import java.util.List;

public class MaximumDepthTopDown {

    private static int answer =1;

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args){
        TreeNode node = new TreeNode(3);
        node.left = new TreeNode(9);
        node.right = new TreeNode(20);
        node.right.left = new TreeNode(15);
        node.right.right = new TreeNode(7);
        node.right.left.left = new TreeNode(100);
        node.right.left.left.left = new TreeNode(200);
        node.right.left.right = new TreeNode(150);

        System.out.println(findMaximumDepth(node,1));
    }

    public static int findMaximumDepth(TreeNode root,int depth){

        if(root == null){
            return 0 ;
        }
        if(root.left ==null || root.right==null){
            answer = Math.max(answer,depth);
        }
        findMaximumDepth(root.left,depth+1);
        findMaximumDepth(root.right,depth+1);
        return answer;
    }
}
