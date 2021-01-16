package edu.wsb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    private final StringUtils stringUtils = new StringUtils();
    @Test
    void getFirstLetter() {
        String s = stringUtils.getFirstLetter("wsb");
        assertEquals("w", s);
    }
}