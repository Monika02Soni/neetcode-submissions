class Solution {
    public int[] twoSum(int[] numbers, int target) {
        // numbers in ascending order
        // hashmap to get the indices
        // index1 < index2 
        // index1 != index2
        // index1+index = target
        int[] arr = new int[2];
        int k = 0;
        for(int i = 0 ;i<numbers.length; i++){
            for(int j = i+1;j<numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    arr[0] = i+1;
                    arr[1] = j+1;
                    return arr;
                }
            }
    }
    return arr;
    }
}
