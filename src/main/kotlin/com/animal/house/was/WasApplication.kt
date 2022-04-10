package com.animal.house.was

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@SpringBootApplication
class WasApplication

fun main(args: Array<String>) {
	runApplication<WasApplication>(*args)
}
