# car
[dunjudge](https://dunjudge.me/analysis/problems/269/)

# Abridged Problem Statement
Given a graph of N nodes and E edges, find the smallest of the maximum values of the edge weight needed to be crossed to traverse from node 1 to node N.

# Status
50%, Subtask 1 and 2.
[Grading](https://dunjudge.me/analysis/submissions/715996/)

# Current Solution
1. Sort the weights in ascending order
2. Build a new graph with the weights with Kruskal's algorithm
3. Traverse the graph from node 1 to node N to find the largest weight of each edge needed.