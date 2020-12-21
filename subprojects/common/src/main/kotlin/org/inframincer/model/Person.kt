package org.inframincer.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "person")
data class Person(
    @Id val id: String? = null,
    val firstName: String,
    val lastName: String
)
