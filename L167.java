// 简单题
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] result = new int[2];
        int left = 0, right = numbers.length - 1;
        while(left < right ){
            if(numbers[left] + numbers[right] == target){
                result[0] = left + 1;
                result[1] = right + 1;
                break;
            }
            else if(numbers[left] + numbers[right] > target)
                right--;
            else
                left++;
        }
        return result;
    }
}
