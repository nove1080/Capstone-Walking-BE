package com.walking.member.api.dto

data class GetMemberDetailUseCaseResponse(
    val id: Long,
    val nickName: String,
    val profile: String,
    val certificationSubject: String,
    val status: String
)