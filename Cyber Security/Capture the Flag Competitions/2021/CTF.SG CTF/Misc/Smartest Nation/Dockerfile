FROM debian:stable

RUN apt-get update \
    && apt-get install python3 python3-pip -y 

COPY cgi /app

WORKDIR /app

RUN pip3 install -r requirements.txt

ENV user=noob

RUN useradd -m $user
RUN echo "$user     hard    nproc       20" >> /etc/security/limits.conf
COPY flag.txt //home/$user/flag
RUN chown -R root:$user /home/$user
RUN chmod -R 750 /home/$user
RUN chown root:$user /home/$user/flag
RUN chmod 440 /home/$user/flag

EXPOSE 8000

USER $user
CMD ["gunicorn", "--bind", "0.0.0.0:8000", "app"]