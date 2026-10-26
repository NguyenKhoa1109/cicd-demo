package com.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilTest {
    MathUtil math = new MathUtil();

    @Test
    public void testAddSuccess() {
        assertEquals(5, math.add(2, 3), "2 + 3 phải bằng 5");
    }

    @Test
    public void testAddFail() {
        assertEquals(10, math.add(7, 3), "7 + 3 phải bằng 10");
    }
}