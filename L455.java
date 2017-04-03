/*
使用贪心算法，比较简单
*/


public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int result=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        for(;i < g.length;++i){
            while(j < s.length){
                if(s[j]>=g[i]){
                    result++;
                    ++j;
                    break;
                }
                else{
                    ++j;
                }
            }
        }
        return result;
    }
}
/*
这种写法看起来比较明了，但是我也不知道为啥比上面的慢了一点点
public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int result=0;
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0,j=0;
        while(i<g.length&&j<s.length ){
            if(s[j]>=g[i]){
                    result++;
                    ++j;
                    ++i;
            }
        else{
            ++j;
        }
        }
        return result;
    }
}
*/