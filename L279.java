

public class Solution {
    public int numSquares(int n) {
        int [] times = new int[n + 1];
        for(int i = 1;i <= n;i++){
            if(squares(i)) times[i] = 1;
            else{
                times[i] = times[1] + times[i-1];
                for(int j = 2;j <= i/2; j++){
                    times[i] = Math.min(times[i],times[j] + times[i-j]);
                }
            }
        }
        return times[n];
    }
    public boolean squares(int n){
        for(int i = 1;i <= (int)Math.sqrt(n);i++){
            if(i * i == n) return true;
        }
        return false;
    }
}
