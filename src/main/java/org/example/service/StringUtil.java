package org.example.service;

public class StringUtil {

    public String reverseLetters(String str) {

        if (str == null || str.isBlank()) {
            throw new IllegalArgumentException("Input cannot be null or empty");
        }

        char[] charArray = str.toCharArray();

        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            if (!Character.isLetter(charArray[left])) {
                left++;
                continue;
            }

            if (!Character.isLetter(charArray[right])) {
                right--;
                continue;
            }

            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }

        return new String(charArray);
    }
}
