# Missing Number — LeetCode #268

## 📌 Problem Statement

Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the only number in the range that is missing from the array.

## 📝 Examples

### Example 1

**Input:**
```text
nums = [3, 0, 1]
```

**Output:**
```text
2
```

**Explanation:** The numbers should be `[0, 1, 2, 3]`. The missing number is `2`.

### Example 2

**Input:**
```text
nums = [0, 1]
```

**Output:**
```text
2
```

### Example 3

**Input:**
```text
nums = [9, 6, 4, 2, 3, 5, 7, 0, 1]
```

**Output:**
```text
8
```

---

## 💡 Approach: Mathematical Sum

The sum of all integers from `0` to `n` can be calculated using:

```text
Expected Sum = n * (n + 1) / 2
```

### Steps

1. Calculate the expected sum of numbers from `0` to `n`.
2. Calculate the actual sum of the array using a normal `for` loop.
3. Subtract the actual sum from the expected sum.
4. The result is the missing number.

### Java Implementation

```java
public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int i = 0; i < n; i++) {
            actualSum += nums[i];
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        int[] nums = {3, 0, 1};

        System.out.println("Missing Number: " + missingNumber(nums));
    }
}
```

### Output

```text
Missing Number: 2
```

---

## 🔍 Dry Run

Input:

```text
nums = [3, 0, 1]
n = 3
```

Expected sum:

```text
3 * (3 + 1) / 2 = 6
```

Actual sum:

```text
3 + 0 + 1 = 4
```

Missing number:

```text
6 - 4 = 2
```

---

## ⏱️ Complexity Analysis

- **Time Complexity:** `O(n)` — one traversal calculates the array sum.
- **Extra Space Complexity:** `O(1)` — only a few variables are used.

---

## 🎯 Interview Explanation

"I use the mathematical sum formula to solve this problem. First, I calculate the expected sum of numbers from zero to n. Then I calculate the actual sum of the array using a loop. The difference between these two sums gives the missing number. The solution takes O(n) time and O(1) extra space."

---

## 📂 Project Structure

```text
Java-DSA-LeetCode/
└── arrays/
    └── MissingNumber/
        ├── MissingNumber.java
        └── README.md
```

---

## 🔗 LeetCode

**Problem:** Missing Number

**Problem Number:** 268

[Practice Missing Number on LeetCode](https://leetcode.com/problems/missing-number/)

---

## 📚 Key Learnings

- Array traversal using a normal `for` loop
- Mathematical sum formula
- Finding missing values in arrays
- Time and space complexity analysis
- Writing efficient Java solutions

---

## 🏷️ Tags

`Java` `DSA` `Arrays` `Math` `LeetCode` `Interview Preparation`
