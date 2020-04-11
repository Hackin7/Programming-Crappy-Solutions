# pyramidhotel
[dunjudge.me](https://dunjudge.me/analysis/submissions/722664/)

# Status
100% [Grading](https://dunjudge.me/analysis/submissions/722664/)

# Solution
Basically just let the DP state be this, counting backwards
```
dp[N-1] = 1; //Pyramid starts from 0
dp[i] = min( dp[i+1], H[i] ) //See if the pyramid can fit, else, shift the pyramid until it can fit
```