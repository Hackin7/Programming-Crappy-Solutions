# CSIT's The Infosecurity Challenge (TISC) 2020
# https://play.tisc.csit-events.sg/
# 
# Challenges 2, 3 & 4 require part of this package
#
#  $$$$$$$$\ $$$$$$\  $$$$$$\   $$$$$$\  
#  \__$$  __|\_$$  _|$$  __$$\ $$  __$$\ 
#     $$ |     $$ |  $$ /  \__|$$ /  \__|
#     $$ |     $$ |  \$$$$$$\  $$ |      
#     $$ |     $$ |   \____$$\ $$ |      
#     $$ |     $$ |  $$\   $$ |$$ |  $$\ 
#     $$ |   $$$$$$\ \$$$$$$  |\$$$$$$  |
#     \__|   \______| \______/  \______/ 
#
# For your safety, please run the ransomware in this 
# docker image or in a isolated virtual machine

FROM ubuntu:focal

RUN apt-get update
RUN apt-get install -y ca-certificates

COPY ./encrypted /root
COPY ./anorocware /root

WORKDIR /root
ENTRYPOINT ["/bin/bash"]
