package com.example.projectspringboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ProjectSpringBootApplication

fun main(args: Array<String>) {
    runApplication<ProjectSpringBootApplication>(*args)
}