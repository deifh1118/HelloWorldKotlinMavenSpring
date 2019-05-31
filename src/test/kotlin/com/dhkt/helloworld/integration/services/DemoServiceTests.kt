package com.dhkt.helloworld.integration.services

import com.dhkt.helloworld.KotlinSpringBootApp
import com.dhkt.helloworld.constants.Constants.MESSAGE_HELLO_SERVICE
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpStatus
import org.springframework.test.context.junit4.SpringRunner
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

@RunWith(SpringRunner::class)
@SpringBootTest(
        classes = [KotlinSpringBootApp::class],
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
class DemoServiceTests {

    @Autowired
    lateinit var testRestTemplate: TestRestTemplate

    @Test
    fun whenCalled_shouldReturnHelloService() {
        val result = testRestTemplate
            .withBasicAuth("user", "pass")
                .getForEntity("/hello-service", String::class.java)

        assertNotNull(result)
        assertEquals(result?.statusCode, HttpStatus.OK)
        assertEquals(result?.body, MESSAGE_HELLO_SERVICE)
    }

}