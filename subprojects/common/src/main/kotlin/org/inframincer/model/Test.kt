package org.inframincer.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "test")
data class Test(
    @Id
    val id: String? = null,
    val title: String,
    val description: String
)
