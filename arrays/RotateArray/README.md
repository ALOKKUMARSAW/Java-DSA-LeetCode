# Rotate Array — LeetCode #189

## 📌 Problem Statement

Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is a non-negative integer.

**Requirements:**
- Modify the original array in place.
- Use `O(1)` extra space for the optimal solution.
- Handle cases where `k` is greater than the array length.

## 📝 Examples

### Example 1

**Input:**
```text
nums = [1, 2, 3, 4, 5, 6, 7]
k = 3
```

**Output:**
```text
[5, 6, 7, 1, 2, 3, 4]
```

**Explanation:** The last three elements move to the beginning of the array.

### Example 2

**Input:**
```text
nums = [-1, -100, 3, 99]
k = 2
```

**Output:**
```text
[3, 99, -1, -100]
```

## 💡 Approach: Reversal Algorithm

The reversal algorithm rotates the array using three reverse operations.

### Steps

1. Calculate `k = k % n` to handle rotations greater than the array length.
2. Reverse the entire array.
3. Reverse the first `k` elements.
4. Reverse the remaining `n - k` elements.

### Example Walkthrough

Initial array:

```text
[1, 2, 3, 4, 5, 6, 7]
```

**Step 1: Reverse the entire array**

```text
[7, 6, 5, 4, 3, 2, 1]
```

**Step 2: Reverse the first `k = 3` elements**

```text
[5, 6, 7, 4, 3, 2, 1]
```

**Step 3: Reverse the remaining elements**

```text
[5, 6, 7, 1, 2, 3, 4]
```

Final result:

```text
[5, 6, 7, 1, 2, 3, 4]
```

## ☕ Java Implementation

```java
import java.util.Arrays;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;

        if (n == 0) {
            return;
        }

        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private static void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Before rotation: " + Arrays.toString(nums));

        rotate(nums, k);

        System.out.println("After rotation:  " + Arrays.toString(nums));
    }
}
```

## ⏱️ Complexity Analysis

- **Time Complexity:** `O(n)` — the three reverse operations together take linear time.
- **Extra Space Complexity:** `O(1)` — the algorithm uses only a few variables and modifies the array in place.

## 🎯 Interview Explanation

"I use the reversal algorithm to rotate the array in place. First, I calculate `k % n` to handle large rotation values. Then I reverse the entire array, reverse the first `k` elements, and reverse the remaining elements. This gives O(n) time complexity and O(1) extra space."

## 📂 Project Structure

```text
Java-DSA-LeetCode/
└── arrays/
    └── RotateArray/
        ├── RotateArray.java
        └── README.md
```

## 🔗 LeetCode

**Problem:** Rotate Array

**Problem Number:** 189

[Practice Rotate Array on LeetCode](https://leetcode.com/problems/rotate-array/)

## 📚 Key Learnings

- Array rotation
- Two-pointer technique
- Reversal algorithm
- In-place array modification
- Handling `k` greater than the array length
- Time and space complexity analysis

## 🏷️ Tags

`Java` `DSA` `Arrays` `Two Pointers` `Reversal Algorithm` `LeetCode` `Interview Preparation`
