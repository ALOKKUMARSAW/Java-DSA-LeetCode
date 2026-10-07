# Valid Anagram

## 📌 Problem

Given two strings `s` and `t`, determine whether `t` is an anagram of `s`.

Two strings are anagrams if they contain the same characters with the same frequency, but the order of the characters can be different.

### Example 1

```text
Input:
s = "anagram"
t = "nagaram"

Output:
true

Example 2
Input:
s = "rat"
t = "car"

Output:
false

💡 Approach 1: Sorting
Idea
1. Check if both strings have the same length.
2. Convert both strings into character arrays.
3. Sort both character arrays.
4. Compare the sorted arrays.
5. If both arrays are equal, the strings are anagrams.
Complexity
- Time Complexity: O(n log n)
- Space Complexity: O(n)
File
ValidAnagramSorting.java
🚀 Approach 2: Frequency Array
Idea
Instead of sorting the strings, we count the frequency of each character.
1. Check if both strings have the same length.
2. Create a frequency array of size 256.
3. Increment the frequency for every character in s.
4. Decrement the frequency for every character in t.
5. Check whether all frequency values are 0.
6. If all values are 0, the strings are anagrams.
Complexity
- Time Complexity: O(n)
- Space Complexity: O(1)
The space is O(1) because the frequency array has a fixed size of 256.
File
ValidAnagramFrequencyArray.java
🔥 Approach Comparison
Approach	Time	Space
Sorting	O(n log n)	O(n)
Frequency Array	O(n)	O(1)


The Frequency Array approach is more efficient for ASCII characters because it provides O(n) time complexity and O(1) extra space.
☕ Java Concepts Used
- String
- Character Array
- charAt()
- toCharArray()
- Arrays.sort()
- Arrays.equals()
- Frequency Array
- Time Complexity
- Space Complexity
🎯 Interview Explanation
I can solve Valid Anagram using sorting in O(n log n) time. An optimized approach is to use a frequency array. I increment the frequency for characters from the first string and decrement it for characters from the second string. Finally, if all frequency values are zero, both strings are anagrams. This takes O(n) time and O(1) extra space for ASCII characters.

📂 Project Structure
ValidAnagram/
│
├── ValidAnagramSorting.java
├── ValidAnagramFrequencyArray.java
└── README.md

🔗 LeetCode
Problem: Valid Anagram
LeetCode: #242
📚 Key Learning
- Learned how to check whether two strings are anagrams.
- Learned the sorting approach.
- Learned character frequency counting.
- Learned how to optimize from O(n log n) to O(n).
- Practiced time and space complexity analysis.
- Improved understanding of arrays and strings in Java.
🏷️ Tags
Java DSA Strings Hashing Frequency Array Sorting LeetCode Interview Preparation
```