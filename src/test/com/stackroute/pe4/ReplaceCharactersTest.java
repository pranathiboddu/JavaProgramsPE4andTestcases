package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharactersTest {

    static ReplaceCharacters replaceCharacters=new ReplaceCharacters();
    @BeforeClass
    public static void setUp() {

    }

    @AfterClass
    public static void tearDown() {
        replaceCharacters = null;
    }

    @Test
    public void givenStringShouldReplaceWithGivenCharactersAndReturntheString() {
        //arrange
         ReplaceCharacters replaceCharacters=new ReplaceCharacters();
        //Act
        String result = replaceCharacters.replacecharacters("daily dry",'d','f','l','t');
        //Assert
        assertEquals("faity fry", result);
    }

    @Test
    public void givenEmptyEStringShouldReturnErrorMessage() {
        //arrange
        ReplaceCharacters replaceCharacters=new ReplaceCharacters();
        //Act
        String result = replaceCharacters.replacecharacters("",'d','f','l','t');
        //Assert
        assertEquals("error", result);
    }
}