/*
Write a program with the implementation of Regular Expression to find the presence of the name
Harry in a string.
Input: This is Harry.
Output: Is Harry here ? true
Input : This is Henry.
Output: Is Harry here ? False
 */
package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionMatcher {
    public String regularexpressionmatcher(String inputstring,String search) //initialized to strings one is for input  another is to search
    {
        String outputstring="";
       if(inputstring.length()>0)
       {
           Pattern pattern=Pattern.compile(search);//taking search as input
           Matcher match=pattern.matcher(inputstring);//finding if search present in inputstring
           if(match.find())//if present it returns true else false
           {
               outputstring=outputstring+"Is " +search+ " here ? true";
           }
           else
           {
               outputstring=outputstring+"Is " +search+ " here ? false";
           }
           return outputstring.trim();
       }
    else
    {
        return "error";
    }

}
}
