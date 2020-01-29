package com.bhs.damda.damda.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class Room(
        @Id
        @GeneratedValue
        private var id: Long = 0,

        @Column(columnDefinition = "TEXT", nullable = false)
        private var title: String,

        @Column(columnDefinition = "TEXT", nullable = false)
        private var content: String,

        private var people: Int = 0,

        private var picture: String = "",

        private val userIdList: MutableList<String> = arrayListOf(),

        private val studiedUserIdList: MutableList<String> = arrayListOf(),

        private var todayTotalStudyTime:Int = 0
) {
    fun joinUser(userId: String) {
        userIdList.add(userId)
        people++
    }

    fun exitUser(userId: String) {
        userIdList.remove(userId)
        people--
    }
}