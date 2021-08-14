package com.epam.task;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class StringUtilsTest {

    @Test
    public void isPositiveNumberShouldReturnTrue() {
        String testNumber = "21.0";
        boolean expected = StringUtils.isPositiveNumber(testNumber);
        Assertions.assertTrue(expected);
    }
}
