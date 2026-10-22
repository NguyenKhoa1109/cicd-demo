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
        // Cố tình viết sai để CI/CD bắt lỗi
        assertEquals(10, math.add(2, 3), "Cố tình lỗi để show Report");
    }
}