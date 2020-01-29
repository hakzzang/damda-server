package com.bhs.damda.damda.domain

data class RoomSaveRequestDto(val title:String, val content:String){
    fun toEntity() : Room{
        return Room(title = title, content = content)
    }
}