public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0;i < input.length();i++){
            if(input.charAt(i) == '+' || input.charAt(i) == '-' ||input.charAt(i) == '*'){
                String left = input.substring(0,i);
                String right = input.substring(i+1);
                List<Integer> leftresult = diffWaysToCompute(left);
                List<Integer> rightresult = diffWaysToCompute(right);
                for(Integer l: leftresult){
                    for(Integer r:rightresult){
                        int c = 0;
                        switch(input.charAt(i)){
                            case '+': c= l+r;
                            break;
                            case '-': c= l-r;
                            break;
                            case '*': c= l*r;
                            break;
                        }
                        result.add(c);
                    }
                }
            }
        }
        if(result.size() == 0) result.add(Integer.valueOf(input));
        return result;
    }
}