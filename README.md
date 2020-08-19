# このプロジェクトについて

このプロジェクトは、Kindle書籍「Spring解体新書」にもとづいた実装です。

## SpringBootのDockerImage作成方法

Spring2.3からは、Mavenコマンドにより、DockerImageを生成出来ます。
<br/>
その方法について下記します。

```shell script
$ mvn spring-boot:build-image
```

## Dockerコンテナ実行

```shell script
$ docker run -it -p8888:8888 spring_sample:0.0.1-SNAPSHOT
```

http://localhost:8888/hello

## push to DockerHub

```shell script
$ docker tag <image_id> akiraabe/spring_sample:latest
$ docker login # we need a credential information.
$ docker push akiraabe/spring_sample:latest
```