class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mapIdx = new HashMap<Integer, Integer>();
        //O(n)
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (mapIdx.containsKey(diff)) {
                int j = mapIdx.get(diff);
                return new int[] {j, i};
            } else {
                mapIdx.put(nums[i], i);
            }
        }
        //O(n ^ 2)
        /* for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        return new int[] {i, j};
                    } 
                }
            }
        } */
        return new int[]{};
    }
}
