package org.inframincer.service

import org.inframincer.model.Device
import org.inframincer.repository.DeviceRepository
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.time.Instant
import java.util.UUID

@Service
class DeviceService(
    private val deviceRepository: DeviceRepository
) {
    fun find(): Flux<Device> {
        return deviceRepository.findAll()
    }

    fun findById(id: String): Mono<Device> {
        return deviceRepository.findById(id)
    }

    fun save(name: String): Mono<Device> {
        val device = Device(uuid = UUID.randomUUID().toString(), name = name)
        return deviceRepository.save(device)
    }

    fun edit(id: String, name: String): Mono<Device> {
        return deviceRepository.findById(id)
            .map { deviceRepository.save(it.copy(name = name, updateAt = Instant.now())) }
            .flatMap { it }
    }
}
