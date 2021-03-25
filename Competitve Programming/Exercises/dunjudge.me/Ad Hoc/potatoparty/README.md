# potatoparty

[dunjudge.me](https://dunjudge.me/analysis/problems/332/)

# Abridged Problem Statement

Given a set of timings starting from Ai to Bi for the ith timing, find the length of the intersection of all timings

# Solution
1. Find the max value of A, the min value of B, and get the difference
    * They must intersect at this area
2. If the difference is negative , they never intersect, and the timing is 0