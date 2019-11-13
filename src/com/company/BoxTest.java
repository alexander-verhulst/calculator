package com.company;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calculateVolume() {
        Box boxUnderTest = new Box(3,4,2);
        double expected = 24;
        double actual = boxUnderTest.calculateVolume();
        assertEquals(expected,actual);
    }
}

//Pseudo code
//Run test with coverage: How much of your code is covered by test. Is your code trustable?
//You should constantly ensure that your code is properly covered