# Kth Largest Element in an Array — LeetCode 215

## Problem Statement

Given an integer array `nums` and an integer `k`, return the kth largest element in the array.

The kth largest element means the kth element in sorted order, including duplicates. It does not mean the kth distinct element.

**LeetCode:** https://leetcode.com/problems/kth-largest-element-in-an-array/

## Example 1

**Input**
```text
nums = [3,2,1,5,6,4]
k = 2
```

**Output**
```text
5
```

**Explanation:** The elements in descending order are `[6,5,4,3,2,1]`. The second largest element is `5`.

## Example 2

**Input**
```text
nums = [3,2,3,1,2,4,5,5,6]
k = 4
```

**Output**
```text
4
```

## Approach: Max-Heap

A max-heap keeps the largest element at its root.

1. Create a `PriorityQueue` using `Collections.reverseOrder()` to make it a max-heap.
2. Insert all array elements into the heap.
3. Remove the maximum element `k - 1` times.
4. The next element at the root is the kth largest element.

## Java Concepts Used

- `PriorityQueue`
- Max-Heap
- `Collections.reverseOrder()`
- Array traversal
- Greedy selection using a heap

## Complexity Analysis

Let `n` be the number of elements in the array.

- **Time Complexity:** `O(n log n + k log n)` using repeated heap insertions and removals. This simplifies to `O(n log n)` because `k <= n`.
- **Auxiliary Space Complexity:** `O(n)` because the heap stores all array elements.

## Project Structure

```text
KthLargestElement/
├── KthLargestElement.java
└── README.md
```

## How to Run in VS Code

Make sure the Java JDK is installed.

Open the terminal in the `KthLargestElement` folder and run:

```bash
javac KthLargestElement.java
java KthLargestElement
```

Expected output:

```text
K: 2
Kth Largest Element: 5
```

## Alternative Approaches

1. Sorting — `O(n log n)` time.
2. Min-Heap of size `k` — `O(n log k)` time and `O(k)` space.
3. Quickselect — average `O(n)` time.

## Key Interview Takeaway

A max-heap allows us to repeatedly extract the largest element. After removing the largest element `k - 1` times, the next extracted element is the kth largest.

## Tags

`Array` `Heap` `Priority Queue` `Sorting` `Quickselect` `LeetCode`

## Problem Link

https://leetcode.com/problems/kth-largest-element-in-an-array/
