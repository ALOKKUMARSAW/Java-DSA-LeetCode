# Group Anagrams — LeetCode 49

## Problem Statement

Given an array of strings `strs`, group the anagrams together. You can return the answer in any order.

Anagrams are words that contain the same characters with the same frequencies, but their characters may appear in a different order.

**LeetCode:** https://leetcode.com/problems/group-anagrams/

## Example

**Input**
```text
strs = ["eat","tea","tan","ate","nat","bat"]
```

**Possible Output**
```text
[["eat","tea","ate"],["tan","nat"],["bat"]]
```

**Explanation**

- `"eat"`, `"tea"`, and `"ate"` are anagrams.
- `"tan"` and `"nat"` are anagrams.
- `"bat"` forms its own group.

## Approach: HashMap + Sorting

1. Create a `HashMap` where the key is the sorted version of a word and the value is a list of words with that key.
2. Traverse the input array using an indexed `for` loop.
3. Convert each word into a character array.
4. Sort the character array and convert it back into a string.
5. If the key does not exist, create a new list for it.
6. Add the original word to the list associated with its sorted key.
7. Return all the grouped lists.

### Example of the Key

| Original word | Sorted key |
|---|---|
| `eat` | `aet` |
| `tea` | `aet` |
| `ate` | `aet` |
| `tan` | `ant` |
| `nat` | `ant` |
| `bat` | `abt` |

Words with the same sorted key belong to the same group.

## Complexity Analysis

Let:
- `n` = number of strings
- `m` = maximum length of a string

**Time Complexity:** `O(n × m log m)`

Each string is sorted in `O(m log m)` time.

**Space Complexity:** `O(n × m)` for storing the grouped strings and their keys, excluding implementation-specific overhead.

## Java Concepts Used

- `HashMap`
- `ArrayList`
- `List` and `Map` interfaces
- Character arrays
- `Arrays.sort()`
- String construction
- Indexed `for` loops

## Project Structure

```text
GroupAnagrams/
├── GroupAnagrams.java
└── README.md
```

## How to Run in VS Code

Ensure that the Java JDK is installed.

Open the terminal inside the `GroupAnagrams` folder and execute:

```bash
javac GroupAnagrams.java
java GroupAnagrams
```

## Key Interview Takeaways

- Anagrams share the same sorted character sequence.
- A `HashMap` efficiently groups words by a common key.
- The original word must be stored in the result, not its sorted key.
- The order of returned groups does not matter.
- This is a common HashMap and String interview problem.

## Tags

`Array` `String` `HashMap` `Sorting` `LeetCode` `Medium`

## Problem Link

https://leetcode.com/problems/group-anagrams/
