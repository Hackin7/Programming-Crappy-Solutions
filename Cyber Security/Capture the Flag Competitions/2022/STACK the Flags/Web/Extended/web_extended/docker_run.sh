#!/bin/bash
docker rm -f extended
docker build -t extended .
docker run --name=extended -d --rm -p80:80 -it extended