package br.com.moisesdias.math;

import org.example.math.SimpleMath;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SimpleMathTestS4 {

    SimpleMath math;

    @BeforeEach
    void beforeEachMethod() {
        math = new SimpleMath();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Pelé", "Senna", "Keith Moon"})
    void testValueSource(String firstName) {
        System.out.println(firstName);
        assertNotNull(firstName);
    }

    @DisplayName("Test double sbtraction [firstNumber, secondNumber, expected]")
    @ParameterizedTest
    //@MethodSource("testDivisionInputParameters")
    //@MethodSource()
    /**
     @CsvSource({
     "6.2, 2, 3.1",
     "71, 14, 5.07",
     "18.3, 3.1, 5.90"
     })
     @CsvSource({
     "Pelé, Football",
     "Senna, F1",
     "Keith Moon, ''"
     })
     */
    @CsvFileSource(resources = "/testDivision.csv")
    void testDivision(double firstNumber, double secondNumber, double expected) {

        System.out.println("Test " + firstNumber + " / " +
                secondNumber + " = " + expected + "!");

        Double actual = math.division(firstNumber, secondNumber);

        assertEquals(expected, actual, 2D,
                () -> firstNumber + "/" + secondNumber +
                        " did not produce " + expected + "!");
    }

    //public static Stream<Arguments> testDivisionInputParameters() {
    /**
     public static Stream<Arguments> testDivision() {
     return Stream.of(
     Arguments.of(6.2D, 2D, 3.1D),
     Arguments.of(71D, 14D, 5.07D),
     Arguments.of(18.3, 3.1D, 5.90D)
     );
     }
     */
}
