class Solution {
    public int maxArea(int[] heights) {
        // width*height
        // widht = right-left
        // width*min(heights[right]-heights[left])
        int maxWater = 0;
        int left = 0;
        int right = heights.length-1;
        while(left<right){
            int width = right-left;
            int height = Math.min(heights[right],heights[left]);
            int water = width*height;
            maxWater = Math.max(water, maxWater);
            if(heights[left]<heights[right]){
                left++;
            }else{
                right--;
            }
        }
    return maxWater;
    }
}
