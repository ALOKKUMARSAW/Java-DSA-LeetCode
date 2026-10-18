# Find Minimum in Rotated Sorted Array

**LeetCode Problem:** [#153 – Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)

**Difficulty:** Medium  
**Topics:** Array, Binary Search

## Problem Statement

Suppose an array of distinct integers was sorted in ascending order and then rotated at an unknown pivot.

Given the rotated array `nums`, return its minimum element.

The solution must run in O(log n) time.

## Examples

**Example 1**

```text id="x90b0n"
Input: nums = [3, 4, 5, 1, 2]
Output: 1
```

**Example 2**

```text id="od51ak"
Input: nums = [4, 5, 6, 7, 0, 1, 2]
Output: 0
```

**Example 3**

```text id="6f5f8n"
Input: nums = [11, 13, 15, 17]
Output: 11
```

## Approach: Binary Search

1. Initialize `left = 0` and `right = nums.length - 1`.
2. Calculate the middle index using `left + (right - left) / 2`.
3. If `nums[mid] > nums[right]`, the minimum lies in the right half. Set `left = mid + 1`.
4. Otherwise, the minimum is at `mid` or in the left half. Set `right = mid`.
5. Continue until `left == right`.
6. Return `nums[left]`.

## Java Implementation

See `FindMinimumInRotatedSortedArray.java` for the complete standalone Java program.

## Complexity Analysis

| Complexity | Description |
|---|---|
| Time: O(log n) | The search range is approximately halved at every iteration. |
| Extra Space: O(1) | Only a few variables are used. |

## Project Structure

```text id="h1u9ew"
FindMinimumInRotatedSortedArray/
├── FindMinimumInRotatedSortedArray.java
└── README.md
```

## Key Interview Concepts

- Binary Search
- Rotated Sorted Arrays
- Search Space Reduction
- Time and Space Complexity

## Key Takeaway

Comparing the middle element with the rightmost element helps identify which half contains the minimum.

## Tags

`Java` `LeetCode` `DSA` `Array` `BinarySearch` `InterviewPreparation`
