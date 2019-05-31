package com.dhkt.helloworld.controllers

import com.dhkt.helloworld.constants.Constants.MESSAGE_HELLO
import com.dhkt.helloworld.constants.Constants.MESSAGE_HELLO_DTO
import com.dhkt.helloworld.dtos.DemoDto
import com.dhkt.helloworld.services.DemoService
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController(val demoService: DemoService) {

    @RequestMapping("/hello")
    fun hello(): String {
        return MESSAGE_HELLO
    }

    @RequestMapping("/hello-service")
    fun helloService(): String {
        return demoService.gethello()
    }

    @RequestMapping("/hello-dto")
    fun helloDto(): DemoDto {
        return DemoDto(MESSAGE_HELLO_DTO)
    }

}