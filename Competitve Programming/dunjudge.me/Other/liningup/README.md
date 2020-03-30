# lineup
[dunjudge.me](https://dunjudge.me/analysis/problems/1976/)

#Abridged Problem Statement
Read the question. It should be short and simple enough.

# Status
100% [Grading](https://dunjudge.me/analysis/submissions/718128/}

# Solution
This is a relatively easy problem, so I advise you to try on your own first.
If you want hints, it is a Math problem.

Ok? Here we go.

Basically, for each value of A[i], there must be another value A[j] where A[i]==A[j].
The only exception is 0, because there can only be 1 middle value.

Check all the values of A[i] to see if there is a duplicate. If there is more than 1/less than 1 duplicate, there is no possible order.
For even N, the values of A[i] are 1,3,5......N-1. For odd N, the values are 0,2,4...N-1.

If there are possible orders, the number of possible orders have to be 2^(N floor divide by 2). 
This is because for every pair of value, there are 2 possible ways to arrange them. Basically a Permutations and Combinations question.
Also, use fast exponentiation to modulo the value.