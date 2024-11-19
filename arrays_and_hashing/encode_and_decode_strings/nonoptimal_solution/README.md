Encoding:
Time Complexity
O(N*M), where N is the number of strings and M is the average length of a string.
This is because we iterate through each string, convert its length to a string, and concatenate it to the encoded string.

Space complexity 
O(N*M), as the encoded string cna grow up to the total length of all input strings.

Decoding:
Time Complexity: O(N*M), where N is the number of string and M is the average length of a string. This is because we iterate through the encoded string, parse the length, extract the substring, and add it to the result list. 

Space Complexity: O(N*M), as the decoded list can store strings with a total length of the original encoded string. 
