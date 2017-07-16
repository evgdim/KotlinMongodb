package com.github.evgdim.kotlinspring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinSpringApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinSpringApplication::class.java, *args)
}
