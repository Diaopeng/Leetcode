/*
又看了一波题解，啥时候才能自己一看一些，然后题目直接Accepted;
这个题目首先想到了不能暴力取在比较大的范围内搜索第i哥ugly数，题目提示了要专心与解决如何自己构造ugly序列，如果这事一种动态规划的思想的话，
转换成如何是使用以前的ugly数计算的到现在的ugly数    Min(L1 * 2, L2 * 3, L3 * 5)状态转移方程，但是如何保证L1,L2,L3保持在比较小
*/



public class Solution {
    public int nthUglyNumber(int n) {
        int nthUgly[] = new int[n];
        int index2 = 0, index3 = 0, index5 = 0;
        int fac2 = 2, fac3 = 3, fac5 =5;
        nthUgly[0] = 1;
        for(int i = 1;i < n;i++){
            nthUgly[i] = Math.min(Math.min(fac2, fac3),fac5);
            
            if(nthUgly[i] == fac2){
                index2++;
                fac2 = 2 * nthUgly[index2];
            }
            if(nthUgly[i] == fac3){
                index3++;
                fac3 = 3 * nthUgly[index3];
            }
            if(nthUgly[i] == fac5){
                index5++;
                fac5 = 5 * nthUgly[index5];
            }
        }
        return nthUgly[n-1];
    }
}
