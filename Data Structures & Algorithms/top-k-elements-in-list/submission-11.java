class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>(); 
        List<Integer>[] buckets = new List[nums.length + 1];

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> f : freq.entrySet()) {
            buckets[f.getValue()].add(f.getKey());
        }

        int[] solution = new int[k];
        int index = 0;

        for (int i = buckets.length - 1; i > 0; i--) {
            for (int n : buckets[i]) {
                solution[index++] = n;
                if (index == k) {
                    return solution;
                }
            }
        }
        return solution;
    }
}
