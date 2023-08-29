package com.prueba.unit.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BasicControllerTest {
    @Test
    public void StubTest() {
        var stubVariable = 1;
        var stubExpected = 2;
        assertEquals(stubExpected, stubVariable);
    }
}
