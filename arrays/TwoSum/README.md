# Two Sum

> LeetCode #1 | Array | HashMap | Easy

## 📌 Problem

Given an integer array `nums` and an integer `target`, return the indices of the two numbers such that they add up to `target`.

You may assume that each input has exactly one solution, and you may not use the same element twice.

### Example

Input:
nums = [2, 7, 11, 15]
target = 9

Output:
[0, 1]

Explanation
nums[0] + nums[1]
= 2 + 7
= 9

💡 Approaches
This problem is solved using two approaches:
1. Brute Force
2. HashMap - Optimized Solution
1️⃣ Brute Force Approach
Approach
Use two nested loops to check every possible pair of elements.
For every pair (i, j), check:
nums[i] + nums[j] == target

If the condition is satisfied, return the indices.
Complexity
Complexity	Value
Time	O(n²)
Space	O(1)


Advantages
- Simple and easy to understand
- Does not require additional data structures
Disadvantages
- Slow for large input arrays
- Checks every possible pair
Source Code
TwoSumBruteForce.java
2️⃣ HashMap Approach - Optimized
Approach
We can optimize the brute-force solution using a HashMap.
For every element, calculate:
complement = target - nums[i]

Then check whether the complement already exists in the HashMap.
The HashMap stores:
Number → Index

If the complement exists, we have found the required pair.
Example
nums = [2, 7, 11, 15]
target = 9

Step 1
Current = 2
Complement = 9 - 2 = 7

7 is not present in the HashMap.
Store:
2 → 0

Step 2
Current = 7
Complement = 9 - 7 = 2

2 already exists in the HashMap.
Therefore:
[0, 1]

Complexity
Complexity	Value
Time	O(n)
Space	O(n)


Advantages
- Faster than the brute-force approach
- Requires only one traversal of the array
Disadvantages
- Requires additional memory for the HashMap
Source Code
TwoSumHashMap.java
⚖️ Approach Comparison
Approach	Data Structure	Time Complexity	Space Complexity
Brute Force	None	O(n²)	O(1)
HashMap	HashMap	O(n)	O(n)


Optimization
Brute Force
    O(n²)
      ↓
    HashMap
      O(n)

The HashMap approach reduces the time complexity from O(n²) to O(n) by using additional memory.
🧠 Java Concepts Practiced
- Arrays
- Nested Loops
- HashMap
- Map Interface
- Map<Integer, Integer>
- HashMap.containsKey()
- HashMap.get()
- HashMap.put()
- Complement calculation
- Time Complexity
- Space Complexity
- Brute Force Optimization
🎯 Interview Explanation
I initially solved the problem using a brute-force approach with two nested loops, which takes O(n²) time and O(1) space. To optimize it, I used a HashMap to store each number and its index. For every element, I calculate the complement as target - nums[i] and check whether the complement already exists in the map. If it exists, I return the stored index and the current index. This reduces the time complexity to O(n) with O(n) additional space.

🔗 LeetCode
Problem: Two Sum
Problem Number: #1
Difficulty: Easy
Primary Pattern: HashMap
Data Structure: Array + HashMap
View Problem on LeetCode
📂 Project Structure
TwoSum/
├── TwoSumBruteForce.java
├── TwoSumHashMap.java
└── README.md

📈 Key Learning
The main takeaway from this problem is understanding how a HashMap can eliminate an unnecessary nested loop.
Important Pattern
Current Element
       ↓
Calculate Complement
       ↓
Check HashMap
       ↓
   Is it present?
     ↙       ↘
   Yes        No
    ↓          ↓
 Return      Store
 Indices     Value

The key optimization is:
O(n²) → O(n)

at the cost of:
O(n) additional space