class Solution {
    public int rob(int[] nums) {
        int[] dp=new int[nums.length+1];
        dp[0]=0;
        dp[1]=nums[0];
        for(int i=2;i<=nums.length;i++){
            int take=dp[i-2]+nums[i-1];
            int skip=dp[i-1];
            dp[i]=Math.max(take,skip);
        }
        return dp[nums.length];
    }
}