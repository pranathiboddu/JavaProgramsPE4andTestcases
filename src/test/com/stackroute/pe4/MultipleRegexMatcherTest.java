package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultipleRegexMatcherTest {
    static MultipleRegexMatcher multipleRegexMatcher=new MultipleRegexMatcher();
    @BeforeClass
    public static void setUp() {

    }

    @AfterClass
    public static void tearDown() {
        multipleRegexMatcher= null;
    }

    @Test
    public void givenStringShouldSearchAndReturnPositionForParticluarWord() {
        //arrange
        MultipleRegexMatcher multipleRegexMatcher=new MultipleRegexMatcher();
        //Act
        String result = multipleRegexMatcher.multipleRegexMatcher("She sells seashells by the seashore","se");
        //Assert
        assertEquals("4-6 10-12 27-29", result);
    }
    @Test
    public void givenStringShouldSearchAndReturnErrorForParticluarWord() {
        //arrange
        MultipleRegexMatcher multipleRegexMatcher=new MultipleRegexMatcher();
        //Act
        String result = multipleRegexMatcher.multipleRegexMatcher("She sells seashells by the seashore","ee");
        //Assert
        assertEquals("error", result);
    }
    @Test
    public void givenEmptyStringShouldSearchAndReturnError() {
        //arrange
        MultipleRegexMatcher multipleRegexMatcher=new MultipleRegexMatcher();
        //Act
        String result = multipleRegexMatcher.multipleRegexMatcher("","ee");
        //Assert
        assertNotEquals("", result);
    }

}