FROM buildkite/puppeteer:v1.15.0

RUN apt-get update \
    && apt-get install -y wget gnupg \
    && wget -q -O - https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add - \
    && sh -c 'echo "deb [arch=amd64] http://dl.google.com/linux/chrome/deb/ stable main" >> /etc/apt/sources.list.d/google.list' \
    && apt-get update \
    && apt-get install -y google-chrome-stable libxss1 \
      --no-install-recommends \
    && rm -rf /var/lib/apt/lists/*

ENV PUPPETEER_SKIP_CHROMIUM_DOWNLOAD true

RUN groupadd -r pptruser && useradd -r -g pptruser -G audio,video pptruser \
    && mkdir -p /home/pptruser/Downloads \
    && chown -R pptruser:pptruser /home/pptruser \
    && chown -R pptruser:pptruser /node_modules

WORKDIR /usr/src/app
COPY package*.json ./

COPY start.sh ./
COPY public ./
RUN chmod 555 start.sh

RUN rm -rf /usr/src/app/node_modules
RUN echo "127.0.0.1 sgmurmurs-admin.ctf.sg" >> /etc/hosts

COPY . .
RUN npm install

EXPOSE 8080

# Run everything after as non-privileged user.
USER pptruser

CMD [ "/bin/bash", "start.sh" ]