class Solution {
    public int missingNumber(int[] nums) {
        // using XOR technique also this belongs to linear scans
        int n = nums.length;
        int xor = 0;

        for(int i = 0; i<=n; i++){
            xor ^= i;
        }

        for(int i : nums){
            xor ^=i;
        }
        return xor;
        
    }
}
