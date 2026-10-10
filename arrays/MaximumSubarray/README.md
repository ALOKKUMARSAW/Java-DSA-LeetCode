# Maximum Subarray — LeetCode #53

## 📌 Problem Statement

Given an integer array `nums`, find the contiguous subarray with the largest sum and return its sum.

A subarray must contain consecutive elements from the original array.

## 📝 Examples

### Example 1

**Input:**
```text
nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
```

**Output:**
```text
6
```

**Explanation:**

The maximum-sum subarray is `[4, -1, 2, 1]`.

```text
Sum = 4 + (-1) + 2 + 1 = 6
```

### Example 2

**Input:**
```text
nums = [1]
```

**Output:**
```text
1
```

### Example 3

**Input:**
```text
nums = [5, 4, -1, 7, 8]
```

**Output:**
```text
23
```

## 💡 Approaches

This repository contains three approaches to solve the Maximum Subarray problem.

### 1. Brute Force Approach

**File:** `MaximumSubarrayBruteForce.java`

**Idea:**
- Consider every possible starting index.
- Extend the subarray one element at a time.
- Maintain the running sum.
- Update the maximum sum whenever a larger sum is found.

**Complexity:**
- Time: `O(n²)`
- Extra space: `O(1)`

### 2. Prefix Sum Approach

**File:** `MaximumSubarrayPrefixSum.java`

**Idea:**
- Maintain the running prefix sum.
- Track the minimum prefix sum seen so far.
- Calculate the best subarray sum using the difference between the current prefix sum and the minimum prefix sum.
- Update the maximum sum.

**Complexity:**
- Time: `O(n)`
- Extra space: `O(1)`

### 3. Kadane's Algorithm — Optimal Approach

**File:** `MaximumSubarrayKadane.java`

**Idea:**

Kadane's Algorithm finds the maximum subarray sum in one traversal.

Maintain two variables:
- `currentSum`: Maximum sum of a subarray ending at the current position.
- `maxSum`: Maximum subarray sum found so far.

For each element, choose between starting a new subarray or extending the existing one.

```java
currentSum = Math.max(nums[i], currentSum + nums[i]);
maxSum = Math.max(maxSum, currentSum);
```

**Complexity:**
- Time: `O(n)`
- Extra space: `O(1)`

## 📊 Approach Comparison

| Approach | Time Complexity | Extra Space |
|---|---|---|
| Brute Force | `O(n²)` | `O(1)` |
| Prefix Sum | `O(n)` | `O(1)` |
| Kadane's Algorithm | `O(n)` | `O(1)` |

**Recommended approach:** Kadane's Algorithm is a preferred interview solution because it runs in linear time and uses constant extra space.

## ☕ Java Concepts Practiced

- Arrays and loops
- Running sums
- Prefix sums
- Greedy decision-making
- `Math.max()`
- Time and space complexity
- Kadane's Algorithm

## 🎯 Interview Explanation

"I first considered the brute-force approach, which checks every possible subarray in O(n²) time. To optimize the solution, I use Kadane's Algorithm. At each position, I decide whether to start a new subarray or extend the existing subarray. I update the maximum sum at every step. This gives O(n) time complexity and O(1) extra space."

## 📂 Project Structure

```text
MaximumSubarray/
├── MaximumSubarrayBruteForce.java
├── MaximumSubarrayPrefixSum.java
├── MaximumSubarrayKadane.java
└── README.md
```

## 🔗 LeetCode

**Problem:** Maximum Subarray

**Problem Number:** 53

[Solve Maximum Subarray on LeetCode](https://leetcode.com/problems/maximum-subarray/)

## 📚 Key Learnings

- How to find the maximum sum of a contiguous subarray.
- How to optimize brute force using running sums.
- How prefix sums can be used to calculate subarray sums.
- How Kadane's Algorithm works.
- How to analyze time and space complexity.

## 🏷️ Tags

`Java` `DSA` `Arrays` `Kadane's Algorithm` `Prefix Sum` `Greedy` `LeetCode` `Interview Preparation`
