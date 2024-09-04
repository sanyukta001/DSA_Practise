import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class closestancestors {
    void markParents(TreeNode root,Map<TreeNode,List<TreeNode>> map){
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            int size = que.size();
            for(int i = 0; i < size; i++){
                TreeNode temp = que.poll();
                if(temp.left != null){
                    que.offer(temp.left);
                    if(!map.containsKey(temp)) map.put(temp.left,new ArrayList(temp));
                    else map.put(temp.left,(new ArrayList<>(map.get(temp))).add(temp));
                }
                if(temp.right != null){
                    que.offer(temp.right);
                    if(!map.containsKey(temp)) map.put(temp.right,new ArrayList(temp));
                    else map.put(temp.right,(new ArrayList<>(map.get(temp))).add(temp));
                }
            }

        }
    }
    TreeNode ancestor(TreeNode root, TreeNode target1 , TreeNode target2){
        Map<TreeNode,List<TreeNode>> map = new HashMap<>();
        markParents(root,map);
        List<TreeNode> t1 = new ArrayList<>(map.get(target1));
        List<TreeNode> t2 = new ArrayList<>(map.get(target2));
        return null;
    }
}
