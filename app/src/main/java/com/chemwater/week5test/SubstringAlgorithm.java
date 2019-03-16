package com.chemwater.week5test;

public class SubstringAlgorithm {

    public static void main(String[] args) {
        displayCombinations(0,"dog", new StringBuilder());
    }


    private static void displayCombinations(int stringIndex, String input, StringBuilder output)
    {
        for (int b = stringIndex; b < input.length(); b++)
        {
            output.append(input.charAt(b));
            System.out.println(output);
            displayCombinations(b + 1, input, output);
            output.deleteCharAt(output.length() - 1);
        }
    }

}


/*

2. Say you have a string of characters.
    Write an algorithm to collect and return a list of all substrings
    such that order is maintained but characters may be skipped.
    So “frog” can produce fog, fg, rg, etc.

 */