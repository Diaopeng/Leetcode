//题目主要是设计了一个start变量
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        combination(result,new ArrayList<Integer>(),1,n,k);
        return result;
    }
    
    public void combination(List<List<Integer>> result, List<Integer> temp, int start,int n, int k){
        if(temp.size() == k)
            result.add(new ArrayList<Integer>(temp));
        else for(int i = start;i <=n;i++){
            temp.add(i);
            combination(result, temp, i+1, n,k);
            temp.remove(temp.size() - 1);
        }
    }
}
