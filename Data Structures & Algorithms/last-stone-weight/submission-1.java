class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        for (int stone: stones) {
            maxHeap.offer(stone);
        }

        while(maxHeap.size() > 1) {
            int largest = maxHeap.poll();
            int secondLargest = maxHeap.poll();
            if (largest > secondLargest) {
                maxHeap.offer(largest - secondLargest);
            }
            else if (largest == secondLargest){
                continue;
            }
        }
        if(maxHeap.size() > 0)
            return maxHeap.peek();
        return 0;
    }
}
