# LeetCode 128: Longest Consecutive Sequence

## Problem Statement

Given an unsorted integer array `nums`, return the length of the longest consecutive elements sequence.

The algorithm must run in **O(n) time** for the optimal solution.

### Example

**Input**
```text
nums = [100, 4, 200, 1, 3, 2]
```

**Output**
```text
4
```

**Explanation**

The longest consecutive sequence is `[1, 2, 3, 4]`, and its length is `4`.

---

## Approach 1: Brute Force

**Time Complexity:** O(n²)  
**Space Complexity:** O(1)

### Interview Explanation

For each number, I check whether the next consecutive number exists in the array. I continue until the sequence breaks and track the maximum length.

### Algorithm

1. Iterate through each number in the array.
2. Search for the next consecutive number.
3. Continue searching until the next number is not found.
4. Update the maximum sequence length.

**Drawback:** Repeatedly searching the array makes this approach slow for large inputs and may cause TLE.

---

## Approach 2: Sorting

**Time Complexity:** O(n log n)  
**Space Complexity:** Depends on the sorting implementation.

### Interview Explanation

I sort the array, skip duplicates, and count consecutive numbers by comparing adjacent elements.

### Algorithm

1. Sort the array in ascending order.
2. Initialize a counter to track the current sequence length.
3. Skip duplicate elements.
4. If the current element is one greater than the previous element, increment the counter.
5. Otherwise, reset the counter.
6. Track and return the maximum length.

**Drawback:** Sorting takes O(n log n) time, so it does not meet the required O(n) time complexity.

---

## Approach 3: Optimal HashSet

**Time Complexity:** O(n) average  
**Space Complexity:** O(n)

### Interview Explanation

I insert all numbers into a HashSet for efficient lookup. I start counting only when the current number has no predecessor (`num - 1`). Then I count consecutive numbers using a while loop and update the maximum length.

### Algorithm

1. Insert all array elements into a HashSet.
2. Iterate through the unique numbers.
3. Check whether `num - 1` exists in the set.
4. If it does not exist, the current number is the beginning of a sequence.
5. Count consecutive numbers using `while (set.contains(current + 1))`.
6. Update and return the maximum sequence length.

### Key Code

```java
if (!set.contains(num - 1)) {
    int current = num;
    int count = 1;

    while (set.contains(current + 1)) {
        current++;
        count++;
    }

    longest = Math.max(longest, count);
}
```

### Why Is This Optimal?

The condition `!set.contains(num - 1)` ensures that counting starts only at the beginning of each sequence. This prevents repeatedly counting the same sequence and gives O(n) average time complexity.

---

## Approach Comparison

| Approach | Time Complexity | Space Complexity |
|---|---|---|
| Brute Force | O(n²) | O(1) |
| Sorting | O(n log n) | Depends on sorting |
| HashSet | O(n) average | O(n) |

---

## Best Approach for Interviews

**Recommended: Optimal HashSet**

Start by explaining brute force, discuss sorting as an improvement, and then present the HashSet solution to satisfy the O(n) requirement.

### Important Interview Questions

1. Why do we use a HashSet?
2. Why do we check `!set.contains(num - 1)`?
3. What happens if the array contains duplicates?
4. Why is the optimal approach O(n) average?
5. What is the space complexity?

### Topics Covered

- Arrays
- HashSet
- Hashing
- Sorting
- Time and Space Complexity
- Interview Problem Solving

### LeetCode Link

https://leetcode.com/problems/longest-consecutive-sequence/
