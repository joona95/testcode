package com.example.testcode;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.*;

class CalculationRequestReaderTest {

    @Test
    void System_in으로_데이터를_읽어들일_수_있다() {
        //given
        CalculationRequestReader calculationRequestReader = new CalculationRequestReader();

        //when
        System.setIn(new ByteArrayInputStream("2 + 3".getBytes()));
        String[] result = calculationRequestReader.read();

        //then
        assertEquals("2", result[0]);
        assertEquals("+", result[1]);
        assertEquals("3", result[2]);
    }
}