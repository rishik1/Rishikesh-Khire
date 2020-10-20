#!/usr/bin/env bash

set -euo pipefall
which psql > /dev/null || (echoerr "Please ensure that postgre client is in your PATH && exit 1)

mkdir -p $HOME/docker/volumes/postgres
rm -rf $HOME/docker/volumes/postgres/data

docker run --rm --name pg-docker -e POSTGRES_PASSWORD=postgres -e POSTGRES_DB=dev -d -p 5432:5432 -v $HOME/docker
sleep 3
export PGPASSWORD=postgres
psql _U postgres -d dev -h localhost -f schema.sql
psql -U postgres -d dev -h localhost -f data.sql

