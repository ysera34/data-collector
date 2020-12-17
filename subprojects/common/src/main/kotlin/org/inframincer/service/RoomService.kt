package org.inframincer.service

import org.inframincer.model.Room
import org.inframincer.repository.RoomRepository
import org.springframework.stereotype.Service

@Service
class RoomService(
    private val roomRepository: RoomRepository
) {
    fun getRooms(): List<Room> {
        return roomRepository.findAll()
    }

    fun getRoomById(id: String): Room? {
        val room = roomRepository.findById(id)
        return room.orElse(null)
    }

    fun getRoomByName(name: String): Room {
        return roomRepository.findByName(name)
    }
}
