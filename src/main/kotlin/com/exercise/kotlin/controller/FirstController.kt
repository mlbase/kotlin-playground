package com.exercise.kotlin.controller

import com.exercise.kotlin.dto.FirstDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class FirstController {

    @GetMapping("/")
    fun getFirst(@RequestBody dto: FirstDto.FirstRequest): FirstDto.FirstResponse {
        return FirstDto.FirstResponse("test")
    }
}