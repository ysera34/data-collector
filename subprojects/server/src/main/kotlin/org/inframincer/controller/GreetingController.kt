package org.inframincer.controller

import org.inframincer.service.GreetingService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class GreetingController(
    private val greetingService: GreetingService
) {
    @RequestMapping("/greet")
    fun greet(): String {
        return greetingService.greet()
    }
}
