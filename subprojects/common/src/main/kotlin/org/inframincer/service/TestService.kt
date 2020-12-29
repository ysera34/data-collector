package org.inframincer.service

import org.inframincer.model.Test
import org.inframincer.repository.TestRepository
import org.springframework.stereotype.Service

@Service
class TestService(
    private val testRepository: TestRepository
) {
    fun insert(test: Test): Test {
        return testRepository.insert(test)
    }

    fun get(id: String): Test {
        val test = testRepository.findById(id)
        return test.orElse(null)
    }

    fun get(): List<Test> {
        return testRepository.findAll()
    }
}
