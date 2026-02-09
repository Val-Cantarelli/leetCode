# Amazon SDE I Online Assessment — February 2026

This document contains the technical coding problems from the Amazon SDE I Online Assessment completed in February 2026.

---

## Problem 1 — Total Response Time (Request Throttling)

### Description

In Amazon’s web infrastructure, the system logs n API requests per second, recording the response time of each request in the array responseTimes.

To prevent system overload, a throttling mechanism is applied with the following behavior:

At each step:

1. Select the request with the minimum response time.
   If multiple requests have the same minimum time, select the one with the lowest index.
2. Remove the selected request and its immediate neighbors in the array (based on original indices) permanently.
3. Repeat the process until all requests are removed.

During the process, accumulate the response times of the selected requests.

---

### Objective

Compute the total cumulative response time of all selected requests.

---

### Input

responseTimes: A list of integers representing the response time of each request.

---

### Output

Return a long representing the sum of the response times of all selected requests.

---

### Constraints

3 ≤ n ≤ 2 × 10⁵  
1 ≤ responseTimes[i] ≤ 10⁵

---

### Example

Input:  
responseTimes = [4, 2, 9, 1, 7, 3]

Output:  
6

Explanation:

1. Select 1, remove 9 and 7
2. Select 2, remove 4
3. Select 3

Sum = 1 + 2 + 3 = 6

---

## Problem 2 — Maximum Lexicographical MEX Array

### Description

You are given an array data_packets of size n.

The algorithm repeatedly performs the following steps until data_packets becomes empty:

1. Choose an integer k such that:

   1 ≤ k ≤ length(data_packets)

2. Compute the MEX (Minimum Excludant) of the first k elements.
3. Append this MEX value to an array result.
4. Remove the first k elements from data_packets.

The process continues until the array is empty.

---

### Definition: MEX

The MEX of a set of non-negative integers is the smallest non-negative integer not present in the set.

Examples:

MEX({1,2,3}) = 0  
MEX({0,1,2,4}) = 3

---

### Objective

Find the lexicographically maximum array result that can be obtained.

---

### Definition: Lexicographical Order

An array x is lexicographically greater than array y if:

- At the first index where they differ: x[i] > y[i], or
- y is a prefix of x.

Examples:

[3,2,1] > [3,1,5]  
[1,2,3,4] > [1,2,3]

---

### Input

data_packets: A list of integers.

---

### Output

Return the array result that is lexicographically maximum.

---

### Constraints

1 ≤ n ≤ 2 × 10⁵  
0 ≤ data_packets[i] ≤ n

---
