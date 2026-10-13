# Two Sum II — Input Array Is Sorted

## 📌 Problem Statement

**LeetCode #167**

Given a **1-indexed, sorted array** of integers `numbers` and an integer `target`, find two numbers whose sum equals the target.

Return their indices as `[index1, index2]`, where `index1 < index2`.

**Requirements:**
- The array is sorted in non-decreasing order.
- Exactly one solution exists.
- The same element cannot be used twice.
- Return 1-based indices.

## 📝 Examples

### Example 1

**Input:**
```text
numbers = [2, 7, 11, 15]
target = 9
```

**Output:**
```text
[1, 2]
```

**Explanation:** `2 + 7 = 9`.

### Example 2

**Input:**
```text
numbers = [2, 3, 4]
target = 6
```

**Output:**
```text
[1, 3]
```

## 💡 Approach 1: Two Pointers

**File:** `TwoSumIITwoPointers.java`

### Idea

Because the array is sorted, we can use two pointers to find the target sum without using extra data structures.

### Steps

1. Initialize `left = 0` and `right = numbers.length - 1`.
2. Calculate the sum of the elements at both pointers.
3. If the sum equals the target, return their 1-based indices.
4. If the sum is smaller than the target, increment `left`.
5. If the sum is larger than the target, decrement `right`.
6. Continue until the pair is found.

### Complexity

- **Time:** `O(n)`
- **Extra space:** `O(1)`

## 💡 Approach 2: HashMap

**File:** `TwoSumIIHashMap.java`

### Idea

Use a `HashMap` to store each previously visited number and its index.

### Steps

1. Create a `HashMap` to store numbers and their indices.
2. Traverse the array using a normal `for` loop.
3. Calculate `complement = target - numbers[i]`.
4. If the complement exists in the map, return its index and the current index, converted to 1-based indexing.
5. Otherwise, store the current number and its index.

### Complexity

- **Average time:** `O(n)`
- **Extra space:** `O(n)`

## 📊 Approach Comparison

| Feature | Two Pointers | HashMap |
|---|---|---|
| Time complexity | `O(n)` | Average `O(n)` |
| Extra space | `O(1)` | `O(n)` |
| Requires sorted input | Yes | No |
| Uses extra data structure | No | Yes |
| Preferred for this problem | Yes | Alternative |

## 🎯 Interview Explanation

"I can solve Two Sum II using either two pointers or a HashMap. Since the input array is sorted, I prefer the two-pointer approach. I start one pointer at each end. If the sum is too small, I move the left pointer forward; if it is too large, I move the right pointer backward. When the sum matches the target, I return the 1-based indices. This gives O(n) time and O(1) extra space."

## 📂 Project Structure

```text
Java-DSA-LeetCode/
└── two-pointers/
    └── TwoSumII/
        ├── TwoSumIITwoPointers.java
        ├── TwoSumIIHashMap.java
        └── README.md
```

## 🔗 LeetCode

[Two Sum II — Input Array Is Sorted (#167)](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)

## 📚 Key Learnings

- Two-pointer technique
- Java `HashMap`
- Sorted array optimization
- Complement-based lookup
- 1-based indexing
- Time and space complexity analysis

## 🏷️ Tags

`Java` `DSA` `Arrays` `Two Pointers` `HashMap` `LeetCode` `Interview Preparation`
