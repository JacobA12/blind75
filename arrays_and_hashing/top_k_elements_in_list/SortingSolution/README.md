time complexity: O(n log n)
Space complexity: O(n)

This solution creates a HashMap that maps the frequency of each num in nums. Key: num, Value: frequency.

Then creates an ArrayList of int arrays.

Then iterates through each entry in count hashmap.

For each entry it is added into that ArrayList with an int array of size 2 [0: frequency, 1: num]

Using the sort method for Lists. If entry b is greater than a it will sort it ahead of that entry. 

A result int array is created of size k

Iterate through that array k times retrieving the index at position i and at position [1] in the array.

return the result array. 