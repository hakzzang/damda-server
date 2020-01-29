package com.bhs.damda.damda

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Configuration

@Configuration
@SpringBootApplication
@EnableAutoConfiguration
class Application

fun main(args: Array<String>) {
	runApplication<Application>(*args)
}
