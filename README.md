# 基石(rock)

## 前言

`rock`项目学习现阶段流行技术栈，打造大型前后端分离项目。

## 项目介绍

`rock`项目是基于`mall`[链接](https://github.com/macrozheng/mall)一套电商系统，包括前台商城系统及后台管理系统，基于SpringBoot+MyBatis实现，采用Docker容器化部署。前台商城系统包含首页门户、商品推荐、商品搜索、商品展示、购物车、订单流程、会员中心、客户服务、帮助中心等模块。后台管理系统包含商品管理、订单管理、会员管理、促销管理、运营管理、内容管理、统计报表、财务管理、权限管理、设置等模块。

### 项目演示

#### 后台管理系统

前端项目`rock-web`地址：https://github.com/dlxqlig/rock-web

项目演示地址:敬请期待

#### 前台商城系统

前端项目`rock-uniapp`地址：https://github.com/dlxqlig/rock-uniapp

项目演示地址：:敬请期待

![前台管理系统功能演示.gif](/document/images/rock-demo.gif)
![前台app功能演示.gif](/document/images/rock-app-demo.gif)

### 组织结构

``` lua
rock
├── rock-common -- 工具类及通用代码
├── rock-mbg -- MyBatisGenerator生成的数据库操作代码
├── rock-security -- SpringSecurity封装公用模块
├── rock-admin -- 后台商城管理系统接口
├── rock-portal -- 前台商城系统接口
```

### 技术选型

#### 后端技术

| 技术                 | 说明                | 官网                                                         |
| -------------------- | ------------------- | ------------------------------------------------------------ |
| SpringBoot           | 容器+MVC框架        | [https://spring.io/projects/spring-boot](https://spring.io/projects/spring-boot) |
| SpringSecurity       | 认证和授权框架      | [https://spring.io/projects/spring-security](https://spring.io/projects/spring-security) |
| MyBatis              | ORM框架             | [http://www.mybatis.org/mybatis-3/zh/index.html](http://www.mybatis.org/mybatis-3/zh/index.html) |
| MyBatisGenerator     | 数据层代码生成      | [http://www.mybatis.org/generator/index.html](http://www.mybatis.org/generator/index.html) |
| PageHelper           | MyBatis物理分页插件 | [http://git.oschina.net/free/Mybatis_PageHelper](http://git.oschina.net/free/Mybatis_PageHelper) |
| Swagger-UI           | 文档生产工具        | [https://github.com/swagger-api/swagger-ui](https://github.com/swagger-api/swagger-ui) |
| Hibernator-Validator | 验证框架            | [http://hibernate.org/validator/](http://hibernate.org/validator/) |
| Elasticsearch        | 搜索引擎            | [https://github.com/elastic/elasticsearch](https://github.com/elastic/elasticsearch) |
| RabbitMq             | 消息队列            | [https://www.rabbitmq.com/](https://www.rabbitmq.com/)       |
| Redis                | 分布式缓存          | [https://redis.io/](https://redis.io/)                       |
| MongoDb              | NoSql数据库         | [https://www.mongodb.com/](https://www.mongodb.com/)         |
| Docker               | 应用容器引擎        | [https://www.docker.com/](https://www.docker.com/)           |
| Druid                | 数据库连接池        | [https://github.com/alibaba/druid](https://github.com/alibaba/druid) |
| OSS                  | 对象存储            | [https://github.com/aliyun/aliyun-oss-java-sdk](https://github.com/aliyun/aliyun-oss-java-sdk) |
| JWT                  | JWT登录支持         | [https://github.com/jwtk/jjwt](https://github.com/jwtk/jjwt) |
| LogStash             | 日志收集工具        | [https://github.com/logstash/logstash-logback-encoder](https://github.com/logstash/logstash-logback-encoder) |
| Lombok               | 简化对象封装工具    | [https://github.com/rzwitserloot/lombok](https://github.com/rzwitserloot/lombok) |

#### 前端技术

| 技术       | 说明                  | 官网                                                         |
| ---------- | --------------------- | ------------------------------------------------------------ |
| Vue        | 前端框架              | [https://vuejs.org/](https://vuejs.org/)                     |
| Vue-router | 路由框架              | [https://router.vuejs.org/](https://router.vuejs.org/)       |
| Vuex       | 全局状态管理框架      | [https://vuex.vuejs.org/](https://vuex.vuejs.org/)           |
| Element    | 前端UI框架            | [https://element.eleme.io/](https://element.eleme.io/)       |
| Axios      | 前端HTTP框架          | [https://github.com/axios/axios](https://github.com/axios/axios) |
| v-charts   | 基于Echarts的图表框架 | [https://v-charts.js.org/](https://v-charts.js.org/)         |
| Js-cookie  | cookie管理工具        | [https://github.com/js-cookie/js-cookie](https://github.com/js-cookie/js-cookie) |
| nprogress  | 进度条控件            | [https://github.com/rstacruz/nprogress](https://github.com/rstacruz/nprogress) |

#### 开发进度

- [ ] 支付后台（微信和支付宝）。
- [ ] 基于Spring Cloud重构。
- [ ] 缓存和分库分表。
- [ ] 功能重构。
- [ ] 测试case。

## 环境搭建

### 开发工具

| 工具          | 说明                | 官网                                            |
| ------------- | ------------------- | ----------------------------------------------- |
| IDEA          | 开发IDE             | https://www.jetbrains.com/idea/download         |
| RedisDesktop  | redis客户端连接工具 | https://redisdesktop.com/download               |
| Robomongo     | mongo客户端连接工具 | https://robomongo.org/download                  |
| SwitchHosts   | 本地host管理        | https://oldj.github.io/SwitchHosts/             |
| MySql WorkBench | mysql客户端 | |

### 开发环境

| 工具          | 版本号 | 下载                                                         |
| ------------- | ------ | ------------------------------------------------------------ |
| JDK           | 1.8    | https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html |
| Mysql         | 5.7    | https://www.mysql.com/                                       |
| Redis         | 3.2    | https://redis.io/download                                    |
| MongoDb       | 3.2    | https://www.mongodb.com/download-center                      |
| RabbitMq      | 3.7.14 | http://www.rabbitmq.com/download.html                        |


### 搭建步骤

- 安装和配置mysql/redis/mongodb
- 导入sql/rock.sql到数据中
- 克隆代码，导入idea, 修改configuration, 添加环境变量SERVER_HOST=192.168.0.107
- 运行服务器

> Docker环境部署(开发环境)

- install centos8
  - yum ali source update.
- install docker
  - sudo yum install -y yum-utils  device-mapper-persistent-data  lvm2
  - sudo yum-config-manager  --add-repo  https://download.docker.com/linux/centos/docker-ce.repo
  - sudo yum install docker-ce docker-ce-cli
  - sudo systemctl start docker
  - sudo systemctl enable docker
  - 添加用户和组
    - sudo groupadd docker
    - sudo gpasswd -a ${USER} docker
    - sudo service docker restart
    - newgrp - docker
 
- Add aliyun registry
   - 在/etc/docker/daemon.json中加入	https://cr.console.aliyun.com/
  	 - sudo systemctl daemon-reload
    - sudo systemctl restart docker
 
- Add windows route in powershell
  - systemctl stop firewalld.service
  - systemctl disable firewalld.service
 
- soft dir link
   ln -s /mnt/work/mydata /mydata
 
- mysql
  - docker pull mysql:5.7
  - docker rm mysql
  - docker run -p 3306:3306 --name mysql \
  -v /mydata/mysql/log:/var/log/mysql \
  -v /mydata/mysql/data:/var/lib/mysql \
  -v /mydata/mysql/conf/conf.d:/etc/mysql/conf.d \
  -e MYSQL_ROOT_PASSWORD=root \
  -d mysql:5.7 
  - docker exec -it mysql mysql -uroot -proot
  - create database rock character set utf8
  - grant all privileges on *.* to 'root' @'%' identified by 'root';
  -  flush privileges;
  - docker cp sql/rock.sql mysql:/
  - use rock;
  - source /rock.sql;

 
- redis安装
  - docker pull redis:3.2
  - docker run -p 6379:6379 --name redis \
  -v /mydata/redis/data:/data \
  -d redis:3.2 redis-server --appendonly yes
  docker exec -it redis redis-cli

- rabbitmq安装
   - docker pull rabbitmq:3.7.15
   - docker run -d --name rabbitmq \
   --publish 5671:5671 --publish 5672:5672 --publish 4369:4369 \
   --publish 25672:25672 --publish 15671:15671 --publish 15672:15672 \
   rabbitmq:3.7.15
 
   - docker exec -it rabbitmq /bin/bash
   - rabbitmq-plugins enable rabbitmq_management

   - 使用guest:guest登录
 
- mongodb安装
   - docker pull mongo:3.2
   docker run -p 27017:27017 --name mongo \
   -v /mydata/mongo/db:/data/db \
   -d mongo:3.2
 
 - portainer安装
   - docker run -p 9000:9000 -p 8000:8000 --name portainer \
   --restart=always \
   -v /var/run/docker.sock:/var/run/docker.sock \
   -v /mydata/portainer/data:/data \
   -d portainer/portainer


## 许可证

[Apache License 2.0](https://github.com/dlxqlig/rock/LICENSE)

Copyright (c) 2019-2020 dlxqlig
