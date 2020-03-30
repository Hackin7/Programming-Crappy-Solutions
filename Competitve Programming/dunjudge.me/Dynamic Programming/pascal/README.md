# pascal
[dunjudge.me](https://dunjudge.me/analysis/problems/52/)

#Abridged Problem Statement
Find N-1 choose R-1

# Status
100% [Grading](https://dunjudge.me/analysis/submissions/717554/)

#Solution
Loop R-1 times. For each time, multiple by N-1 and divide by 1, multiply by N-2 and divide by 2 .....

This prevents the answer from becoming too big (to store in an unsigned long long) at any point in time

## Things to Take Note
Do not do `ans*=mul/div`. What if mul>div?