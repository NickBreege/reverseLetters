package org.example;

import org.example.service.ReverseLetters;

public class Main {
    public static void main(String[] args) {
        String str = "J@va the be$t!123";

        ReverseLetters reverseLetters = new ReverseLetters();

        System.out.println(reverseLetters.reverseString(str));
    }
}