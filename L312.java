class Solution {
    public int maxCoins(int[] nums) {
        int array[] = new int[nums.length + 2];
        array[0] = 1;
        array[array.length-1] = 1;
        for (int i = 0; i < nums.length; i++) {
            array[i+1] = nums[i];
        }

        int dp[][] = new int[array.length][array.length]; 
        for (int i =0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                dp[i][j] = 0;
            }
        }

        for (int i=1; i< array.length-1; i++) {
            for (int j=i; j >=1; j--) {
                for (int k=j; k <= i; k++) {
                    dp[j][i] = Math.max(array[j-1]*array[k]*array[i+1] + dp[j][k-1] + dp[k+1][i], dp[j][i]);
                }
            }
        }

        return dp[1][array.length-2];
    }
}
