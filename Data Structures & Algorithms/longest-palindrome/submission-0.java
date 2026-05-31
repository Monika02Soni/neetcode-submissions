class Solution {
    public int longestPalindrome(String s) {
       HashMap<Character, Integer> hashmap = new HashMap<>();
       int res =0;
       for(char c : s.toCharArray()){
        hashmap.put(c, hashmap.getOrDefault(c,0)+1);
        if(hashmap.get(c) % 2 == 0){
                res += 2;
        }
       }

       for(int cnt : hashmap.values()){
        if(cnt % 2 == 1){
            res += 1;
            break;
        }
       }
       return res;
    }
}