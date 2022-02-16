FROM postgres:14.1
ENV POSTGRES_DB=network
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=root
COPY . /docker-entrypoint-initdb.d/
EXPOSE 5432