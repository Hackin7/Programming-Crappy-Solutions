# monopoly
[dunjudge](https://dunjudge.me/analysis/problems/254/)

# Abridged Problem Statement
Find the number of ways to reach the end square from the start square. The squares are numbered, A0 ..... A(N-1)/B0 ...B(N-1)/C0...C(N-1)/D0...D(N-1)/A0.

A(N-1) = B0 and so on.
# Status
100% [Grading](https://dunjudge.me/analysis/submissions/717761/)

# Solution
Doing the First subtask
1. You can treat it as counting the number of ways to reach a position from the start position 0. 
    * You have to convert the labelling of the squares to a suitable labelling
2. You can hence think of a DP state. 
    * Usually, when I do DP, I like to think of how to brute force this thing. 
    * You can think of Brute Forcing it as essentially working backwards from the end state (working frontwards also works, but may be harder to do)
    * So this is what I came up with
```
ways(<0)=0
ways(0)=1
ways(i) = ways(i-1)+ways(i-2)+...+ways(i-6)
```
3. Just add memoization

Doing the next few subtasks
1. The value of N does not matter. You can convert the labelling such that it's on a linear scale
2. The previous solution should work

There is a good explanation of the solution [here](https://www.geeksforgeeks.org/count-ways-reach-nth-stair/)

## Things to Take Note of
1. Use `dp[j] = (dp[j]+dp[j-i])%M)` instead of `dp[j]+=dp[j-i]%M`. There's a mathematical difference

