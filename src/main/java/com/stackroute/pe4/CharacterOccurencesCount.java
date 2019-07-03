/*
Write a java program to count the total number of occurrences of a given character in a string
without using any loop?
For Example- Java is java again java again count number of occurrence of a in the given string
 */
package com.stackroute.pe4;

public class CharacterOccurencesCount {
    public int charactercount(String string,char character)//intialized String and charcter (to count occurrences of character in String)
    {

        int originallength=string.length(); //finding length of original string
        if(originallength!=0) {
            String str = string.toLowerCase().replaceAll(String.valueOf(character), ""); //replacing the character with  empty string
            int length = str.length();  // finding the length after replacing
            int count = originallength - length;
            return count; // returning count which is number of occurrences of character
        }
        else
        {
            return 0;
        }
    }
}
