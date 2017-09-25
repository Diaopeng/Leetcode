
//  使用先sort， 后比较的方法，复杂度为O(nlogn)
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0,j = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                result.add(nums1[i]);
                i++;j++;
            }
            else if(nums1[i] > nums2[j])
                j++;
            else 
                i++;
            
        }
        int [] re = new int[result.size()];
        for(int k = 0;k < result.size();k++){
            re[k] = result.get(k);
        }
        return re;
    }
}

// 直接使用HashMap

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0;i < nums1.length;i++){
            if(map.containsKey(nums1[i])) map.put(nums1[i],map.get(nums1[i]) + 1);
            else   map.put(nums1[i], 1);
        }
        
        for(int i = 0;i < nums2.length;i++){
            if(map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                result.add(nums2[i]);
                map.put(nums2[i],map.get(nums2[i]) - 1);
            }
        }
        
        
        int [] re = new int[result.size()];
        for(int k = 0;k < result.size();k++){
            re[k] = result.get(k);
        }
        return re;
    }
}
