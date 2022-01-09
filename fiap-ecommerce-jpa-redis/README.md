```shell
mvn clean package -Dmaven.test.skip=true
```

```shell
docker build -t fiap-ecommerce-jpa-redis .
```

```shell
docker run -d -p 8080:8080 --name fiap-ecommerce-jpa-redis fiap-ecommerce-jpa-redis
```

```shell
docker-compose -f docker-compose.yml -p fiap-ecommerce-jpa-redis up -d
```