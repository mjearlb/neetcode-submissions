class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>(); 

        for (int num : nums) {
            if (hash.get(num) == null) {
                hash.put(num, 1); 
            } else {
                int count = hash.get(num) + 1; 
                hash.put(num, count); 
            }
        }

        ArrayList<Integer> list = new ArrayList<>(hash.keySet());
        list.sort((a, b) -> hash.get(b) - hash.get(a));
        int[] ans = new int[k]; 

        for (int i = 0; i < k; i++) {
            int key = list.get(i); 
            ans[i] = key; 
        }
        return ans; 
    }
}
