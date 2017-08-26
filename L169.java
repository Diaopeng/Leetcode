class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int m = nums.length;
        return nums[(m - 1)/2];
    }
}
