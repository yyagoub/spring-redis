### Table of content

* [Introduction](../../#Introduction)
* [Download and configure Redis](../../#Download-and-configure-Redis)
* [Maven dependencies](../../#Maven-dependencies)
* [Functionalities](../../#Functionalities)

## Introduction

### Redis streams implementation

create two spring services one acts as publisher and the other acts as subscriber.
TODO

### Technologies

* Java 8
* Spring boot
* Spring web **REST**
* Lombok
* Spring data Redis
* Jedis
* Maven

**NOTE:** *reference: https://frontbackend.com/spring-boot/getting-started-with-spring-data-redis*

## Download, run and configure Redis

* Please review repository: [01-download-redis](https://github.com/yyagoub/spring-redis/tree/main/01-download-redis)

## Maven dependencies

Two dependencies required in pom.xml file for Spring boot:

* spring-boot-starter-data-redis
* jedis

once added to pom.xml file spring boot will auto-configure it as data-source.

## Functionalities

