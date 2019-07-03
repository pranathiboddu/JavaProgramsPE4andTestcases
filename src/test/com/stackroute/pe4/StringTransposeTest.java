package com.stackroute.pe4;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringTransposeTest {

    static StringTranspose stringTranspose=new StringTranspose();
    @BeforeClass
    public static void setUp() {

    }

    @AfterClass
    public static void tearDown() {
        stringTranspose= null;
    }

    @Test
    public void givenStringShouldReturnReverseOfWords() {
        //arrange
        StringTranspose stringTranspose=new StringTranspose();
        //Act
        String result = stringTranspose.stringTranspose("a quick brown fox jumps over the lazy dog");
        //Assert
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god", result);
    }
    @Test
    public void givenNullStringShouldReturnError() {
        //arrange
        StringTranspose stringTranspose=new StringTranspose();
        //Act
        String result = stringTranspose.stringTranspose(" ");
        //Assert
        assertEquals("error", result);
    }
    @Test
    public void givenEmptyStringShouldReturnError() {
        //arrange
        StringTranspose stringTranspose=new StringTranspose();
        //Act
        String result = stringTranspose.stringTranspose("");
        //Assert
        assertNotEquals("error", result);
    }


}