# test-springFeign

Spring Feign 客户端测试项目，演示如何使用 OpenFeign 进行服务间 HTTP 调用。

## 技术栈

| 技术 | 版本 | 说明 |
|------|------|------|
| Spring Boot | 3.x | 后端框架 |
| Spring Cloud OpenFeign | 4.x | HTTP 客户端 |
| Java | 25 | JDK 版本 |
| Maven | 3.x | 构建工具 |

## 项目架构

```mermaid
graph TB
    Client[Feign Client] --> Feign[OpenFeign 代理]
    Feign --> Encoder[请求编码器]
    Feign --> Decoder[响应解码器]
    Feign --> Logger[日志记录器]
    Encoder --> Target[目标服务]
    Decoder --> Target
    
    subgraph SpringBoot应用
        Client
        Feign
        Encoder
        Decoder
        Logger
    end
    
    Target --> Remote[远程服务API]
```

## 功能介绍

- **声明式 HTTP 客户端**：通过接口注解定义远程服务调用
- **负载均衡**：集成 Ribbon 实现服务负载均衡
- **降级熔断**：集成 Hystrix 实现服务降级

## 快速开始

```bash
# 编译
mvn clean compile

# 运行
mvn spring-boot:run
```

## 构建信息

```bash
mvn clean package
```
