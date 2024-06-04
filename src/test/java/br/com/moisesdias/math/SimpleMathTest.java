package br.com.moisesdias.math;

import org.example.math.SimpleMath;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    SimpleMath math;

    @BeforeAll
    static void setup() {
        System.out.println("Running @BeforeAll method!");
    }

    @AfterAll
    static void cleanup() {
        System.out.println("Running @AfterAll method!");
    }

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
    }

    @Test
    @DisplayName("Test 6.2 + 2 = 8.2")
    void testSum_When_SixDotTwoIsAddedByTwo_ShouldReturnEigthDotTwo() {

        //Given

        double firstNumber = 6.2D;
        double secondNumber = 2D;
        double expected = 8.2D;

        //When
        Double actual = math.sum(firstNumber, secondNumber);

        //Then
        assertEquals(expected, actual, () -> firstNumber + " + " + secondNumber + " did not produce " + expected +"!");

    }

    @Test
    @DisplayName("Test 6.2 - 2 = 4.2")
    void testSubtraction() {

        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.subtraction(firstNumber, secondNumber);
        double expected = 4.2D;

        assertEquals(expected, actual, () -> firstNumber + " - " + secondNumber + " did not produce " + expected +"!");

    }

    @Test
    @DisplayName("Test 6.2 * 2 = 12.4")
    void testMultiplication() {

        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.multiplication(firstNumber, secondNumber);
        double expected = 12.4D;

        assertEquals(expected, actual, () -> firstNumber + " * " + secondNumber + " did not produce " + expected +"!");

    }

    @Test
    @DisplayName("Test 6.2 / 2 = 3.1")
    void testDivision_When_FirstNumberIsDividedBySecondNumber_ShouldReturnThreeDotOne() {

        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.division(firstNumber, secondNumber);
        double expected = 3.1D;

        assertEquals(expected, actual, () -> firstNumber + " / " + secondNumber + " did not produce " + expected +"!");

    }
    // test[System Under Test]_[Condition or State Change]_[Expected Result]
    @Test
    @DisplayName("Test Disivion by Zero")
    void testDivision_When_FirstNumberIsDividedByZero_ShouldThrowArithmtixExceeption() {

        //Given
        double firstNumber = 6.2D;
        double secondNumber = 0D;

        var expectedMessage = "Impossible to divide by zero!";

        //When & Then
        ArithmeticException actual = assertThrows(ArithmeticException.class, () -> {
            //When & Then
            math.division(firstNumber, secondNumber);
        }, () -> "Division by zero should throw an ArithmeticException");

        assertEquals(expectedMessage, actual.getMessage(),
                () -> "Unexpected exception message!");
    }

    @Test
    @DisplayName("Test (6.2 + 2) / 2 = 4.1")
    void testMean() {

        double firstNumber = 6.2D;
        double secondNumber = 2D;
        Double actual = math.mean(firstNumber, secondNumber);
        double expected = 4.1D;

        assertEquals(expected, actual, () -> "( "+ firstNumber + " + " + secondNumber +") / 2 did not produce " + expected +"!");

    }

    @Test
    @DisplayName("Test Square Root of 25 = 5")
    void testSquareRoot() {

        double firstNumber = 25D;
        Double actual = math.squareRoot(firstNumber);
        double expected = 5D;

        assertEquals(expected, actual, () -> "Square Root of " + firstNumber + " did not produce " + expected +"!");

    }


}
