package com.challenge.stock

import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class MainTest {
    @Test
    fun `it should greet successfully`() {
        val expectedGreet = "Welcome to kotlin skeleton!!!"
        assertEquals(expectedGreet, Codelyber().greet())
    }
}
