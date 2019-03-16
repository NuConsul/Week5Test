package com.chemwater.week5test;

public class SubstringAlgorithm {

    public static void main(String[] args) {
        displayCombinations(0,"dog", new StringBuilder());
    }

    //Multiple combination algorithm
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