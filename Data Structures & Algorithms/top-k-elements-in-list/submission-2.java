class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencies = new HashMap<Integer, Integer>();

        //O(n) + O(n log n) + O(k) = O(n log n)
        for (int num : nums) {
            if (frequencies.containsKey(num)) {
                Integer counter = frequencies.get(num);
                frequencies.put(num, counter + 1);
                
            } else {
                frequencies.put(num, 1);
            }
        }
        
        Comparator<Map.Entry<Integer, Integer>> reversedComparator =
            Comparator.comparingInt((Map.Entry<Integer, Integer> entry) -> entry.getValue())
                .reversed();

        return frequencies.entrySet().stream()
                .sorted(reversedComparator)
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
