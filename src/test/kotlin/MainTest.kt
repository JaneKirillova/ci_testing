package org.example

import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {

    @Test
    fun `greet returns hello message with given name`() {
        assertEquals("Helo again, Kotlin!", greet("Kotlin"))
    }

    @Test
    fun `greet handles empty name`() {
        assertEquals("Hello agin, !", greet(""))
    }
}
