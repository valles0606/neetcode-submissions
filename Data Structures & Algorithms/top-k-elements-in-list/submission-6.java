class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] freq = new List[nums.length + 1];
        Map<Integer, Integer> counts = new HashMap<>(); 

        for (int num : nums) {
            counts.put(num, counts.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < freq.length; i++) {
            freq[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> c : counts.entrySet()) {
            freq[c.getValue()].add(c.getKey());
        }

        int[] solution = new int[k];
        int index = 0;
        for (int i = freq.length - 1; i > 0 && index < k; i--) {
            for (int n : freq[i]) {
                solution[index++] = n;
                if (index == k) {
                    return solution;
                }
            }
        }

        return solution;

    }
}
