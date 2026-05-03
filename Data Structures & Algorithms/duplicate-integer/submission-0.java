class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> table = new HashSet<Integer>();
        for (int value : nums) {
            if (!table.add(value))
                return true;
        }
        return false;
    }
}