/*
这种方法太过复杂，必须使用多种类，string在java中不可改变，导致错误。
使用另外一种较为简单的方法
*/




public class Solution {
    public String addBinary(String a, String b) {
        String s1 = new StringBuffer(a).reverse().toString();
        String s2 = new StringBuffer(b).reverse().toString();
        int len1 = s1.length();
        int len2 = s2.length();
        String result = new String();
        ArrayList temp = new ArrayList();
        if(len1>len2){
            for(int i = len2; i < len1;i++){
                s2.charAt(i) = '0';
            }
        }
        else{
            for(int i = len1; i < len2;i++){
                s1.charAt(i) = '0';
            }
        }
        int nums1[] = new int[s1.length];
        int nums2[] = new int[s2.length];
        for(int i = 0;i < s1.length();i++){
            nums[i] = s1.charAt(i) - 48;
        }
        for(int i = 0;i < s2.length();i++){
            nums[i] = s2.charAt(i) - 48;
        }
        int c = 0;
        for(int i = 0;i < nums1.length;i++){
            if(nums1[i]+nums2[i]+c<2){
                temp.add(nums1[i]+nums2[i]+c);
                c = 0;
            }
            else{
                temp.add(nums1[i]+nums2[i]+c-2);
                c = 1;
            }
        }
        if(c == 1){
            temp.add(1);
        }
        for(int i = 0; i < temp.size();i++){
            result.charAt(i) = temp.get(i) + 48;
        }
        String last = new StringBuffer(result).reverse().toString();
        return result;
    }
}
