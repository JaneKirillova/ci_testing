package org.example

import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {

    @Test
    fun `greet returns hello message with given name`() {
        assertEquals("Helloagain, Kotlin!", greet("Kotlin"))
    }

    @Test
    fun `greet handles empty name`() {
        assertEquals("Helloain, !", greet(""))
    }
}
