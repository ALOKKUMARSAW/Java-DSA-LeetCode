# Longest Common Prefix

**LeetCode Problem:** [#14 – Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/)

**Difficulty:** Easy  
**Topics:** String, Array

## Problem Statement

Given an array of strings, find the longest common prefix shared by all strings.

If there is no common prefix, return an empty string `""`.

## Examples

**Example 1**

```text
Input:  ["flower", "flow", "flight"]
Output: "fl"
```

**Example 2**

```text
Input:  ["dog", "racecar", "car"]
Output: ""
```

**Example 3**

```text
Input:  ["interspecies", "interstellar", "interstate"]
Output: "inters"
```

## Approach: Horizontal Scanning

1. Take the first string as the initial prefix.
2. Iterate through the remaining strings.
3. Use `startsWith()` to check whether each string begins with the prefix.
4. If not, remove the last character from the prefix.
5. Repeat until the prefix matches or becomes empty.
6. Return the final prefix.

## Java Implementation

See `LongestCommonPrefix.java` for the complete standalone Java program.

## Complexity Analysis

Let `n` be the number of strings and `m` be the maximum string length.

| Complexity | Description |
|---|---|
| Time: O(n × m) | Each string may require checking a prefix of length up to `m`. |
| Auxiliary Space: O(m) | Shortening the prefix creates new strings in Java. |

## Project Structure

```text
LongestCommonPrefix/
├── LongestCommonPrefix.java
└── README.md
```

## Key Interview Concepts

- String Manipulation
- Array Traversal
- `startsWith()` Method
- Prefix Matching
- Time and Space Complexity

## Key Takeaway

Horizontal scanning is a simple way to find the longest common prefix by progressively shortening the candidate prefix until it matches every string.

## Tags

`Java` `LeetCode` `DSA` `String` `Array` `InterviewPreparation`
