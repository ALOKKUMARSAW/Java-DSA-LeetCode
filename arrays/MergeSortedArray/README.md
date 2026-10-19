# Merge Sorted Array — LeetCode 88

## Problem Statement

You are given two integer arrays, `nums1` and `nums2`, sorted in non-decreasing order.

- `nums1` has a length of `m + n`, where the first `m` elements are valid and the remaining `n` elements are `0`, reserved for merging.
- `nums2` contains `n` valid elements.

Merge `nums2` into `nums1` so that the final array is sorted in non-decreasing order. The result must be stored inside `nums1`.

**LeetCode:** https://leetcode.com/problems/merge-sorted-array/

## Example

**Input**
```text
nums1 = [1,2,3,0,0,0]
m = 3
nums2 = [2,5,6]
n = 3
```

**Output**
```text
[1,2,2,3,5,6]
```

## Approach: Three Pointers

We use three pointers to merge the arrays from right to left.

1. Initialize `i = m - 1`, pointing to the last valid element of `nums1`.
2. Initialize `j = n - 1`, pointing to the last element of `nums2`.
3. Initialize `k = m + n - 1`, pointing to the last available position in `nums1`.
4. Compare `nums1[i]` and `nums2[j]`. Place the larger element at `nums1[k]`.
5. Decrease the appropriate pointer and `k`.
6. Copy any remaining elements from `nums2` into `nums1`.

We merge from the end to avoid overwriting valid elements in `nums1`.

## Complexity Analysis

- **Time Complexity:** `O(m + n)` — each element is processed at most once.
- **Auxiliary Space Complexity:** `O(1)` — merging is done in place.

## Project Structure

```text
MergeSortedArray/
├── MergeSortedArray.java
└── README.md
```

## How to Run in VS Code

Make sure the Java JDK and Java extensions are installed.

Open the terminal in the `MergeSortedArray` folder and execute:

```bash
javac MergeSortedArray.java
java MergeSortedArray
```

Expected output:

```text
Merged Array: [1, 2, 2, 3, 5, 6]
```

## Key Interview Concepts

- Two-pointer technique
- In-place array manipulation
- Merging sorted arrays
- Time and space complexity analysis
- Avoiding overwriting existing elements

## Tags

`Array` `Two Pointers` `Sorting` `In-Place Algorithm` `LeetCode`

## Learning Outcome

This problem demonstrates how two sorted arrays can be merged efficiently in linear time without using an additional array.
