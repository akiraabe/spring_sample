# このプロジェクトについて

このプロジェクトは、Kindle書籍「Spring解体新書」にもとづいた実装です。

## SpringBootのDockerImage作成方法

~~Spring2.3からは、Mavenコマンドにより、DockerImageを生成出来ます。~~
<br/>
~~その方法について下記します。~~
<br/>
細かい制御が出来ないので、Dockerfileから普通に作ることにしました。

```shell script
$ ### mvn spring-boot:build-image
$ docker build -t arch-test/spring-sample .
```

## Dockerコンテナ実行

```shell script
$ docker run -it -p8888:80 arch-test/spring-sample
```

http://localhost:8888/hello

## push to DockerHub

```shell script
$ docker tag arch-test/spring-sample:latest 742014795691.dkr.ecr.ap-northeast-1.amazonaws.com/arch-test/spring-sample:latest
$ aws ecr get-login-password --region ap-northeast-1 | docker login --username AWS --password-stdin 742014795691.dkr.ecr.ap-northeast-1.amazonaws.com
$ docker push 742014795691.dkr.ecr.ap-northeast-1.amazonaws.com/arch-test/spring-sample:latest
```

## 動作確認
http://arch-sampl-1d68f2m1xbwsr-213590841.ap-northeast-1.elb.amazonaws.com/home