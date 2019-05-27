import java.util.*;

public class LevelOrderTraversal {

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
        List<List<Integer>> output = levelOrdertraversal(node);
        System.out.println("output"+output);
    }

    public static List<List<Integer>> levelOrdertraversal(TreeNode root){
        List<List<Integer>> output = new ArrayList<>();
        if(root==null)
            return output;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            int size = queue.size();
            System.out.println(size);
            List<Integer> levelList=new ArrayList<Integer>();
            for(int i=0 ; i<size;i++){
             TreeNode node = queue.poll();
             levelList.add(node.val);
             if(node.left!=null){
                 queue.offer(node.left);
             }
             if(node.right!=null){
                 queue.offer(node.right);
             }
            }
            output.add(levelList);
        }
        return output;
    }


}
