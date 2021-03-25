#!/bin/sh
NAME=square
/usr/bin/g++ -std=c++11 -O2 -DEVAL -o $NAME grader.cpp $NAME.cpp -lm -static
