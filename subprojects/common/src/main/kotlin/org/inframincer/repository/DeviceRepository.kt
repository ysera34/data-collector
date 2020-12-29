package org.inframincer.repository

import org.inframincer.model.Device
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.data.rest.core.annotation.RepositoryRestResource

@RepositoryRestResource(collectionResourceRel = "devices", path = "devices")
interface DeviceRepository : ReactiveMongoRepository<Device, String>
