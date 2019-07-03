/*
Write a program that sets up a String variable containing a paragraph of text of your choice.
a. Extract the words from the text and sort them into alphabetical order.
b. Display the sorted list of words.
 */
package com.stackroute.pe4;
import java.lang.String;
import java.util.Arrays;

public class DictionaryOrderWords {
    public String dictionarySort(String string)//intialized string to sort
    {
        if(string.length()!=0) {
            String[] result = string.split(" "); //splitting the given string by whitespace and storing into string array
            Arrays.sort(result); //sorting the string array
            String finalresult = String.join(" ", result);//converting string array to string
            return finalresult; //returning final result
        }
        else
        {
            return "error";
        }
    }
}
