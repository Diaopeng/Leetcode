public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums[] = new int[m+n];
		int i = 0, j = 0;
		while(i<m || j<n){
			if(i == m){
				nums[i+j] = nums2[j];
				j++;
			}
			else if(j == n){
				nums[i+j] = nums1[i];
				i++;
			}
			else if(nums1[i] < nums2[j]){
				nums[i+j] = nums1[i];
				i++;
			}
			else{
				nums[i+j] = nums2[j];
				j++;
			}
	    }
		for(int k = 0;k < m+n;k++ ){
			nums1[k] = nums[k];
		}
    }
}