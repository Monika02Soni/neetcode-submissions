class Solution {
    public int pivotIndex(int[] nums) {
        // for left
        int totalSum = 0;
        for(int i=0;i<nums.length;i++){
            totalSum += nums[i];
        }

        int leftSum = 0;
        for(int i=0;i<nums.length;i++){
            int rightSum = totalSum -leftSum - nums[i];
            if(rightSum == leftSum){
                return i;
            }

            leftSum += nums[i];
        }
        return -1;
    }
}