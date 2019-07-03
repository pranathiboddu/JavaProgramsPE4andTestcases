package com.stackroute.pe4;

import org.junit.*;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.AfterClass;

public class CharacterOccurencesCountTest
{
    static CharacterOccurencesCount characterOccurencesCount = new CharacterOccurencesCount();

    @BeforeClass
    public static void setUp() {

    }

    @AfterClass
    public static void tearDown() {
        characterOccurencesCount = null;
    }

    @Test

    public void givenStringShouldReplaceWithGivenCharacterAndReturnTheCount(){
        //arrange
        CharacterOccurencesCount characterOccurencesCount=new CharacterOccurencesCount();
        //Act
        int result=characterOccurencesCount.characterCount("javajavajava",'a');
        //Assert
        assertEquals(6, result);
    }
    @Test

    public void givenStringShouldReplaceWithGivenCharacterAndReturnTheCountZero(){
        //arrange
        CharacterOccurencesCount characterOccurencesCount=new CharacterOccurencesCount();
        //Act
        int result=characterOccurencesCount.characterCount("",'a');
        //Assert
        assertEquals(0, result);
    }
    @Test
    public void givenStringWithCapitalsShouldReplaceWithGivenCharacterAndReturnTheCount(){
        //arrange
        CharacterOccurencesCount characterOccurencesCount=new CharacterOccurencesCount();
        //Act
        int result=characterOccurencesCount.characterCount("HELLO",'l');
        //Assert
        assertNotEquals(4, result);
    }


}