class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
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