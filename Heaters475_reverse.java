/*
Author: Oliver Gao 
Complexity Time O(nlogn)
Accepted
*/
public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        int result = 0;
        for(int i = 0; i<houses.length; i++){
            int left,right;
            int index = Arrays.binarySearch(heaters,houses[i]);
            if(index<0){
                index = -(index+1);
            }
            if(index>=1){
                left = houses[i]-heaters[index-1];
            }else{
                left = Integer.MAX_VALUE;
            }
            if(index < heaters.length){
                right = heaters[index] - houses[i];
            }else{
                right = Integer.MAX_VALUE;
            }
            result = Math.max(result, Math.min(left,right));
        }
        return result;
    }
}