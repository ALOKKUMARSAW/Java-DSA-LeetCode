# LeetCode 3: Longest Substring Without Repeating Characters

**Difficulty:** Medium  
**Topics:** String, HashSet, HashMap, Sliding Window  
**Language:** Java

## Problem Statement

Given a string `s`, find the length of the longest substring without repeating characters.

A substring is a contiguous sequence of characters.

### Examples

**Example 1**
```text
Input:  s = "abcabcbb"
Output: 3
Explanation: "abc" is the longest substring without repeating characters.
```

**Example 2**
```text
Input:  s = "bbbbb"
Output: 1
Explanation: "b" is the longest substring without repeating characters.
```

**Example 3**
```text
Input:  s = "pwwkew"
Output: 3
Explanation: "wke" is a longest substring without repeating characters.
```

## Project Structure

```text
LongestSubstring_Approaches_2_3_4/
│
├── NestedLoopsHashSet.java
├── SlidingWindowHashSet.java
├── SlidingWindowHashMap.java
└── README.md
```

## Approach 2: Nested Loops + HashSet

### Explanation

- Start from each index in the string.
- Use a `HashSet` to track characters in the current substring.
- Extend the substring one character at a time.
- Stop when a duplicate character is found.
- Update the maximum substring length.

### Complexity

- **Time:** O(n²) average
- **Space:** O(min(n, character set size))

### Run the Code

```bash
javac Approach2_NestedLoopsHashSet.java
java Approach2_NestedLoopsHashSet
```

## Approach 3: Sliding Window + HashSet

### Explanation

- Maintain a window containing unique characters.
- Use `left` and `right` pointers to define the window.
- Move `right` to expand the window.
- When a duplicate appears, remove characters from the left until the duplicate is eliminated.
- Update the maximum length using `right - left + 1`.

Each character enters and leaves the set at most once.

### Complexity

- **Time:** O(n) average
- **Space:** O(min(n, character set size))

### Run the Code

```bash
javac Approach3_SlidingWindowHashSet.java
java Approach3_SlidingWindowHashSet
```

## Approach 4: Sliding Window + HashMap

### Explanation

- Use a `HashMap` to store each character's most recent index.
- Move `right` through the string.
- If a repeated character is inside the current window, move `left` directly to the next position after its previous occurrence.
- Update the character's last-seen index.
- Track the maximum substring length.

The following statement prevents the left pointer from moving backwards:

```java
left = Math.max(left, lastSeen.get(current) + 1);
```

### Complexity

- **Time:** O(n) average
- **Space:** O(min(n, character set size))

### Run the Code

```bash
javac Approach4_SlidingWindowHashMap.java
java Approach4_SlidingWindowHashMap
```

## Expected Output

All three programs should produce the following results:

```text
Input: "abcabcbb"
Output: 3

Input: "bbbbb"
Output: 1

Input: "pwwkew"
Output: 3

Input: ""
Output: 0
```

## Comparison of Approaches

| Approach | Technique | Time Complexity | Space Complexity |
|---|---|---|---|
| 2 | Nested Loops + HashSet | O(n²) average | O(min(n, character set size)) |
| 3 | Sliding Window + HashSet | O(n) average | O(min(n, character set size)) |
| 4 | Sliding Window + HashMap | O(n) average | O(min(n, character set size)) |

## Best Approach for Interviews

**Approach 4: Sliding Window + HashMap**

This is a strong interview solution because it runs in O(n) average time and moves the left pointer directly past duplicate characters.

### Interview Explanation

"I use a sliding window and a HashMap to store the last-seen index of each character. When a duplicate occurs within the current window, I move the left pointer to the position after its previous occurrence. I update the maximum window length at each step. The time complexity is O(n) on average."

```