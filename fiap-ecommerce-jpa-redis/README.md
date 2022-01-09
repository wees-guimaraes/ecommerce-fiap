```shell
mvn clean package -Dmaven.test.skip=true
```

```shell
docker build -t fiap-ecommerce-jpa .
```

```shell
docker run -d -p 8080:8080 --name fiap-ecommerce-jpa fiap-ecommerce-jpa
```