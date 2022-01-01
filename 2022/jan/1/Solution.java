class Solution {
    public int maxCoins(int[] nums) {
        if(nums.length==1){return nums[0];}
        int[][] dp = new int[nums.length+2][nums.length+2];
        int[] arr = new int[nums.length+2];
        arr[0] = 1;
        arr[arr.length-1] = 1;
        for(int i = 1; i < arr.length - 1; i++) {
            arr[i] = nums[i-1];
        }
        for(int i = 1; i < arr.length - 1; i++) {
            dp[i][i] = arr[i-1] * arr[i] * arr[i+1];
        }
        for(int i = 1; i < arr.length-2; i++) {
            for(int j = 1; j < arr.length - i-1; j++) {
                for(int k = j; k <= j+i; k++) {
                    dp[j][j+i] = Math.max(dp[j][k-1] + dp[k+1][j+i] + (arr[j-1]*arr[k]*arr[j+i+1]),dp[j][j+i]);
                }
            }
        }
        return dp[1][arr.length-2];
    }
}
