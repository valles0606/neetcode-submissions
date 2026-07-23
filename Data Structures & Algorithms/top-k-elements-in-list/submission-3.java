class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        //count frequencies
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        //create and set up buckets for sorting
        List<Integer>[] buckets = new List[nums.length + 1];
        freqMap.forEach((num, freq) -> {
            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        });

        //add top k elements to seperate solution list
        int[] sol = new int[k];
        int index = 0;
        for (int i = buckets.length - 1; i > 0 && index < k; i--) {
            if (buckets[i] != null) {
                for (int num : buckets[i]) {
                    sol[index++] = num;
                    if (index == k) {
                        return sol;
                    }
                }
            }
        }
        return sol;
    }
}
