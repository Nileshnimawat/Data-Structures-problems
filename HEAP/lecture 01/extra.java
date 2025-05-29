import java.util.*;
public class extra {
    

class ElementFrequency {
    int element;
    int frequency;

    public ElementFrequency(int element, int frequency) {
        this.element = element;
        this.frequency = frequency;
    }
}

public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        // Step 1: Create a frequency map
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Step 2: Create a min heap of ElementFrequency objects
        PriorityQueue<ElementFrequency> minHeap = new PriorityQueue<>(Comparator.comparingInt(o -> o.frequency));
        
        // Step 3: Push elements into the min heap
        for (int num : frequencyMap.keySet()) {
            ElementFrequency elementFrequency = new ElementFrequency(num, frequencyMap.get(num));
            minHeap.offer(elementFrequency);
            if (minHeap.size() > k) { // Maintain heap size to k
                minHeap.poll();
            }
        }
        
        // Step 4: Pop k most frequent elements from the heap
        List<Integer> topK = new ArrayList<>();
        while (!minHeap.isEmpty()) {
            topK.add(minHeap.poll().element);
        }
        Collections.reverse(topK); // Reverse to get most frequent first
        
        return topK;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 5};
        int k = 4;
        List<Integer> result = solution.topKFrequent(nums, k);
        System.out.println(result); // Output: [1, 2, 3, 4]
    }
}

}
