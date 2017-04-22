
//求一个数的幂，最简单的想法就是乘n次，复杂度为O(n)
public class Solution{
	public double myPow(double x, int n){
		double result = 1.0,temp = 1.0;
		if(n == 0) {
			return result;
		}
		if(n>0){
			for(int i = 0;i < n;i++){
				result = result * x;
		    }
		}
		if(n<0){
			for(int i = 0;i < n;i++){
				temp = temp * x;
		    }
			result = 1.0/temp;
		}
		return result;
	}
}
//下面使用快速幂的方法得到解

public class Solution {
    public double myPow(double x, int n) {
        double result = 1.0;
        long m = n;     //这个地方为了防止出现整数负的最大值，
        if(m < 0){
            x = 1/x;
            m = -m;
        }
        
        while(m != 0){
            if((m&1) == 1){
                result *= x;
            }
            m>>=1;
            x *= x;
        }
        return result;
    }
}