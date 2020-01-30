package com.bhs.damda.damda.api.controller

import com.bhs.damda.damda.domain.RoomRepository
import com.bhs.damda.damda.domain.RoomSaveRequestDto
import org.springframework.web.bind.annotation.*

@RestController
class TimeTableController(val roomRepository: RoomRepository) {
    @GetMapping(value = ["/hello"])
    @ResponseBody
    fun getHello(): String {
        return "Hello"
    }

    @PostMapping("/make/room")
    fun makeRoom(@RequestBody dto: RoomSaveRequestDto) {
        roomRepository.save(dto.toEntity())
    }
}
