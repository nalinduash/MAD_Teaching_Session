package com.example.kuppi

import com.example.kuppi.s3.Calculate
import org.junit.Assert
import org.junit.Test

class CalculateTest {
    @Test
    fun it_should_add_2_and_2_and_return_4(){
        val calculator = Calculate()
        val result = calculator.add(2, 2)
        Assert.assertEquals(4, result)
    }
}