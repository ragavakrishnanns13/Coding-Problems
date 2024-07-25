class Solution {
    public int[] frequencySort(int[] nums) {
        // Create a HashMap to store the frequencies of each element
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        // Create a list from the array to use the Collections.sort method
        List<Integer> numList = new ArrayList<>();
        for (int num : nums) {
            numList.add(num);
        }
        // Sort the list based on the custom comparator
        Collections.sort(numList, (a, b) -> {
            int freqA = frequencyMap.get(a);
            int freqB = frequencyMap.get(b);
            if (freqA != freqB){
                return freqA - freqB; // Sort by frequency in increasing order
            } else {
                return b - a; // If frequencies are the same, sort by value in decreasing order
            }
        });
        // Convert the sorted list back to an array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = numList.get(i);
        }
        return nums;
    }
}
