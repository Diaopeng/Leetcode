class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int len = A.length;
        int result = 0;
        HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        for(int i = 0;i < A.length;i++){
            for(int j = 0;j < B.length;j++){
                int sum = A[i] + B[j];
                if(map1.containsKey(sum))
                    map1.put(sum, map1.get(sum) + 1);
                else
                    map1.put(sum, 1);
            }
        }
        
        for(int i = 0;i < C.length;i++){
            for(int j = 0;j < D.length;j++){
                int sum = - (C[i] + D[j]);
                if(map1.containsKey(sum)){
                    result += map1.get(sum);
                    
                }
            }
        }
        return result;
    }
}
