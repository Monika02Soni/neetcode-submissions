class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n+n];
        int k = 0;
        for(int i=0;i<nums.length;i++){
            ans[k] = nums[i];
            k++;
        }
        for(int j=0;j<nums.length;j++){
            ans[k+j] = nums[j];
        }
        return ans;
    }
}