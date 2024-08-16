# Problem Description
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

## Example 1:
Input: strs = ["eat","tea","tan","ate","nat","bat"]

Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

## Example 2:
Input: strs = [""]

Output: [[""]]

## Example 3:
Input: strs = ["a"]

Output: [["a"]]

# Solution Description
1. Iterate Array of string (["eat","tea","tan","ate","nat","bat"])
2. Short the string characters (example - eat will be sorted as aet)
3. Put into the map key as sorted string and value as string element (Example - Key will be aet, and value of map be eat in list)