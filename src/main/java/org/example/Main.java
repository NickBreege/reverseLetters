package org.example;

import org.example.service.ReverseService;

public class Main {
    public static void main(String[] args) {
        String str = "J@va the be$t!123";

        ReverseService reverseService = new ReverseService();

        System.out.println(reverseService.reverseString(str));
    }
}