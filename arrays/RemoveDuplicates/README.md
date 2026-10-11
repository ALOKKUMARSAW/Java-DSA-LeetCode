# Remove Duplicates from Sorted Array — LeetCode #26

## 📌 Problem Statement

Given an integer array `nums` sorted in non-decreasing order, remove the duplicates in place so that each unique element appears only once.

Return the number of unique elements `k`.

The first `k` elements of the modified array must contain the unique elements in their original sorted order.

**Requirements:**
- Modify the original array in place.
- Keep the unique elements in sorted order.
- Use `O(1)` extra space for the two-pointer approach.

## 📝 Examples

### Example 1

**Input:**
```text
nums = [1, 1, 2]
```

**Output:**
```text
k = 2
nums = [1, 2, _]
```

### Example 2

**Input:**
```text
nums = [0, 0, 1, 1, 1, 2, 2, 3, 3, 4]
```

**Output:**
```text
k = 5
nums = [0, 1, 2, 3, 4, _, _, _, _, _]
```

Only the first `k` elements matter.

---

## 💡 Approach 1: Two Pointers (`j`)

**File:** `RemoveDuplicatesTwoPointers.java`

### Idea

Since the array is sorted, duplicate elements are adjacent.

We use two pointers:
- `i`: Traverses the array.
- `j`: Tracks the index of the last unique element.

### Steps

1. If the array is empty, return `0`.
2. Initialize `j = 0`.
3. Start traversing from index `1`.
4. If `nums[i] != nums[j]`, increment `j` and copy `nums[i]` to `nums[j]`.
5. Return `j + 1`.

### Java Code

```java
public class RemoveDuplicatesTwoPointers {

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int j = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        return j + 1;
    }
}
```

### Complexity

- **Time:** `O(n)`
- **Extra space:** `O(1)`

---

## 💡 Approach 2: HashSet with a Normal `for` Loop

**File:** `RemoveDuplicatesHashSet.java`

### Idea

A `HashSet` stores unique elements. We traverse the sorted array using a normal `for` loop and copy each unseen element to the next available position.

### Steps

1. Create a `HashSet` to store elements already seen.
2. Initialize `k = 0`.
3. Traverse the array using a normal `for` loop.
4. If the current element is not in the set, add it and copy it to `nums[k]`.
5. Increment `k` and return it after traversal.

### Java Code

```java
import java.util.HashSet;

public class RemoveDuplicatesHashSet {

    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i])) {
                set.add(nums[i]);
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}
```

### Complexity

- **Average time:** `O(n)`
- **Extra space:** `O(n)`

---

## 📊 Approach Comparison

| Feature | Two Pointers (`j`) | HashSet |
|---|---|---|
| Time complexity | `O(n)` | Average `O(n)` |
| Extra space | `O(1)` | `O(n)` |
| In-place modification | Yes | Yes |
| Preserves sorted order | Yes | Yes |
| Meets LeetCode constraints | Yes | Yes |
| Best use | Interviews and production | Learning uniqueness with sets |

## 🎯 Interview Explanation

"I use two pointers because the array is sorted. One pointer traverses the array, while the other tracks the last unique element. Whenever I find a new value, I move the unique pointer forward and copy the value. This solution takes O(n) time and O(1) extra space. A HashSet approach is also possible, but it requires O(n) extra space."

## 📂 Project Structure

```text
Java-DSA-LeetCode/
└── arrays/
    └── RemoveDuplicatesFromSortedArray/
        ├── RemoveDuplicatesTwoPointers.java
        ├── RemoveDuplicatesHashSet.java
        └── README.md
```

## 🔗 LeetCode

**Problem:** Remove Duplicates from Sorted Array

**Problem Number:** 26

[Practice on LeetCode](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

## 📚 Key Learnings

- Two-pointer technique
- Array traversal using a normal `for` loop
- In-place array modification
- Duplicate detection in sorted arrays
- Java `HashSet` and `contains()`
- Time and space complexity analysis

## 🏷️ Tags

`Java` `DSA` `Arrays` `Two Pointers` `HashSet` `LeetCode` `Interview Preparation`
