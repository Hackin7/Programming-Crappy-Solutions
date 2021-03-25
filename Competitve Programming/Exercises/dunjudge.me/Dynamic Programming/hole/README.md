# hole
[dunjudge.me](https://dunjudge.me/analysis/problems/146/)

# Abridged problem statement
Given a 2D square array of 1s and 0s, find the length of the largest square in the array where there are only 0s. 

# Status
100% [Grading](https://dunjudge.me/analysis/submissions/717789/)

# Solution
There is the [official NOI solution](https://github.com/ranaldmiao/sg_noi_archive/blob/master/2007/solution_presentation/noi_solution_2007.pdf)

Basicaly you can think of it as finding the largest square where the 2D range sum query is 0 (Because all 0s).

1. Implement a 2D Range sum query algorithm
2. Then loop through all the hole sizes and coordinates. Check if the Range Sum Query==0