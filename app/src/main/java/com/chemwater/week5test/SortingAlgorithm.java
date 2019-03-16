package com.chemwater.week5test;

public class SortingAlgorithm {

    public static void main(String[] args) {
        int[] randomNumbers = { 3, 7, 8, 8, 5, 6, 14, 14, 6, 19, 2, 1} ;
        mergeSortAlgorithm(randomNumbers) ;
        for(int i = 0 ; i < randomNumbers.length ; i++)
            System.out.println(randomNumbers[i] + " ") ;
    }

    private static int[] mergeTheList(int[] inputOne, int[] inputTwo) {
        int[] placeHolder = new int[inputOne.length + inputTwo.length] ;

        int first = 0, second = 0, third = 0 ;

        while(second < inputTwo.length && first < inputOne.length) {
            if(inputOne[first] < inputTwo[second])
                placeHolder[third++] = inputOne[first++] ;
            else
                placeHolder[third++] = inputTwo[second++] ;
        }

        while(first < inputOne.length)
            placeHolder[third++] = inputOne[first++] ;

        while (second < inputTwo.length)
            placeHolder[third++] = inputTwo[second++] ;

        return placeHolder ;
    }


    public static void mergeSortAlgorithm(int[] list) {
        if(list.length > 1) {
            int[] initialHalf = new int[list.length / 2] ;
            System.arraycopy(list, 0, initialHalf, 0, list.length / 2) ;
            mergeSortAlgorithm(initialHalf) ;

            int secondPartLength = list.length - list.length / 2 ;
            int[] lastPart = new int[secondPartLength] ;
            System.arraycopy(list, list.length / 2, lastPart, 0, secondPartLength) ;
            mergeSortAlgorithm(lastPart) ;

            int[] placeHolder = mergeTheList(initialHalf, lastPart) ;
            System.arraycopy(placeHolder, 0, list, 0, placeHolder.length) ;
        }
    }





}
