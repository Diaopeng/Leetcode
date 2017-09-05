class Solution {
    public String countAndSay(int n) {
        StringBuffer start = new StringBuffer("1");
        for(int i = 2;i <= n;i++){
            int count = 0;
            StringBuffer temp = new StringBuffer();
            for(int j = 0;j < start.length();j++){
                count ++;
                while(j < start.length() - 1 && start.charAt(j) == start.charAt(j + 1)){
                    count++;
                    j++;
                }
                temp.append(count).append(start.charAt(j));
                count = 0;
            }     
            start = temp;
            
        }
        return start.toString();
    }
}
