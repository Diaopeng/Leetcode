// 最开始的解法
class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        for(int i = 0;i <= Math.log((double)n)/Math.log((double)2);i++){
            if(Math.pow(2,i) == n)
                return true;
        }
        return false;
    }
}

// 后面又想的一种解法

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        while(n != 1){
            if((n&1) == 1)
                return false;
            n = n >> 1;
        }
        return true;
    }
}

// 讨论中的解法

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) return false;
        while(n != 1){
            if((n&1) != 0)
                return false;
            n = n >> 1;
        }
        return true;
    }
}
