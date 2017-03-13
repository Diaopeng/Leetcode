/*
Author: Oliver Gao
Complexity: Time: O(n^2)
Status: Time Limit Exceeded
*/
import java.util.*;
public class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        int num[] = new int[houses.length];
        for(int i = 0;i<houses.length;i++){
            int min = 1000000000;
            for(int j = 0;j<heaters.length;j++){
                int temp = Math.abs(houses[i] - heaters[j]);
                if(temp<min)
                min = temp;
            }
            num[i] = min;
        }
        int result = -1;
        for(int i = 0;i<houses.length;i++){
            if(num[i]>result)
            result = num[i];
        }
        return result;
    }
}