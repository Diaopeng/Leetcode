
//自己想的解法，为了避免重复解，进行了很多额外的运算
public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
        HashSet<List<Integer> > set = new HashSet<List<Integer> >();
        List<List<Integer> >result = new ArrayList<List<Integer> >();
        Arrays.sort(nums);
        for(int i = 0;i < nums.length;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            if(nums[i] > 0) break;
            for(int j = i + 1;j < nums.length; j++){
                if(map.containsKey(nums[j])){
                    List<Integer> temp = new ArrayList<Integer>();
                    temp.add(nums[i]);
                    temp.add(-nums[i] - nums[j]);
                    temp.add(nums[j]);
                    if(set.add(temp))
                        result.add(temp);
                }
                else{
                    map.put(-nums[i] - nums[j], j);
                }
            }
            map.clear();
        }
        return result;
    }
}

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer> >result = new ArrayList<List<Integer> >();
        Arrays.sort(nums);
        for(int i = 0;i < nums.length - 2;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            if(nums[i] > 0) break;
            int small = i + 1,big = nums.length - 1, target = - nums[i];
            while(small < big){
                if(nums[small] + nums[big] == target){
                    result.add(Arrays.asList(nums[i],nums[small],nums[big]));
                    while(small < big && nums[small] == nums[small + 1]) small ++;
                    while(small < big && nums[big - 1] == nums[big]) big --;
                    small ++; big --;
                }
                else if(nums[small] + nums[big] > target) big --;
                else small ++;
            }
        }
        return result;
    }
}
