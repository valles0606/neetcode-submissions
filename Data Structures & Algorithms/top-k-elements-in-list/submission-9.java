class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] sort = new List[nums.length + 1];

        for (int i = 0; i < sort.length; i++) {
            sort[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> set : freq.entrySet()) {
            sort[set.getValue()].add(set.getKey());
        }

        int[] topK = new int[k];
        int index = 0;
        for (int i = sort.length - 1; i > 0; i--) {
            for (int n : sort[i]) {
                topK[index++] = n;
                if (index == k) {
                    return topK;
                }
            }
        }
        return topK;
    }
}
