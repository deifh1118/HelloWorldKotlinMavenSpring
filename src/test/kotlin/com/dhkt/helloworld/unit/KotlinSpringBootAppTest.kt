
package com.dhkt.helloworld.unit

import com.dhkt.helloworld.KotlinSpringBootApp
import kotlin.test.Test
import kotlin.test.assertNotNull

class KotlinSpringBootAppTest {
    @Test fun testKotlinSpringBootApp() {
        val classUnderTest = KotlinSpringBootApp()
        assertNotNull(classUnderTest)
    }
}
