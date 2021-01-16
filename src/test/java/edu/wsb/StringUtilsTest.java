package edu.wsb;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    private final StringUtils stringUtils = new StringUtils();
    @Test
    void getFirstLetter_given_first_letter() {
        String s = stringUtils.getFirstLetter("wsb");
        assertEquals("w", s);
    }
    @Test
    void getFirstLetter_returns_empty_string_when_given_empty_string(){
        String s = stringUtils.getFirstLetter("");
        assertEquals(s, "");
    }
    @Test
    void getFirstLetter_returns_empty_string_when_given_null(){
        String s = stringUtils.getFirstLetter(null);
        assertEquals(s, "");
    }
}