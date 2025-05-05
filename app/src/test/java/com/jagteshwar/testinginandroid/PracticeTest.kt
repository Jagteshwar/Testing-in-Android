package com.jagteshwar.testinginandroid

import com.androiddevs.unittesthomework.Practice
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class PracticeTest {

    @Test
    fun `when the nth number is 0 returns 0`(){
        val result = Practice.fib(
            n = 0
        )

        assertThat(result).isEqualTo(0)
    }

    @Test
    fun `when the nth number is 1 returns 1`(){
        val result = Practice.fib(
            n = 1
        )

        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `when the nth number is grater than 1  returns (n-1) + (n-2)`(){
        val result = Practice.fib(n = 13)

        assertThat(result).isEqualTo(233)
    }


    @Test
    fun `braces are set incorrectly returns false`(){
        val result = Practice.checkBraces(
            string = "(a * b))"
        )

        assertThat(result).isFalse()
    }
}