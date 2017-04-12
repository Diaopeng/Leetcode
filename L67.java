/*
采用string直接进行计算，倒序计算，将结果倒置之后返回
string和int相互转换的过程过于复杂
语法错误一： (if else if )和(if if)这样的结构的逻辑关系没有搞清楚
*/



public class Solution {
    public String addBinary(String a, String b) {
        int i = a.length() - 1;
        int j = b.length() - 1;
        StringBuilder s = new StringBuilder();
        int c = 0;
        while(i>=0||j>=0){
            int sum = 0;
            if(i >= 0 && j >= 0){
                sum += a.charAt(i) - '0' + b.charAt(j) - '0' + c;
                i--; j--;
            }
            else if(i >= 0 && j < 0){
                sum += a.charAt(i) - '0'  + c;
                i--; 
            }
            else if(i < 0 && j >= 0){
                sum += b.charAt(j) - '0' + c;
                j--;
            }
            s.append(sum%2);
            c = sum/2;
        }
        if(c == 1){
            s.append(1);
        }
        return s.reverse().toString();
    }
}
