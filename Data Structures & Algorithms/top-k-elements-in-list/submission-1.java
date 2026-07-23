class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(); //tracking the amount of times we see a number
        List<Integer>[] bucket = new ArrayList[nums.length + 1]; //our bucket to sort our values in an array
        //index = # of times a value is seen
        //values represent numeric values in the array given

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < bucket.length; i++) {
            bucket[i] = new ArrayList<>();
        }

        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            bucket[m.getValue()].add(m.getKey());
        }

        int[] solution = new int[k];
        int index = 0;
        for (int i = bucket.length - 1; i >= 0; i--) {
            for (int num : bucket[i]) {
                solution[index++] = num;
                if (index == k) {
                    return solution;
                }
            }
        }
        return new int[0];

    }
}
