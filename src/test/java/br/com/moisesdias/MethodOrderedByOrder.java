package br.com.moisesdias;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodOrderedByOrder {

    StringBuilder actualValue = new StringBuilder("");

    @AfterEach
    void afterEach() {
        System.out.println("The Actual value is : " + actualValue);
    }

    @Test
    @Order(0)
    void testC() {
        System.out.println("Running Test C");
        actualValue.append("1");
    }

    @Test
    @Order(1)
    void testD() {
        System.out.println("Running Test D");
        actualValue.append("2");
    }

    @Test
    @Order(2)
    void testA() {
        System.out.println("Running Test A");
        actualValue.append("3");
    }

    @Test
    @Order(3)
    void testB() {
        System.out.println("Running Test B");
        actualValue.append("4");
    }

}
