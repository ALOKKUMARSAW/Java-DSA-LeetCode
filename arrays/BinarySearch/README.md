# Binary Search

**LeetCode Problem:** [#704 – Binary Search](https://leetcode.com/problems/binary-search/)

**Difficulty:** Easy  
**Topics:** Array, Binary Search

## Problem Statement

Given a sorted integer array `nums` and an integer `target`, return the index of the target if it exists. Otherwise, return `-1`.

## Example

```text
Input:  nums = [-1, 0, 3, 5, 9, 12]
        target = 9

Output: 4
```

## Approach: Iterative Binary Search

1. Initialize `left = 0` and `right = nums.length - 1`.
2. Calculate the middle index using `left + (right - left) / 2`.
3. If the middle element equals the target, return its index.
4. If the middle element is smaller, search the right half.
5. Otherwise, search the left half.
6. Return `-1` if the target is not found.

**Important:** Binary search requires the array to be sorted.

## Java Implementation

See `BinarySearch.java` for the complete standalone Java program.

## Complexity Analysis

| Complexity | Description |
|---|---|
| Time: O(log n) | The search range is halved at every iteration. |
| Extra Space: O(1) | Only a few variables are used. |

## Project Structure

```text
BinarySearch/
├── BinarySearch.java
└── README.md
```

## Key Interview Concepts

- Binary Search
- Sorted Arrays
- Two Boundaries
- Iterative Searching
- Time and Space Complexity

## Key Takeaway

Binary search is more efficient than linear search for sorted arrays, reducing the time complexity from O(n) to O(log n).

## Tags

`Java` `LeetCode` `DSA` `Array` `BinarySearch` `InterviewPreparation`
