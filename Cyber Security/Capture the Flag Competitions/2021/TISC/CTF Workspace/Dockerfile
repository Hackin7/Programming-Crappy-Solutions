FROM kalilinux/kali-rolling

### Enumeration
RUN apt update && apt install -y masscan nmap
RUN apt update && apt install -y seclists dirb
RUN apt update && apt install -y enum4linux
RUN apt update && apt install -y python3 python3-pip
RUN apt update && apt install -y metasploit-framework
RUN apt update && apt install -y exploitdb


### Brute Forcing Passwords
RUN apt update && apt install -y crunch cewl
RUN apt update && apt install -y medusa crowbar hydra 
RUN apt update && apt install -y hashid john
 

# Copy all items
WORKDIR /usr/src/app
COPY . .

# Get list of items
RUN ls

#Expose ports if needed
# EXPOSE 80 5000
#  docker run -dp 3000:3000 getting-started

## Entry points
# To run the container, docker build <directory>, docker run -it <image_id>
ENTRYPOINT  ["bash", "-c", "bash"]
CMD ["bash -c bash"]
