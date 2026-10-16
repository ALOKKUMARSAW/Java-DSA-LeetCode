# Search Insert Position

**LeetCode Problem:** [#35 – Search Insert Position](https://leetcode.com/problems/search-insert-position/)

**Difficulty:** Easy  
**Topics:** Array, Binary Search

## Problem Statement

Given a sorted array of distinct integers and a target value, return the index if the target is found. Otherwise, return the index where the target should be inserted to maintain sorted order.

The algorithm must run in O(log n) time.

## Examples

**Example 1**

```text
Input: nums = [1, 3, 5, 6], target = 5
Output: 2
```

**Example 2**

```text
Input: nums = [1, 3, 5, 6], target = 2
Output: 1
```

**Example 3**

```text
Input: nums = [1, 3, 5, 6], target = 7
Output: 4
```

## Approach: Binary Search

1. Initialize `left = 0` and `right = nums.length - 1`.
2. Calculate the middle index using `left + (right - left) / 2`.
3. If the middle element equals the target, return `mid`.
4. If the middle element is smaller, search the right half.
5. Otherwise, search the left half.
6. When the loop ends, return `left` as the insertion index.

## Java Implementation

See `SearchInsertPosition.java` for the complete standalone Java program.

## Complexity Analysis

| Complexity | Description |
|---|---|
| Time: O(log n) | The search range is halved at each iteration. |
| Extra Space: O(1) | Only a few variables are used. |

## Project Structure

```text
SearchInsertPosition/
├── SearchInsertPosition.java
└── README.md
```

## Key Interview Concepts

- Binary Search
- Sorted Arrays
- Index Calculation
- Insertion Position
- Time and Space Complexity

## Key Takeaway

When binary search finishes without finding the target, `left` points to the correct insertion position.

## Tags

`Java` `LeetCode` `DSA` `Array` `BinarySearch` `InterviewPreparation`
