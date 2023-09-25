package hu.obuda.devops.fibonaccirestapi.service

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class FibonacciServiceTest {

    private val underTest = FibonacciService()
    @Test
    fun shouldReturn0WhenCall1() {
        // given

        // when
        val result: Int = underTest.fibonacci(1)
        // then
        Assertions.assertEquals(1, result)
    }

    // TODO - Test with greater numbers and test edge cases
    @Test
    fun testFibonacci() {
        // Test cases and their expected results
        val testCases = arrayOf(
                Pair(0, 0),
                Pair(1, 1),
                Pair(2, 1),
                Pair(3, 2),
                Pair(4, 3),
                Pair(5, 5),
                Pair(6, 8),
                Pair(7, 13),
                Pair(8, 21)
        )

        for ((n, expected) in testCases) {
            val result = underTest.fibonacci(n)
            assertEquals(expected, result)
        }
    }
}