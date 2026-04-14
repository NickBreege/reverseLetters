package org.example;

import org.example.service.StringUtil;

public class Main {
    public static void main(String[] args) {
        String str = "J@va the be$t!123";

        StringUtil stringUtil = new StringUtil();

        System.out.println(stringUtil.reverseLetters(str));
    }
}