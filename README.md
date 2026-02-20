# LeetCode Study Log

Goal: practice core patterns (arrays, strings, hash map, two pointers, linked list, stack/queue, binary search, trees) in **Java**.

---

## Week 1 – Kickoff (Feb 20, 2026)

| Date       | Day    | Problem                             | Link                                                 | Topic                    | Notes                                                                                                           |
|-----------|--------|--------------------------------------|------------------------------------------------------|--------------------------|-----------------------------------------------------------------------------------------------------------------|
| 2026-02-20| Friday | Two Sum                             | https://leetcode.com/problems/two-sum/               | Array / HashMap (classic)| - Brute force: test all pairs → O(n²) <br/>- Hashing Map:trade O(n) space for O(1) average complement lookup → O(n) time|

---

## Week 2 – Arrays & Strings (Feb 23–27, 2026)

| Date       | Day      | Problem 1                                      | Link 1                                                      | Problem 2                                      | Link 2                                                         | Topic                        | Notes |
|-----------|----------|------------------------------------------------|-------------------------------------------------------------|------------------------------------------------|----------------------------------------------------------------|------------------------------|-------|
| 2026-02-23| Monday   | Best Time to Buy and Sell Stock                | https://leetcode.com/problems/best-time-to-buy-and-sell-stock/ | Remove Duplicates from Sorted Array           | https://leetcode.com/problems/remove-duplicates-from-sorted-array/ | Arrays / prefix / two pointers |       |
| 2026-02-24| Tuesday  | Contains Duplicate                             | https://leetcode.com/problems/contains-duplicate/          | Merge Sorted Array                             | https://leetcode.com/problems/merge-sorted-array/              | Arrays / HashSet / merge      |       |
| 2026-02-25| Wednesday| Valid Anagram                                  | https://leetcode.com/problems/valid-anagram/               | Valid Palindrome                               | https://leetcode.com/problems/valid-palindrome/                | Strings / counting / cleanup  |       |
| 2026-02-26| Thursday | Ransom Note                                    | https://leetcode.com/problems/ransom-note/                 | Longest Common Prefix                          | https://leetcode.com/problems/longest-common-prefix/           | Strings / counting / scanning |       |
| 2026-02-27| Friday   | Move Zeroes                                    | https://leetcode.com/problems/move-zeroes/                 | Plus One                                       | https://leetcode.com/problems/plus-one/                        | Arrays / in-place / carry     | Weekly review day – focus on redoing 1–2 problems without looking |

---

## Week 3 – Hash Map & Two Pointers (Mar 2–6, 2026)

| Date       | Day      | Problem 1                                      | Link 1                                                      | Problem 2                                      | Link 2                                                         | Topic                               | Notes |
|-----------|----------|------------------------------------------------|-------------------------------------------------------------|------------------------------------------------|----------------------------------------------------------------|-------------------------------------|-------|
| 2026-03-02| Monday   | Valid Parentheses                              | https://leetcode.com/problems/valid-parentheses/           | Implement Queue using Stacks                  | https://leetcode.com/problems/implement-queue-using-stacks/    | Stack / Queue basics               |       |
| 2026-03-03| Tuesday  | Intersection of Two Arrays II                  | https://leetcode.com/problems/intersection-of-two-arrays-ii/ | Majority Element                               | https://leetcode.com/problems/majority-element/                | Arrays / HashMap / counting        |       |
| 2026-03-04| Wednesday| Longest Substring Without Repeating Characters | https://leetcode.com/problems/longest-substring-without-repeating-characters/ | Minimum Size Subarray Sum                      | https://leetcode.com/problems/minimum-size-subarray-sum/       | Sliding window (strings/arrays)    |       |
| 2026-03-05| Thursday | 3Sum                                           | https://leetcode.com/problems/3sum/                        | Two Sum II – Input Array Is Sorted            | https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/| Two pointers in sorted arrays      |       |
| 2026-03-06| Friday   | Group Anagrams                                 | https://leetcode.com/problems/group-anagrams/              | Top K Frequent Elements                        | https://leetcode.com/problems/top-k-frequent-elements/         | HashMap + grouping / frequency map | Weekly review – identify patterns used (hash, two pointers, sliding window) |

