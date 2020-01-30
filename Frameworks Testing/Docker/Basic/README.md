# Basic
This is a basic docker image

Run outside of the folder
```
sudo docker build Basic
sudo docker run <imageID>
```

To create a new container
```
sudo docker create <imageID> #To create container
sudo docker container start <containerID>
sudo docker exec -it <containerID> <cmd>
sudo docker container stop <containerID>
```
