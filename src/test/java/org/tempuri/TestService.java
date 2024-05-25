package org.tempuri;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

class TestService {

    CalculatorSoap calculatorSoap = new Calculator().getCalculatorSoap();


    @ParameterizedTest(name = "WebService: add operation [{index}] {0} + {1} = {2}")
    @CsvSource(value = { "1 2 3", "2 4 6", "7 8 15", "9 1 10" }, delimiter = ' ')
    void testAdd(int a, int b, int expected) {
        int i = calculatorSoap.add(a, b);
        assertEquals(i, expected);
    }


    @ParameterizedTest(name = "WebService: substract operation [{index}] {0} - {1} = {2}")
    @CsvSource(value = { "3 2 1", "6 4 2", "15 8 7" }, delimiter = ' ')
    void testSubstract(int a, int b, int expected) {
        int i = calculatorSoap.subtract(a, b);
        assertEquals(i, expected);
    }
 

    @ParameterizedTest(name = "WebService: divide operation [{index}] {0} / {1} = {2}")
    @MethodSource("divParams")
    void testDiv(int a, int b, int expected) {
        int i = calculatorSoap.divide(a, b);
        assertEquals(i, expected);
    }

    static Stream<Arguments> divParams() {
        return Stream.of(
             Arguments.arguments(4,2,2),
             Arguments.arguments(12,2,6),
             Arguments.arguments(14,2,7)
        );
    }


    /////
    @ParameterizedTest(name = "[{index}] {arguments}")
    @CsvSource(useHeadersInDisplayName = true, textBlock = """
        被乘数, 乘数, 积
        2, 5, 10
        5, 8, 40
        8, 9, 72
        """)
    void testMultiple(int a, int b, int expected) {
        assertEquals(calculatorSoap.multiply(a, b) , expected);
    }
}
