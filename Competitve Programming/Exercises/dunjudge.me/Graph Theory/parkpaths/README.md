# parkpaths
[dunjudge.me](https://dunjudge.me/analysis/problems/526/)

# Status
100% [Grading](https://dunjudge.me/analysis/submissions/722556/)

# Solution
1. For every unique letter, you have to spend 2 units of time to build
2. For every unique bidirectional edge betweeen 2 letters, you have to spend 1 unit of time to build. You can use an adjacency matrix to connect letters together (since the number of nodes is small enough to prevent MLE), and check if 2 letters are already connected such that you don't have to construct an edge twice

