## 项目开发过程

- 查漏补缺， 确保项目无明显报错(下载`optimus-common`包，解决Aop切面fastjson包缺失问题)
- 查看项目使用技术，了解项目整体情况。
- 补全`deepexi-user-center`项目。
  - 使用mybatis + mybatis plus操作数据库。
  - 使用dubbo发布服务层，将服务信息注册到zk上。
- 搭建zookeeper(3.4.14)，修改两个项目的配置文件。
- 补全`deepexi-product-center`项目，添加执行接口功能。
- 启动项目，测试接口，修改bug。
- 进行docker部署。

# dubbo-demo

dubbo开发demo


## 开发环境

- idea
- jdk1.8+
- zookeeper
- mysql
- maven

## 项目中使用到的私有包

- [optimus-common](https://github.com/deepexi/optimus-commons)

## deepexi-user-center

该微服务下实现要求的功能


## deepexi-product-center

该微服务作为消费者，调用deepexi-user-center，实现远程调用

## docker部署

修改基本配置信息， 开始docker部署。

![1562142543950](C:\Users\xch\AppData\Roaming\Typora\typora-user-images\1562142543950.png)

e.g.

```bash
$ cd deepexi-user-center
$ ./start-code.sh
```
