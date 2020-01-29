package com.bhs.damda.damda.domain

import org.springframework.data.jpa.repository.JpaRepository

interface RoomRepository : JpaRepository<Room, String> {

}