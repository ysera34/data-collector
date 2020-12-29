package org.inframincer.controller

import org.inframincer.model.Room
import org.inframincer.service.RoomService
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class RoomController(
    private val roomService: RoomService
) {
    @RequestMapping("/rooms")
    fun getRooms(): List<Room> {
        return roomService.getRooms()
    }

    @RequestMapping("/room/{id}")
    fun getRoomById(@PathVariable("id") id: String): Room? {
        return roomService.getRoomById(id)
    }

    @RequestMapping("/room")
    fun getRoomByName(@RequestParam(value = "name") name: String): Room {
        return roomService.getRoomByName(name)
    }
}
