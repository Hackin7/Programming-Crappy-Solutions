# lis
The classic Longest Increasing Subsequence Problem
[dunjudge.me](https://dunjudge.me/analysis/problems/68/)

# Abridged Problem Statement
Find the longest increasing subsequence. The subsequence does not have to be contiguous

# Status 
100%. [Grading](https://dunjudge.me/analysis/submissions/635238/)

# Solution: O(N^2)
A good explanation would be available [here](https://drive.google.com/file/d/1aDltlnjlsUuMl5XsSRe4KstS7BCY-xDF/view?usp=sharing)

Let lis(i) be the LIS that ends at A[i]
	lis(0)=1
	lis(i) = max(lis(i), lis(j)+1); j<=i
	
ans = argmax lis(i)

```
for (int i = 0; i < N; ++i) {//Outside
        lis[i] = 1;
        for (int j = 0; j < i; ++j) //Inside
            if (A[j] < A[i])lis[i] = max(lis[i], 1 + lis[j]);
        ans = max(ans, lis[i]);
    }
```

## Things to take note of
Make sure to loop i (where you are calculating the lis that ends)
* Then loop j from 0 to i-1: the previous lis length you are calculating from

Don't switch up the order of the loops
* Switching up the order of the loops will not properly calculate the smaller LIS
* You will need the smaller LIS result to be fully calculated first to use in future DP calculations
* Try thinking up of a test case where this will happen.

eg dont do this (20% solution on dunjudge.me)
```
 for(int i=0;i<N;i++){//To
        for(int j=i+1;j<N;j++){
            if (A[i]<A[j])
                memo[j] = max(memo[j],memo[i]+1);
        }
    }
```