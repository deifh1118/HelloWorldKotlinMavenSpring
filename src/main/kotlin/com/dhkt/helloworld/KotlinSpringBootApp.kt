package com.dhkt.helloworld

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration

@SpringBootApplication(
        scanBasePackages = ["com.dhkt.helloworld"],
        exclude = [SecurityAutoConfiguration::class]
)
class KotlinSpringBootApp

fun main(args: Array<String>) {
    SpringApplication.run(KotlinSpringBootApp::class.java, *args)
}
