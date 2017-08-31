class Solution {
    public int nextGreaterElement(int n) {
        char [] number = (n + "").toCharArray();
        int i;
        for(i = number.length - 2;i >= 0;i--){
            if(number[i] < number[i + 1])
                break;
        }
        if(i == -1) return -1;
        
        int small = i + 1;
        for(int j = i + 2;j < number.length;j++){
            if(number[j] < number[small] && number[j] > number[i])
                small = j;
        }
        char temp = number[i];
        number[i] = number[small];
        number[small] = temp;
        
        Arrays.sort(number,i + 1, number.length);
        long result = Long.parseLong(new String(number));
        return result > Integer.MAX_VALUE? -1: (int) result;
        
    }
}
