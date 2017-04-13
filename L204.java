
/*
我一直使用O(n^2)的方法都是TLE，这种方法是分享的方法，那么这样的解法的复杂度是多少呢？
*/


public class Solution {
    public int countPrimes(int n) {
        if(n < 3)
        return 0;
        int result = 0;
        boolean noPrime[] = new boolean[n];
        for(int i =2; i < n;i++){
            if(!noPrime[i]){
                result++;
                for(int j = 2;j*i < n;j++){
                    noPrime[j*i] = true;
                }
            }
        }
        return result;
    }
}
