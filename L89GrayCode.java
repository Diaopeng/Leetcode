
/*
Author: Oliver Gao
O(n)
这种解法是从别人那里学来的，完美的移位操作
因为Math.pow需要传浮点的参数，所以直接使用移位对整数进行操作，非常方便
然后使用移位操作直接求格雷码
*/

public class Solution {
    public List<Integer> grayCode(int n) {
        int num = 1<<n;
        List<Integer> result = new ArrayList<Integer>();
        for( int i = 0; i<num; i++){
            result.add((i >> 1) ^ i);
        }
        return result;
    }
}