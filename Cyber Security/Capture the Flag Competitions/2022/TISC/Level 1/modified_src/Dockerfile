FROM python:3.10.0-slim-bullseye as base

ENV PYTHONFAULTHANDLER=1 \
    PYTHONHASHSEED=random \
    PYTHONUNBUFFERED=1

WORKDIR /app


FROM base as builder

ENV PIP_DEFAULT_TIMEOUT=100 \
    PIP_DISABLE_PIP_VERSION_CHECK=1 \
    PIP_NO_CACHE_DIR=1 \
    POETRY_VERSION=1.1.13

RUN pip install --upgrade pip
RUN pip install "poetry==$POETRY_VERSION"
RUN python -m venv /venv

COPY pyproject.toml poetry.lock ./
RUN poetry export -f requirements.txt | /venv/bin/pip install -r /dev/stdin


FROM base as deploy

EXPOSE 8000

ENV PATH="/venv/bin:${PATH}"
ENV VIRTUAL_ENV="/venv"

RUN apt-get update
RUN apt-get install -y socat

COPY --from=builder /venv /venv
COPY flag.txt /
COPY . /app

RUN rm /app/flag.txt

RUN adduser -u 5678 --disabled-password --gecos "" appuser && chown -R appuser /app

RUN chown root:appuser /flag.txt
RUN chmod 440 /flag.txt

CMD socat tcp-l:1337,reuseaddr,fork EXEC:"/venv/bin/python /app/run_server.py"

USER appuser

EXPOSE 1337
