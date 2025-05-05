package com.jagteshwar.testinginandroid

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "",
            password = "123",
            confirmedPassword = "123"
        )

        assertThat(result).isFalse()

    }

    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Jagteshwar",
            password = "123",
            confirmedPassword = "123"
        )

        assertThat(result).isTrue()

    }

    @Test
    fun `username already exist returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Jag",
            password = "123",
            confirmedPassword = "123"
        )

        assertThat(result).isFalse()

    }

    @Test
    fun `empty password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Carl",
            password = "",
            confirmedPassword = ""
        )

        assertThat(result).isFalse()

    }

    @Test
    fun `password was repeated incorrectly returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Philipp",
            password = "123",
            confirmedPassword = "132"
        )

        assertThat(result).isFalse()

    }

    @Test
    fun `password contains less than 2 digits returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            username = "Carl",
            password = "sdaf3",
            confirmedPassword = "ssdf3"
        )

        assertThat(result).isFalse()

    }
}