# LeetCode 11: Container With Most Water

**Difficulty:** Medium  
**Topics:** Arrays, Two Pointers, Greedy Algorithm

**LeetCode:** https://leetcode.com/problems/container-with-most-water/

## Problem Statement

Given an integer array `height`, where each element represents the height of a vertical line, find two lines that can form a container holding the maximum amount of water.

Return the maximum area of water the container can store.

## Example 1

**Input**
```text
height = [1,8,6,2,5,4,8,3,7]
```

**Output**
```text
49
```

**Explanation:** The lines at indices 1 and 8 have heights 8 and 7. The width is 7, so the area is `7 * min(8, 7) = 49`.

## Example 2

**Input**
```text
height = [1,1]
```

**Output**
```text
1
```

---

## Approach 1: Brute Force

**File:** `BruteForce.java`

### Interview Explanation

I check every possible pair of lines, calculate the area using the distance between the lines and the smaller height, and track the maximum area.

### Formula

`Area = (right - left) * min(height[left], height[right])`

### Complexity

- Time Complexity: O(n²)
- Space Complexity: O(1)

### Drawback

Checking every pair becomes inefficient for large arrays.

---

## Approach 2: Two Pointers — Optimal

**File:** `TwoPointers.java`

### Interview Explanation

I initialize two pointers at opposite ends of the array. I calculate the water area, update the maximum, and move the pointer at the shorter line. I repeat this process until the pointers meet.

### Algorithm

1. Set `left = 0` and `right = height.length - 1`.
2. Calculate the width between the pointers.
3. Find the smaller height.
4. Calculate the area and update the maximum.
5. Move the pointer at the shorter line.
6. Return the maximum area.

### Complexity

- Time Complexity: O(n)
- Space Complexity: O(1)

### Why Move the Shorter Pointer?

The shorter line limits the water capacity. Moving the taller pointer reduces the width without improving the limiting height. Moving the shorter pointer gives an opportunity to find a taller line and potentially increase the area.

---

## Approach Comparison

| Approach | Time Complexity | Space Complexity |
|---|---|---|
| Brute Force | O(n²) | O(1) |
| Two Pointers | O(n) | O(1) |

## Key Interview Concepts

- Two-pointer technique
- Greedy approach
- Array traversal
- Maximum area calculation
- Time and space complexity analysis

## How to Run in VS Code

Open the terminal in the `ContainerWithMostWater` folder.

### Run the brute-force solution

```bash
javac BruteForce.java
java BruteForce
```

### Run the optimal solution

```bash
javac TwoPointers.java
java TwoPointers
```

Expected output for both:

```text
Maximum Water Area: 49
```

## Recommended Interview Approach

Explain the brute-force solution first, then optimize it using two pointers. The two-pointer approach is the preferred solution because it achieves O(n) time and O(1) extra space.