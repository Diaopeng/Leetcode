
//使用循环
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0) return false;
        while(n != 1){
            if(n % 3 != 0) return false;
            n = n / 3;
        }
        return true;
    }
}
// 不使用循环

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0) return false;
        return n == Math.pow(3, Math.round(Math.log(n)/Math.log(3)));
    }
}
