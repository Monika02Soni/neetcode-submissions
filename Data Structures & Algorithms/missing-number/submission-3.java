class Solution {
    public int missingNumber(int[] nums) {
        // int i=0;
        Arrays.sort(nums);
        int n = 9;
        Set<Integer> set = Arrays.stream(nums)
                        .boxed()
                                .collect(Collectors.toSet());

        List<Integer> list = IntStream.rangeClosed(0,n)
                        .filter(i -> !set.contains(i))
                                .boxed()
                                        .toList();
        return list.get(0);
    }
}
