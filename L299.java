class Solution {
    public String getHint(String secret, String guess) {
        int A = 0, B = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0;i < secret.length();i++){
            if(secret.charAt(i) == guess.charAt(i))
                A++;
            else if(map.containsKey(secret.charAt(i)))
                map.put(secret.charAt(i),map.get(secret.charAt(i)) + 1);
            else
                map.put(secret.charAt(i),1);
        }
        for(int i = 0;i < secret.length();i++){
            if(map.containsKey(guess.charAt(i)) && secret.charAt(i) != guess.charAt(i)){
                if(map.get(guess.charAt(i)) == 1)
                    map.remove(guess.charAt(i));
                else
                    map.put(guess.charAt(i), map.get(guess.charAt(i)) -1);
                B++;
            }
        }
        return A + "A" + B +"B";
    }
}
