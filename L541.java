/*
这个题目比较简单，就是一般的string的题目，但是要注意的是，string在Java中是不可以更改的，所以必须转换成
StringBuffer或者charArray的，这样才可以进行更改

*/


public class Solution {
    public String reverseStr(String s, int k) {
        StringBuffer temp = new StringBuffer();
        StringBuffer result = new StringBuffer();
        for(int i = 0;i < s.length();){
            int j1 = Math.min(i+k,s.length());
            temp.append(s.substring(i,j1));
            temp.reverse();
            result.append(temp);
            int j2 = Math.min(i+2*k,s.length());
            result.append(s.substring(j1,j2));
            temp.delete(0,j1);
            i += 2*k;
        }
        return result.toString();
    }
}
//这个题目也可以转化成简单charArray  下面是答案的做法

public class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int i = 0;
        while(i < n) {
            int j = Math.min(i + k - 1, n - 1);
            swap(arr, i, j);
            i += 2 * k;
        }
        return String.valueOf(arr);
    }
    private void swap(char[] arr, int l, int r) {
        while (l < r) {
            char temp = arr[l];
            arr[l++] = arr[r];
            arr[r--] = temp;
        }
    }
}