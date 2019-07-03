/*
 Write a program to find out the multiple occurrences of the given word in a string using Matcher
methods.
Input : She sells seashells by the seashore
Given word: se
Output :
Found at: 4 - 6

Found at: 10 - 12
Found at: 27 – 29
 */
package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleRegexMatcher {
    public String multipleregexmatcher(String inputstring,String search)//initialized two string one is paragraph of words and another is to word to find positions where it is present
    {
        String outputstring="";
        if(inputstring.length()>0) {
            Pattern pattern = Pattern.compile(search); //taking search as input to find
            Matcher match = pattern.matcher(inputstring); //matches if search present in input string
            while (match.find())
            {
                outputstring = outputstring +" "+match.start() + "-" + match.end(); //finding positions from start to end
            }
            if(outputstring.length()==0)
            {
                return "error";
            }
            return outputstring.trim();

        }

        else
        {
            return "error";
        }
    }
}
