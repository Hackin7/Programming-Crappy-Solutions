#!/bin/sh
NAME=square
/usr/bin/fpc -dEVAL -O2 -o$NAME -XS grader.pas
