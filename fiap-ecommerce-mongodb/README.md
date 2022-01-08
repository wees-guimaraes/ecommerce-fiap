gerar pacotes da aplicacao
```shell
mvn clean package -Dmaven.test.skip=true
```

subir o mongo
```shell
docker-compose -f docker-compose.yml -p fiap-ecommerce-mongodb up -d
```

gerar build do dockerfile
```shell
docker build -t fiap-mongo .
```

subir container com aplicacao e fazer binding com a porta 8080
```shell
docker run -d -p 8080:8080 --name fiap-mongo fiap-mongo
```