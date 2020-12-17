package org.inframincer.repository

import org.inframincer.model.Room
import org.springframework.data.mongodb.repository.MongoRepository

interface RoomRepository : MongoRepository<Room, String> {
    fun findByName(name: String): Room
}
