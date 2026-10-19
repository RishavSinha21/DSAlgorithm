class Solution { 
    public int rob(int[] nums) { 
     
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int[] dp = new int[nums.length + 1]; 
        dp[0] = 0; 
        dp[1] = nums[0]; 
        for(int i = 2; i < nums.length; i++){ 
            int take = dp[i - 2] + nums[i - 1]; 
            int skip = dp[i - 1]; 
            dp[i] = Math.max(take, skip); 
        } 
        int ans1 = dp[nums.length - 1];

        int[] dp2 = new int[nums.length + 1]; 
        dp2[0] = 0; 
        dp2[1] = nums[1]; 

        for(int i = 2; i < nums.length; i++){ 
            int take = dp2[i - 2] + nums[i]; 
            int skip = dp2[i - 1]; 
            dp2[i] = Math.max(take, skip); 
        } 
        int ans2 = dp2[nums.length-1];

        return Math.max(ans1, ans2); 
    }
}
