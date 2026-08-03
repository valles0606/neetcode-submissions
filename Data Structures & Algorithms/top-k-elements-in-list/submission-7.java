class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        List<Integer>[] counts = new List[nums.length + 1];

        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < counts.length; i++) {
            counts[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            counts[entry.getValue()].add(entry.getKey());
        }

        int[] solution = new int[k];
        int index = 0;

        for(int i = counts.length - 1; i > 0; i--) {
            for (int num : counts[i]) {
                solution[index++] = num;
                if (index == k) {
                    return solution;
                }
            }
        }

        return solution;
    }
}
