package by.itacademy.kleschenkonataliya;

import by.itacademy.kleschenkonataliya.util.Util;

public class Main {
    // Найти, каких букв, гласных или согласных, больше в каждом предложении текста.

    public static void main(String[] args) {
        String str = "java. jaaava! jjjavvva? ava. helllo, world";
        Util.checkNumberOfConsonantsAndVowelsInText(str);
    }
}
// вывод на консоль:
// number of sentences per line: 5
// 1) consonant = 2, vowel = 2 --> consonants = vowels
// 2) consonant = 2, vowel = 4 --> consonants < vowels
// 3) consonant = 6, vowel = 2 --> consonants > vowels
// 4) consonant = 1, vowel = 2 --> consonants < vowels
// 5) consonant = 3, vowel = 2 --> consonants > vowels