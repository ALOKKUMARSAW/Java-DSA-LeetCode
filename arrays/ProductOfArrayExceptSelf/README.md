# Product of Array Except Self — LeetCode #238

## 📌 Problem Statement

Given an integer array `nums`, return an array `answer` such that `answer[i]` equals the product of all elements of `nums` except `nums[i]`.

**Requirements:**
- Do not use division.
- Solve the problem in `O(n)` time for the optimal approach.
- The output array does not count as extra space for the problem's space-complexity requirement.

## 📝 Examples

### Example 1

**Input:**
```text
nums = [1, 2, 3, 4]
```

**Output:**
```text
[24, 12, 8, 6]
```

**Explanation:**
- Index 0: `2 × 3 × 4 = 24`
- Index 1: `1 × 3 × 4 = 12`
- Index 2: `1 × 2 × 4 = 8`
- Index 3: `1 × 2 × 3 = 6`

### Example 2

**Input:**
```text
nums = [-1, 1, 0, -3, 3]
```

**Output:**
```text
[0, 0, 9, 0, 0]
```

---

## 💡 Approach 1: Brute Force

**File:** `ProductExceptSelfBruteForce.java`

### Idea

For every index, multiply all elements except the element at that index.

### Steps

1. Create an output array.
2. Traverse the input array using the outer loop.
3. Initialize `product = 1` for each index.
4. Use an inner loop to multiply all elements except the current index.
5. Store the product in the output array.

### Complexity

- **Time:** `O(n²)`
- **Extra space:** `O(1)`, excluding the output array.

### Limitation

The nested loops make this approach inefficient for large arrays.

---

## 🚀 Approach 2: Prefix and Suffix Arrays

**File:** `ProductExceptSelfPrefixSuffix.java`

### Idea

Calculate the product of all elements to the left and right of each index, then multiply the two products.

### Steps

1. Create `prefix`, `suffix`, and `result` arrays.
2. Initialize `prefix[0] = 1`.
3. Calculate prefix products from left to right.
4. Initialize `suffix[n - 1] = 1`.
5. Calculate suffix products from right to left.
6. Multiply `prefix[i] * suffix[i]` to obtain each answer.

### Java Logic

```java
result[i] = prefix[i] * suffix[i];
```

### Complexity

- **Time:** `O(n)`
- **Extra space:** `O(n)`, excluding the output array.

### Advantage

This approach improves the time complexity from `O(n²)` to `O(n)` and handles zeroes without division, assuming products fit within the integer range.

---

## 📊 Approach Comparison

| Feature | Brute Force | Prefix and Suffix |
|---|---|---|
| Time complexity | `O(n²)` | `O(n)` |
| Extra space | `O(1)` | `O(n)` |
| Uses division | No | No |
| Handles zeroes | Yes | Yes |
| Recommended for interviews | For explaining basics | Yes |

## 🎯 Interview Explanation

"I first considered brute force, where I multiply every element except the current index. This takes O(n²) time. To optimize it, I use prefix and suffix products. The prefix array stores the product of elements to the left, and the suffix array stores the product of elements to the right. Multiplying them gives the required answer in O(n) time without division."

## 📂 Project Structure

```text
Java-DSA-LeetCode/
└── arrays/
    └── ProductOfArrayExceptSelf/
        ├── ProductExceptSelfBruteForce.java
        ├── ProductExceptSelfPrefixSuffix.java
        └── README.md
```

## 🔗 LeetCode

**Problem:** Product of Array Except Self

**Problem Number:** 238

[Practice on LeetCode](https://leetcode.com/problems/product-of-array-except-self/)

## 📚 Key Learnings

- Nested loops and brute-force solutions
- Prefix products
- Suffix products
- Array traversal in both directions
- Solving product problems without division
- Time and space complexity analysis

## 🏷️ Tags

`Java` `DSA` `Arrays` `Prefix Sum` `Suffix Product` `LeetCode` `Interview Preparation`
