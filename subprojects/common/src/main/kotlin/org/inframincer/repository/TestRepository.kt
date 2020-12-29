package org.inframincer.repository

import org.inframincer.model.Test
import org.springframework.data.mongodb.repository.MongoRepository

interface TestRepository : MongoRepository<Test, String>
