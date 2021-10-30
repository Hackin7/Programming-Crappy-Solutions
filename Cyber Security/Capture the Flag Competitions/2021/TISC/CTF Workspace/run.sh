#!/bin/sh

sudo docker build . -t test:test # name:tag
sudo docker run \
    -p 8000:8000 \
    -v "$(pwd)":/mnt \
    -it \
    test:test
