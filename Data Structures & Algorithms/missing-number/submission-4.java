class Solution {
    public int missingNumber(int[] nums) {
        // using sum technique also this belongs to linear scans
        int n = nums.length;
        int expected = n * (n+1)/2;
        int actual = 0;
        for(int i : nums){
            actual += i;
        }
        return expected-actual;
        
    }
}
