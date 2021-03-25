# snack
[dunjudge.me](https://dunjudge.me/analysis/problems/297/)

## Abridged Problem Statement
You have a string of length N. In the string, digits from 0-9 will have 0-9 points respectively. There will also be the letter 'M' which will give -2 points
eg `15M81`

Find the maximum number of points obtainable from a consecutive segment of the string.

## Status
100% [Grading](https://dunjudge.me/analysis/submissions/716978/)

## Solution
This is a typical 1D maxsum problem. You can convert a string into an array of the appropriate values. After that just put it the 1-D Maxsum algorithm.

Take note that the minimum choice is 0 (Costs you Subtask 1 Test Case 1)
So take the maximum of all the values in the array **AND** the value 0