



class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue=new LinkedList<>();
        List<List<Integer>> list=new ArrayList<>();
        if(root==null){
            return list;
        }
        queue.offer(root);
        while(!queue.isEmpty()){
            List<Integer> l=new ArrayList<>();
            int n=queue.size();
            for(int i=0;i<n;i++){
            if(queue.peek().left!=null) queue.offer(queue.peek().left);
            if(queue.peek().right!=null) queue.offer(queue.peek().right);
            int head=queue.poll().val;
            l.add(head);
            }
            if((list.size()-1)%2==0){Collections.reverse(l);list.add(l);}
            else{list.add(l);}
            }return list;
        }
    }