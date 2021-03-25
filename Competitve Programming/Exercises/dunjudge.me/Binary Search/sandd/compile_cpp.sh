#!/bin/bash

NAME=sandd

/usr/bin/g++ -DEVAL -Wall -static -O2 -o $NAME grader.cpp sandd.cpp
