class Solution {
    public static boolean hasDuplicate(int[] nums) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of array");
        // int size = sc.nextInt();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            // for(int j=1;j<nums.length-1;j++){
            // nums[i] = sc.nextInt();
            if(nums[i] == nums[i+1])
            return true;
            }
            return false;
        
        // return false;
    }

    public static void main(String args[]){
        int[] nums = {1,2,3,3};
        System.out.println(hasDuplicate(nums));
    }
}