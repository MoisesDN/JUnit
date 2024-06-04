package br.com.moisesdias.math;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArraysCompareTest {

    @DisplayName("Compare ArrayList")
    @Test
    void test() {

        //Given / Arrange

        int[] numbers = {25, 8, 21, 32, 3};
        int[] expectedArray = {3, 8, 21, 25, 32};
        Arrays.sort(numbers);
        //When / Act

        assertArrayEquals(numbers, expectedArray);
        //Then / Assert

    }


    @Test
    //@Timeout(1)
    @Timeout(value = 15, unit = TimeUnit.MILLISECONDS)
    void testSortPerformance() {

        int[] numbers = {25, 8, 21, 32, 3};

        for (int i = 0; i < 100000; i++) {
            numbers[0] = i;
            Arrays.sort(numbers);
        }



    }
}