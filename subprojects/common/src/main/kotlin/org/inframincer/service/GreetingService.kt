package org.inframincer.service

import org.springframework.stereotype.Service

@Service
class GreetingService {
    fun greet(): String {
        return "helle greeting"
    }
}
