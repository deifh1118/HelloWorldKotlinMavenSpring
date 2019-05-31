package com.dhkt.helloworld.services

import com.dhkt.helloworld.constants.Constants.MESSAGE_HELLO_SERVICE
import org.springframework.stereotype.Service

@Service
class DemoService {

    fun gethello(): String {
        return MESSAGE_HELLO_SERVICE
    }

}