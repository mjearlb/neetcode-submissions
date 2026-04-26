class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2]; 
        HashMap<Integer, Integer> hash = new HashMap<>(); 
        int diff; 

        for (int i = 0; i < nums.length; i++) {
            diff = target - nums[i];  
            if (hash.get(diff) != null) {
                ans[0] = hash.get(diff); 
                ans[1] = i; 
                return ans; 
            } else {
                hash.put(nums[i], i); 
            }
        }
        return ans; 
    }
}