---

## Week 4 – Linked List & Stack/Queue (Mar 9–13, 2026)

| Date       | Day      | Problem 1                                      | Link 1                                                      | Problem 2                                      | Link 2                                                         | Topic                          | Notes |
|-----------|----------|------------------------------------------------|-------------------------------------------------------------|------------------------------------------------|----------------------------------------------------------------|--------------------------------|-------|
| 2026-03-09| Monday   | Reverse Linked List                            | https://leetcode.com/problems/reverse-linked-list/         | Merge Two Sorted Lists                         | https://leetcode.com/problems/merge-two-sorted-lists/          | Linked list fundamentals       |       |
| 2026-03-10| Tuesday  | Linked List Cycle                              | https://leetcode.com/problems/linked-list-cycle/           | Remove Nth Node From End of List              | https://leetcode.com/problems/remove-nth-node-from-end-of-list/| Linked list + two pointers     |       |
| 2026-03-11| Wednesday| Palindrome Linked List                         | https://leetcode.com/problems/palindrome-linked-list/      | Design Linked List (optional if you have time)| https://leetcode.com/problems/design-linked-list/              | Linked list operations         |       |
| 2026-03-12| Thursday | Implement Stack using Queues                   | https://leetcode.com/problems/implement-stack-using-queues/| Min Stack                                      | https://leetcode.com/problems/min-stack/                        | Stack/queue + design           |       |
| 2026-03-13| Friday   | Daily Temperatures                             | https://leetcode.com/problems/daily-temperatures/          | Next Greater Element I                         | https://leetcode.com/problems/next-greater-element-i/          | Monotonic stack                | Weekly review – refactor at least one ugly solution |

---

## Week 5 – Binary Search & Trees (Mar 16–20, 2026)

| Date       | Day      | Problem 1                                      | Link 1                                                      | Problem 2                                      | Link 2                                                         | Topic                      | Notes |
|-----------|----------|------------------------------------------------|-------------------------------------------------------------|------------------------------------------------|----------------------------------------------------------------|----------------------------|-------|
| 2026-03-16| Monday   | Binary Search                                  | https://leetcode.com/problems/binary-search/               | Search Insert Position                         | https://leetcode.com/problems/search-insert-position/          | Binary search basics       |       |
| 2026-03-17| Tuesday  | First Bad Version                              | https://leetcode.com/problems/first-bad-version/           | Find Peak Element                              | https://leetcode.com/problems/find-peak-element/               | Binary search variations   |       |
| 2026-03-18| Wednesday| Maximum Depth of Binary Tree                    | https://leetcode.com/problems/maximum-depth-of-binary-tree/| Same Tree                                      | https://leetcode.com/problems/same-tree/                       | Tree DFS (recursion)       |       |
| 2026-03-19| Thursday | Invert Binary Tree                             | https://leetcode.com/problems/invert-binary-tree/          | Symmetric Tree                                 | https://leetcode.com/problems/symmetric-tree/                  | Tree traversal / symmetry  |       |
| 2026-03-20| Friday   | Path Sum                                       | https://leetcode.com/problems/path-sum/                    | Balanced Binary Tree                           | https://leetcode.com/problems/balanced-binary-tree/            | DFS + recursion reasoning  | Weekly review – choose 1–2 problems to re-solve from scratch |

---

### How to use this log

- Every weekday:
  - Aim for **1–2 problems**.
- For each problem:
  - Try ~20–30 minutes alone(not more).
  - If stuck, read only the **idea**, not full code.
  - Reimplement the solution in your own words.
  - In `Notes`, write:
    - what pattern you used (hash map, two pointers, sliding window, stack, etc.),
    - where you got stuck.
- Friday is always:
  - solve/re-solve,
  - review patterns used that week,
  - refactor at least one solution to be cleaner.

