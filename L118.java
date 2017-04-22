/*
这个题目比较简单，主要是熟悉java中的集合操作
或者用C++ vector
*/




public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Triangle  = new ArrayList<List<Integer>>();
        if(numRows == 0){
            return Triangle;
        }
        for(int i = 0;i < numRows;i++){
            List<Integer> L = new ArrayList<Integer>();
            for(int j = 0;j <= i;j++){
                if(j == 0 || j == i){
                    L.add(1);
                }else{
                    L.add(Triangle.get(i-1).get(j-1)+ Triangle.get(i-1).get(j));
                }
            }
            Triangle.add(L);
            
        }
        return Triangle;
    }
}
