# Valid Palindrome

**LeetCode Problem:** [#125 – Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)

**Difficulty:** Easy  
**Topics:** String, Two Pointers

## Problem Statement

Given a string `s`, determine whether it is a palindrome after converting uppercase letters to lowercase and removing all non-alphanumeric characters.

A palindrome reads the same forward and backward.

## Examples

**Example 1**

```text
Input:  "A man, a plan, a canal: Panama"
Output: true
```

**Example 2**

```text
Input:  "race a car"
Output: false
```

**Example 3**

```text
Input:  " "
Output: true
```

## Approach: Two Pointers

1. Initialize `left` at the beginning and `right` at the end.
2. Skip characters that are not letters or digits.
3. Compare both characters without case sensitivity.
4. If they differ, return `false`.
5. Move both pointers inward until they meet.
6. Return `true` if every comparison matches.

## Java Implementation

See `ValidPalindrome.java` for the complete standalone Java program.

## Complexity Analysis

| Complexity | Description |
|---|---|
| Time: O(n) | Each character is processed at most a constant number of times. |
| Extra Space: O(1) | Only two pointers and a few variables are used. |

## Project Structure

```text
ValidPalindrome/
├── ValidPalindrome.java
└── README.md
```

## Key Interview Concepts

- Two Pointers
- String Manipulation
- Character Validation
- Case-Insensitive Comparison
- Time and Space Complexity

## Key Takeaway

The two-pointer approach checks a palindrome efficiently without creating a new cleaned string.

## Tags

`Java` `LeetCode` `DSA` `String` `TwoPointers` `InterviewPreparation`
