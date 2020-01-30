FROM python:3

WORKDIR /usr/src/app
COPY . .

# Get list of items
RUN ls

#Expose ports if needed
#EXPOSE 80 5000

ENTRYPOINT  ["python3","main.py"]
CMD ["main.py"]
