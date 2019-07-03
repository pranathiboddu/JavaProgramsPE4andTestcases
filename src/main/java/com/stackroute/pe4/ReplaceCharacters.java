/*
Write a program to replace all d with f and all l with t in the given String
Input: daily dry
Output: faity fry
Original string: daily dry
New String: faity fry
 */
package com.stackroute.pe4;

public class ReplaceCharacters {

    public String replacecharacters(String string, char character1, char character2,char character3,char character4)//intialized string and characters
    {
        if(string.length()!=0)
        {
            String string1=string.toLowerCase().replaceAll(String.valueOf(character1),String.valueOf(character2));//replaced character1 with character2
            string1=string1.toLowerCase().replaceAll(String.valueOf(character3),String.valueOf(character4));//replaced character3 with character4
            return string1;
        }
        else
        {
            return "error";
        }
    }
}