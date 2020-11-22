package com.example.redisweb

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cache.annotation.EnableCaching

@SpringBootApplication
@EnableCaching
class RediswebApplication

fun main(args: Array<String>) {
	runApplication<RediswebApplication>(*args)
}

