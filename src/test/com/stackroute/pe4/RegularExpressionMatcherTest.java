package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegularExpressionMatcherTest {
   static RegularExpressionMatcher regularExpressionMatcher=new RegularExpressionMatcher();
    @BeforeClass
    public static void setUp() {

    }

    @AfterClass
    public static void tearDown() {
        regularExpressionMatcher= null;
    }

    @Test
    public void givenStringShouldSearchAndReturnTrueForParticluarWord() {
        //arrange
        RegularExpressionMatcher regularExpressionMatcher=new RegularExpressionMatcher();
        //Act
        String result = regularExpressionMatcher.regularexpressionmatcher("This is Harry","Harry");
        //Assert
        assertEquals("Is Harry here ? true", result);
    }
    @Test
    public void givenStringShouldSearchAndReturnFalseForParticluarWord() {
        //arrange
        RegularExpressionMatcher regularExpressionMatcher=new RegularExpressionMatcher();
        //Act
        String result = regularExpressionMatcher.regularexpressionmatcher("This is Harry","jerry");
        //Assert
        assertEquals("Is jerry here ? false", result);
    }
    @Test
    public void givenEmptyStringShouldReturnError() {
        //arrange
        RegularExpressionMatcher regularExpressionMatcher=new RegularExpressionMatcher();
        //Act
        String result = regularExpressionMatcher.regularexpressionmatcher("","jerry");
        //Assert
        assertEquals("error", result);
    }

}