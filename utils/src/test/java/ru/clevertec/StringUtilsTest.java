package ru.clevertec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber_shouldReturnTrue_whenStringIsNumberAndGreaterThanZero() {
        assertTrue(StringUtils.isPositiveNumber("1"));
        assertTrue(StringUtils.isPositiveNumber("123"));
        assertTrue(StringUtils.isPositiveNumber("1234"));
    }

    @Test
    void isPositiveNumber_shouldReturnFalse_whenStringIsNotNumber() {
        assertFalse(StringUtils.isPositiveNumber("a"));
        assertFalse(StringUtils.isPositiveNumber("abcd"));
        assertFalse(StringUtils.isPositiveNumber("#@^&$"));
    }

    @Test
    void isPositiveNumber_shouldReturnFalse_whenStringIsNumberAndLessThanZero() {
        assertFalse(StringUtils.isPositiveNumber("-1"));
        assertFalse(StringUtils.isPositiveNumber("-123"));
        assertFalse(StringUtils.isPositiveNumber("-33333"));
    }
}