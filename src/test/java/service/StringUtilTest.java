package service;


import org.example.service.StringUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class StringUtilTest {
    private final StringUtil stringUtil = new StringUtil();

    @Test
    @DisplayName("Выбрасывается исключение, если строка состоит из пробелов")
    public void reverseLetters_shouldThrowIllegalArgumentException_whenInputIsBlank() {
        String input = "  ";
        assertThrows(IllegalArgumentException.class, () -> stringUtil.reverseLetters(input));
    }

    @Test
    @DisplayName("Выбрасывается исключение, если строка null")
    public void reverseLetters_shouldThrowIllegalArgumentException_whenInputIsNull() {
        String input = null;
        assertThrows(IllegalArgumentException.class, () -> stringUtil.reverseLetters(input));
    }

    @Test
    @DisplayName("Выбрасывается исключение, если строка пустая")
    public void reverseLetters_shouldThrowIllegalArgumentException_whenInputIsEmpty() {
        String input = "";
        assertThrows(IllegalArgumentException.class, () -> stringUtil.reverseLetters(input));
    }

    @Test
    @DisplayName("Строка без букв не изменяется")
    public void reverseLetters_shouldReturnSame_whenNoLetters() {
        String input = "456@$!123";
        assertEquals(input, stringUtil.reverseLetters(input));
    }

    @Test
    @DisplayName("Строка состоящая из одной буквы не изменяется")
    public void reverseLetters_shouldReturnSame_whenSingleLetter() {
        String input = "b";
        assertEquals(input, stringUtil.reverseLetters(input));
    }

    @Test
    @DisplayName("Строка состоящая из одного символа не меняется")
    public void reverseLetters_shouldReturnSame_whenSingleSymbol() {
        String input = "%";
        assertEquals(input, stringUtil.reverseLetters(input));
    }

    @Test
    @DisplayName("Строка состоящая только из букв меняется корректно")
    public void reverseLetters_shouldReverseAllLetters() {
        String input = "abcdef";
        String expected = "fedcba";
        assertEquals(expected, stringUtil.reverseLetters(input));
    }

    @Test
    @DisplayName("Успешный сценарий реверса букв, а символы с цифрами на месте")
    public void reverseLetters_shouldReverseOnlyLetters() {
        String input = "ab-1Def#Hi-2j";
        String expected = "ji-1Hfe#Db-2a";
        assertEquals(expected, stringUtil.reverseLetters(input));
    }


}
