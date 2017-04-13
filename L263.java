
//这是题解中我觉得可能会比较快的，其实复杂度是一样的，只是这个解法使用了位操作，但是感觉差不到哪里去
public class Solution {
    public boolean isUgly(int num) {
        if(num == 1){
            return true;
        }
        if(num ==0){
            return false;
        }
        while(num%2 == 0) num = num >>1;
        while(num%3 == 0) num = num /3;
        while(num%5 == 0) num = num /5;
        
        return num == 1;
    }
}

/*
这个题目最坑比的地方在有一个测试数据是0,如果不判断num 等不等于0的话，会TLE
*/
public class Solution {
    public boolean isUgly(int num) {
        if(num == 1){
            return true;
        }
        if(num ==0){
            return false;
        }
        while(num != 1){
            if(num%2 == 0){
                num = num / 2;
            }
            else if(num%3 == 0){
                num = num / 3;
            }
            else if(num%5 == 0){
                num = num / 5;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
