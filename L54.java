class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
            return result;
        int left = 0, right = matrix[0].length - 1;
        int top = 0, bot = matrix.length - 1;
        
        while(left <= right && top <= bot){
            for(int i = left;i <= right;i++){
                result.add(matrix[top][i]);
            }
            top++;
            for(int i = top;i <= bot;i++){
                result.add(matrix[i][right]);
            }
            right--;
            
            if(bot >= top){
                for(int i = right;i >= left;i--){
                    result.add(matrix[bot][i]);
                }
            }
            bot--;
            
            if(left <= right){
                for(int i = bot;i >= top;i--){
                    result.add(matrix[i][left]);
                }
            }
            left++;
        }
        return result;
    }
}
