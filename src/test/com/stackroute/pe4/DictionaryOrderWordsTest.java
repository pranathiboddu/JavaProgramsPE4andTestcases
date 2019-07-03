package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class DictionaryOrderWordsTest {

    static DictionaryOrderWords dictionaryOrderWords=new DictionaryOrderWords();
    @BeforeClass
    public static void setUp() {

    }

    @AfterClass
    public static void tearDown() {
        dictionaryOrderWords = null;
    }

    @Test
    public void givenStringShouldReturnDictionarySortOfWords() {
        //arrange
        DictionaryOrderWords dictionaryOrderWords=new DictionaryOrderWords();
        //Act
        String result = dictionaryOrderWords.dictionarysort("three two one");
        //Assert
        assertEquals("one three two", result);
    }
    @Test
    public void givenStringShouldReturnErrorForEmptyString() {
        //arrange
        DictionaryOrderWords dictionaryOrderWords=new DictionaryOrderWords();
        //Act
        String result = dictionaryOrderWords.dictionarysort("");
        //Assert
        assertEquals("error", result);
    }
    @Test
    public void givenStringShouldReturnDictionarysortforNUmbers() {
        //arrange
        DictionaryOrderWords dictionaryOrderWords=new DictionaryOrderWords();
        //Act
        String result = dictionaryOrderWords.dictionarysort("4 3 2");
        //Assert
        assertEquals("2 3 4", result);
    }


}