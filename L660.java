

// 直接转化成9进制
class Solution {
    public int newInteger(int n) {
        int result = 0,base = 0;
        while(n != 0){
            result = result +  n % 9 * (int)Math.pow(10,base);
            n = n / 9;
            base++;
        }    
        return result;
    }
}
