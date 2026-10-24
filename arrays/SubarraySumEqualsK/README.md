# LeetCode 560: Subarray Sum Equals K

## Problem Statement

Given an integer array `nums` and an integer `k`, return the total number of continuous subarrays whose sum equals `k`.

**LeetCode:** https://leetcode.com/problems/subarray-sum-equals-k/

### Example

**Input**
```text
nums = [1, 1, 1]
k = 2
```

**Output**
```text
2
```

**Explanation:** The matching subarrays are `[1, 1]` at indices `0–1` and `1–2`.

---

## Approach 1: Running Sum

**File:** `BruteForce.java`

### Interview Explanation

I fix the starting index and extend the subarray one element at a time. I maintain a running sum and increment the count whenever the sum equals `k`.

### Complexity

- Time: O(n²)
- Space: O(1)

---

## Approach 2: Prefix Sum Array

**File:** `PrefixSum.java`

### Interview Explanation

I first calculate the prefix sum array. Then I calculate each subarray sum using:

`sum = prefix[j + 1] - prefix[i]`

This avoids recalculating the sum of every subarray.

### Complexity

- Time: O(n²)
- Space: O(n)

---

## Approach 3: Prefix Sum + HashMap

**File:** `PrefixSumHashMap.java`

### Interview Explanation

I maintain a running prefix sum and store the frequency of each prefix sum in a HashMap.

For each element, I calculate `prefixSum - k`. If this value exists in the map, its frequency tells me how many subarrays ending at the current index have sum `k`.

I then update the frequency of the current prefix sum.

### Complexity

- Time: O(n) average
- Space: O(n)

### Important Code

```java
map.put(0, 1);

int required = prefixSum - k;

if (map.containsKey(required)) {
    count += map.get(required);
}
```

Initializing the map with `0 → 1` handles subarrays that start at index zero.

---

## Comparison

| Approach | Time | Space |
|---|---|---|
| Running Sum | O(n²) | O(1) |
| Prefix Sum Array | O(n²) | O(n) |
| Prefix Sum + HashMap | O(n) average | O(n) |

## Best Approach for Interviews

**Approach 4: Prefix Sum + HashMap**

It handles positive numbers, negative numbers, and zeros, and improves the average time complexity to O(n).

## Topics Covered

- Arrays
- Nested Loops
- Prefix Sum
- HashMap
- Subarray Problems
- Time and Space Complexity

## Run in VS Code

Compile and run each file separately from the project folder.

Example:

```bash
javac Approach4_PrefixSumHashMap.java
java Approach4_PrefixSumHashMap
```

Expected output:

```text
2
```
