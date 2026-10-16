class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        if(n==1) return cost[0];
        if(n==2) return Math.min(cost[0],cost[1]);
        int[] dp=new int[n+1];
        int f=cost[0];
        int s=cost[1];
        for(int i=2;i<n;i++){
            int curr=Math.min(f,s)+cost[i];
            f=s;
            s=curr;

        }
        return Math.min(f,s);
    }
}