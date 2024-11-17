Time Complexity:
Building the HashMap: O(n)
Inserting into the PriorityQueue: O(n log k) (log k for each insertion)
Extracting k elements: O(k log k)
Overall: O(n log k)

Space Complexity:
HashMap: O(n)
PriorityQueue: O(k)
Result array: O(k)
Overall: O(n + k)

This solution leverages a priorityQueue to efficiently find the top k frequent elements

First this solution will fill a hashmap similarly to how it was done in the previous solution

Second this solution will make a priority queue that prioritizes the elements with the LEAST frequency.

Third this element will fill the heap similar to how it was done in the previous solution [0: frequency, 1: num]

Fourth this solution will poll the element off of the heap if the size of the heap is greater than k. Effectively removing the least frequent elements.

Fifth this solution will create a result int array of size k and will the poll the final k elements off of the heap inserting the num into the array.

Return the result array.