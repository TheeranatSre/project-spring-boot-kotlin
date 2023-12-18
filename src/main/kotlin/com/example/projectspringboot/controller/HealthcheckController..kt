package com.example.projectspringboot.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/healthcheck")
class HealthcheckController {

    @GetMapping
    fun getHealthCheck(): String {
        return "Healthcheck is OK"
    }
}
