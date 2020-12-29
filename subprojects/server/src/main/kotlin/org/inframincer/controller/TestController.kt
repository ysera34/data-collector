package org.inframincer.controller

import org.inframincer.model.Test
import org.inframincer.service.TestService
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    private val testService: TestService
) {
    @RequestMapping("/tests")
    fun get(): List<Test> {
        return testService.get()
    }

    @RequestMapping("/tests/{id}")
    fun get(@PathVariable("id") id: String): Test {
        return testService.get(id)
    }

    @RequestMapping("/tests/new")
    fun insert(
        @RequestParam(value = "title") title: String,
        @RequestParam(value = "description") description: String,
    ): Test {
        return testService.insert(Test(title = title, description = description))
    }
}
