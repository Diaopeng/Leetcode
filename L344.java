class Solution {
    public String reverseString(String s) {
        char [] array = s.toCharArray();
        int i = 0, j = array.length - 1;
        while(i < j){
            char temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;j--;
        }
        return String.valueOf(array);
    }
}
