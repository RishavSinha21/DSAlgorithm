class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        
        return solveit(dp,m-1,n-1);
    }
    int solveit(int[][] dp,int m,int n){
        if(m==0 || n==0){
            return 1;
        }
        if (dp[m][n] != 0) {
            return dp[m][n];
        }
        dp[m][n]=solveit(dp,m-1,n)+solveit(dp,m,n-1);
        return dp[m][n];
    }
}