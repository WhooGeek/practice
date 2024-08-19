package com.whoo.chap20.queue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

/* 트럭 - 백준 (13335) */
public class Practice2Tests {

    private Practice2 practice2;

    @BeforeEach
    public void setUp() {
        practice2 = new Practice2();
    }

    public static Stream<Arguments> provideTestCases() {
        return Stream.of(
                arguments(2, 10, new Integer[]{7, 4, 5, 6}, 8),
                arguments(100, 100, new Integer[]{10}, 101)
        );
    }

    @DisplayName("트럭 테스트")
    @ParameterizedTest
    @MethodSource("provideTestCases")
    public void testSolution(int w, int l, Integer[] truckWeight, int expected) {
        int result = practice2.solution(w, l, truckWeight);
        Assertions.assertEquals(expected, result);
    }
}