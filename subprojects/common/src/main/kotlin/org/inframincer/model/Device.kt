package org.inframincer.model

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.Id
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.mongodb.core.mapping.Document
import java.time.Instant

@Document(collection = "devices")
data class Device(
    @Id val id: String? = null,
    val uuid: String,
    val name: String,
    @CreatedDate
    val createdAt: Instant = Instant.now(),
    @LastModifiedDate
    val updateAt: Instant = Instant.now()
)
