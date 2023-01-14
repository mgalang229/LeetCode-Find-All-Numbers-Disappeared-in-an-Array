class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int[] freq = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            freq[nums[i]]++;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (freq[i] == 0) {
                arr.add(i);
            }
        }
        return arr;
    }
}
