# universe
[dunjudge.me](https://dunjudge.me/analysis/problems/1447/)

# Status
100% [Grading](https://dunjudge.me/analysis/submissions/722609/)

# Solution
1. Construct the tree
2. Conduct DFS from node 1 to the rest of the nodes, keeping track of the number of consecutive cats passed by (through a function parameter).
3. At each node, check if there are children (Nodes that are not already visited). If there are none, you reached a restaurant
