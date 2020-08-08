# StartFromZero-SpringCloud

## 部署Eureka Docker集群
### 1. Eureka Server 配置
### 2. 打包Eureka Server
eureka-server.jar
### 3. Dockerfile
```
FROM openjdk:8-jre

RUN mkdir /app

COPY eureka-server.jar /app/

CMD java -jar /app/eureka-server.jar

EXPOSE 8651
```
### 4. 创建docker-compose.yml文件
```yaml
version: '3'
services:
  "01":
    restart: always
    build: .
    container_name: eureka-server-01
    hostname: eureka-server-01
    ports:
      - 8651:8651
  "02":
    restart: always
    build: .
    container_name: eureka-server-02
    hostname: eureka-server-02
    ports:
      - 8652:8651
  "03":
    restart: always
    build: .
    container_name: eureka-server-03
    hostname: eureka-server-03
    ports:
      - 8653:8651
```
### 5. 构建镜像
```$xslt
docker-compose up -d
```
## 附录
端口生成规则：`("{组件名}".hashCode() & 999) * 10 + 1`，例如eureka端口8651：`("eureka".hashCode() & 999) * 10 + 1`