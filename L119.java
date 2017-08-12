public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> Triangle = new ArrayList<List<Integer>>();
        List<Integer> result = new ArrayList<Integer>();
		for(int i = 0;i <= rowIndex;i++){
			List<Integer> row = new ArrayList<Integer>();
			for(int j = 0;j <= i;j++){
				if(j == 0 || i == j){
					row.add(1);
				}
				else{
					row.add(Triangle.get(i-1).get(j-1)+Triangle.get(i-1).get(j));
				}	
			}
			if(i == rowIndex){
			    result = row;
			}
			Triangle.add(row);
		}
		return result;
    }
}

//我们降低空间复杂度，将空间复杂度降低至O(k)
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0;i < rowIndex + 1; i++){
            result.add(1);
            for(int j = i - 1;j >= 1;j--){
                result.set(j, result.get(j) + result.get(j-1));
            }
        }
        return result;
            
    }
}
