#!/bin/python3

import math
import os
import random
import re
import sys

# Haha why dp when you can recursion
# JK recursion gave me 32 timed out F

a = []
b = []
dp = {}
def maxValue(count, currSum, maxSum, a_index, b_index):
    #print(count, currSum, maxSum, a_index, b_index)
    #print(a)
    #print(b)
    ### Base Case#######################################
    if currSum > maxSum:
        return -1 # if you exceed, no point
    key = (count, currSum, maxSum, a_index, b_index)
    if dp.get(key) != None:
        return dp.get(key)
    ### Recursive Case #################################
    # Choice
    if a_index < len(a):
        val1 = maxValue(count+1, currSum+a[a_index], maxSum, a_index+1, b_index)
    else:
        val1 = -1
    if b_index < len(b):
        val2 = maxValue(count+1, currSum+b[b_index], maxSum, a_index, b_index+1)
    else:
        val2 = -1
    val3 = count # Don't take at all
    # Decision Making
    #print(val1, val2, val3)
    dp[key] = max(val1, val2, val3)
    return dp[key]

def portfolio_profit_maximisation(maxSum, a, b):
    # Write your code here
    return maxValue(0, 0, maxSum, 0, 0)

if __name__ == '__main__':
    first_multiple_input = input().rstrip().split()

    n = int(first_multiple_input[0])

    m = int(first_multiple_input[1])

    maxSum = int(first_multiple_input[2])

    a = list(map(int, input().rstrip().split()))

    b = list(map(int, input().rstrip().split()))

    result = portfolio_profit_maximisation(maxSum, a, b)

    print(result)
