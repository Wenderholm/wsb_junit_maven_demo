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
    @Test
    void getLastLetter_returns_last_letter(){
        String s = stringUtils.getLastLetter("Java");
        assertEquals(s, "a");
    }
    @Test
    void getLastLetter_returns_empty_string_when_given_empty_string(){
        String s = stringUtils.getLastLetter("");
        assertEquals(s, "");
    }
    @Test
    void getLastLetter_returns_empty_string_when_given_null(){
        String s = stringUtils.getLastLetter(null);
        assertEquals(s, "");
    }
}