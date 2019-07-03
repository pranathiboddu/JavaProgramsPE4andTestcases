/*
Write a program to transpose the given string.
Input String : a quick brown fox jumps over the lazy dog
Output String: a kciuq nworb xof spmuj revo eht yzal god
 */
package com.stackroute.pe4;
import java.lang.String;


public class StringTranspose {
    public String stringtranspose(String string)//initialized string to
    {
        if (string.length() != 1) {
            String[] result = string.split(" ");//splitting the string by whitespace
            String reversedString = "";
            for (int i = 0; i < result.length; i++)//logic for reversing the words in string
            {
                String word = result[i];
                String reverseWord = "";
                for (int j = word.length() - 1; j >= 0; j--) //logic for reversing each word
                {
                    reverseWord = reverseWord + word.charAt(j);
                }
                reversedString = reversedString + reverseWord + " ";
            }
            return reversedString.trim();
        }
        else
            {
            return "error";
        }
    }
}
