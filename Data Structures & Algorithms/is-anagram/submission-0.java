class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false; 
        }

        HashMap<Character, Integer> hash = new HashMap<>(); 
        
        for (int i = 0; i < s.length(); i++) {
            if (hash.get(s.charAt(i)) != null) {
                hash.put(s.charAt(i), hash.get(s.charAt(i)) + 1);
            } else {
                hash.put(s.charAt(i), 1);
            }
        }

        for (int j = 0; j < t.length(); j++) {
            if (hash.get(t.charAt(j)) == null || hash.get(t.charAt(j)) == 0) {
                return false; 
            } else {
                int count = hash.get(t.charAt(j)) - 1; 
                hash.put(t.charAt(j), count); 
            }
        }
        return true; 
    }
}
