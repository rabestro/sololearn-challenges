# Word Rank  

A word is a sequence of letters A-Z. Rearranging the letters in the word, you can come up with new words, composed of the same letters. 
For example, the letters in the word TESTING can be rearranged to result in SETTING.
If we sort all the words made up of the same set of letters alphabetically, we can calculate the rank of each word.  

## Task:
Given a word (not limited to just "dictionary words"), calculate and output its rank among all the words that can be made from the letters of that word. The word can contain duplicate letters.

## Input Format:
A string, representing a sequence of letters (A-Z).

## Output Format:
An integer, representing the rank of the given word.

## Sample Input:
ABAB

## Sample Output:
2

## Explanation: 
Let's create a list of all the words that can be made up of the letters of the input and sort them alphabetically:
1. AABB
2. ABAB
3. ABBA
4. BAAB
5. BABA
6. BBAA

The given word is number 2 in the list.
