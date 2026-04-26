
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>(); 
        for (int num : nums) {
            hash.add(num); 
            //hash.put(num); 
        }        
        if (hash.size() != nums.length) {
            return true; 
        }
        return false; 
    }
}
