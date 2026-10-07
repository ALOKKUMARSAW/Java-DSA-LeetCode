# Contains Duplicate

> **LeetCode #217** | **HashSet** | **Array** | **Easy**

## 📌 Problem

Given an integer array `nums`, return `true` if any value appears at least twice.

Return `false` if every element is unique.

### Example 1

```text
Input:
nums = [1, 2, 3, 1]

Output:
true
```

The value `1` appears more than once.

### Example 2

```text
Input:
nums = [1, 2, 3, 4]

Output:
false
```

All elements are unique.

---

## 💡 Approach

Use a `HashSet` to store the elements that have already been visited.

For each element:

1. Check if the element already exists in the `HashSet`.
2. If it exists, return `true`.
3. Otherwise, add the element to the `HashSet`.
4. If the complete array is traversed without finding a duplicate, return `false`.

---

## 💻 Java Implementation

```java
import java.util.HashSet;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add(nums[i]);
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        boolean result = containsDuplicate(nums);

        System.out.println("Contains Duplicate: " + result);
    }
}
```

### Output

```text
Contains Duplicate: true
```

---

## ⏱️ Complexity Analysis

| Complexity | Value |
|---|---|
| Time | `O(n)` |
| Space | `O(n)` |

### Why?

- The array is traversed once → `O(n)`
- The `HashSet` can store up to `n` elements → `O(n)`
- `HashSet.contains()` and `HashSet.add()` are `O(1)` on average

---

## 🧠 Java Concepts Practiced

- Arrays
- HashSet
- Java Collections
- `contains()`
- `add()`
- Duplicate detection
- Time Complexity
- Space Complexity

---

## 🎯 Interview Explanation

> I use a HashSet because it stores unique elements. While traversing the array, I check whether the current element already exists in the set. If it exists, a duplicate is present, so I return true. Otherwise, I add the element to the set. If I finish traversing the array without finding a duplicate, I return false.

---

## ⚡ Optimized Java Approach

We can also use the return value of `HashSet.add()`:

```java
public static boolean containsDuplicate(int[] nums) {

    HashSet<Integer> set = new HashSet<>();

    for (int num : nums) {
        if (!set.add(num)) {
            return true;
        }
    }

    return false;
}
```

`HashSet.add()` returns:

```text
true  → element was added
false → element already exists
```

---

## 🔗 LeetCode

| Property | Details |
|---|---|
| Problem | Contains Duplicate |
| Problem Number | #217 |
| Difficulty | Easy |
| Pattern | HashSet |
| Data Structure | Array + HashSet |

[View Problem on LeetCode](https://leetcode.com/problems/contains-duplicate/)

---

## 📂 Project Structure

```text
ContainsDuplicate/
├── ContainsDuplicate.java
└── README.md
```

---

## 📈 Key Learning

The main takeaway is that `HashSet` is useful when we need to quickly check whether an element has already been seen.

### Important Pattern

```text
Array
  ↓
HashSet
  ↓
Check if element exists
  ↓
Duplicate found → true
  ↓
Otherwise add element
  ↓
End → false
```

### Key Optimization

```text
Brute Force: O(n²)
       ↓
HashSet: O(n)
```

The optimized solution uses additional memory to achieve faster lookup.

---

## 🏷️ Tags

`Java` `DSA` `LeetCode` `HashSet` `Arrays` `Java Collections` `Interview Preparation`