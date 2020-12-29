package org.inframincer.controller

import org.inframincer.model.Device
import org.inframincer.service.DeviceService
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/devices")
class DeviceController(
    private val deviceService: DeviceService
) {
    @RequestMapping("/")
    fun find(): Flux<Device> {
        return deviceService.find()
    }

    @RequestMapping("/{id}")
    fun findById(@PathVariable(value = "id") id: String): Mono<Device> {
        return deviceService.findById(id)
    }

    @RequestMapping("/save")
    fun save(@RequestBody params: DeviceRequestParams): Mono<Device> {
        return deviceService.save(params.name)
    }

    @RequestMapping("/{id}/edit")
    fun edit(
        @PathVariable(value = "id") id: String,
        @RequestBody params: DeviceRequestParams
    ): Mono<Device> {
        return deviceService.edit(id, params.name)
    }
}

data class DeviceRequestParams(
    val name: String
)
