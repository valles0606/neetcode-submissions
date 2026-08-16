class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] buckets = new List[nums.length + 1];
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            buckets[entry.getValue()].add(entry.getKey());
        }

        int index = 0;
        int[] sol = new int[k];

        for (int i = buckets.length - 1; i > 0; i--) {
            for (int num : buckets[i]) {
                sol[index++] = num;
                if (index == k) {
                    return sol;
                }
            }
        }

        return sol;
    }
}
