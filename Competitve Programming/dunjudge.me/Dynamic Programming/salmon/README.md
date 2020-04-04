# salmon
[dunjudge.me](https://dunjudge.me/analysis/problems/415/)

# Abridged Problem Statement
Given N Salmon Slices, Maximise the possible value of the dishes made.

# Status 
53%. [Grading]([https://dunjudge.me/analysis/submissions/718932/](https://dunjudge.me/analysis/submissions/718932/))

# Solution
1 observation you can make is that for example, to make 1 The Premium Bento you need six salmon maki and five slices of salmon sashimi. Since 1 salmon maki needs 2 slices of salmon sashimi, the Premium Bento requires 6*2+1 salmon sashimi total. You can convert each dish to the cost in salmon sashimi. 

This is actually a knapsack problem

To solve Subtask 1, just do 0-1 knapsack (Read the number of items from the question). Since there can be 1023 of each dish, make 1023 copies of each dish

Subtask 2 is currently unsolved due to TLE