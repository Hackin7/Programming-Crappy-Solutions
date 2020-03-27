# lis_ex
The classic Longest Increasing Subsequence Problem, but you were too slow to solve it
[dunjudge.me](https://dunjudge.me/analysis/problems/68/)

# Abridged Problem Statement
Find the longest increasing subsequence. The subsequence does not have to be contiguous. Also this time the input size is much larger

# Status 
100%. [Grading](https://dunjudge.me/analysis/submissions/716514/)

# Solution: O(N log N), Binary Searching
A good explanation would be available [here](https://drive.google.com/drive/folders/1hTvkuQTgpJRWgQkdqB_WRtPMGezI2lRW) under Line sweep? You **don't** need to use fenwick tree/ segment tree, in fact, it causes MLE.

Here was our solution in the original lis problem:
```
Let lis(i) be the LIS that ends at A[i]
	lis(0)=1
	lis(i) = max(lis(i), lis(j)+1); j<=i
	
ans = argmax lis(i)
```
```
for (int i = 0; i < N; ++i) {//Outside
        lis[i] = 1;
        for (int j = 0; j < i; ++j) //Inside
            if (A[j] < A[i])lis[i] = max(lis[i], 1 + lis[j]);
        ans = max(ans, lis[i]);
    }
```

However this is clearly not fast enough, as submitting this will only get you subtask 1, 50%. 

Hence we need to speed this up

We would use a different DP: 
What is the smallest value a LIS of length i can end in among the first j
elements?

For a better explanation of the solution used, check here: [https://www.geeksforgeeks.org/longest-monotonically-increasing-subsequence-size-n-log-n/](https://www.geeksforgeeks.org/longest-monotonically-increasing-subsequence-size-n-log-n/)

Explanation (Crappy)
1. Find the relative position/ order of element a[i] among other elements (used C++ lower bound)
	* You only need the order and not the value (Discretization)
2. Set h[i] = a[i], so that you can find the 
	* What happens if the lis increases than decreases?
		* The new smaller value will be set (eg. in [2, 1, 3] if h[0] was 2, it's now changed to 1)
			* This prevents double counting
		* After that h[1] = a[2] = 3 (through lower bound)
		* The LIS calculated at that position would be the number of elements before or equal to its value (a[2]=3) that are in an increasing manner (1+1=2)
3.  Calculate the ans = max(p+1, ans)
	* The position p can be used to give the length of the LIS before the current position
```
#include <bits/stdc++.h>
using namespace std;
//With reference to https://noiref.codecla.ws/dp/#lis
int main(){
    int N; cin >> N;
    int a[N];
    for (int i=0;i<N;i++)cin >> a[i];
    int h[N], l;
    for (int i = l = 0; i < N; ++i) {
        //Find the position of the 
        int p = lower_bound(h, h+l, a[i])-h; 
        h[p] = a[i];
        l = max(p+1, l);
    }
    cout<<l;
}
```