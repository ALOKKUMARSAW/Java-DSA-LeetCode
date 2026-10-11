# Move Zeroes — LeetCode #283

## 📌 Problem Statement

Given an integer array `nums`, move all zeroes to the end of the array while maintaining the relative order of all non-zero elements.

**Requirements:**
- Modify the original array in place.
- Maintain the order of non-zero elements.
- Do not create another array.

## 📝 Examples

### Example 1

**Input:**
```text
nums = [0, 1, 0, 3, 12]
```

**Output:**
```text
[1, 3, 12, 0, 0]
```

**Explanation:** All non-zero elements are moved to the beginning, and all zeroes are placed at the end.

### Example 2

**Input:**
```text
nums = [0]
```

**Output:**
```text
[0]
```

## 💡 Approach: Two Pointers

We use an index variable to track the next position for a non-zero element.

**Steps:**
1. Initialize `index = 0`.
2. Traverse the array using a `for` loop.
3. Whenever a non-zero element is found, place it at `nums[index]`.
4. Increment `index`.
5. Fill all remaining positions with zeroes.

This approach modifies the original array without creating another array.

## ☕ Java Implementation

```java
import java.util.Arrays;

public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int index = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        // Fill remaining positions with zeroes
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};

        System.out.println("Before: " + Arrays.toString(nums));

        moveZeroes(nums);

        System.out.println("After:  " + Arrays.toString(nums));
    }
}
```

## 🔍 Dry Run

Input:
```text
[0, 1, 0, 3, 12]
```

After moving non-zero elements to the front:
```text
[1, 3, 12, 3, 12]
```

After filling the remaining positions with zeroes:
```text
[1, 3, 12, 0, 0]
```

## ⏱️ Complexity Analysis

- **Time Complexity:** `O(n)` — the array is traversed a constant number of times.
- **Extra Space Complexity:** `O(1)` — only a few variables are used.

## 🎯 Interview Explanation

"I use a pointer to track the next position for a non-zero element. I traverse the array and place every non-zero element at the front while preserving its relative order. Then I fill the remaining positions with zeroes. The solution runs in O(n) time and uses O(1) extra space."

## 📂 Project Structure

```text
Java-DSA-LeetCode/
└── arrays/
    └── MoveZeroes/
        ├── MoveZeroes.java
        └── README.md
```

## 🔗 LeetCode

**Problem:** Move Zeroes

**Problem Number:** 283

[Practice Move Zeroes on LeetCode](https://leetcode.com/problems/move-zeroes/)

## 📚 Key Learnings

- Array traversal
- Two-pointer technique
- In-place array modification
- Preserving element order
- Time and space complexity analysis

## 🏷️ Tags

`Java` `DSA` `Arrays` `Two Pointers` `In-Place Algorithm` `LeetCode` `Interview Preparation`
