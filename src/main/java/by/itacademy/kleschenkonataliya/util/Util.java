package by.itacademy.kleschenkonataliya.util;

import by.itacademy.kleschenkonataliya.pair.Pair;

import java.util.ArrayList;

public class Util {
    static final char[] VOWELS_IN_ENGLISH = {'a', 'o', 'i', 'u', 'e'};
    static final char[] CONSONANTS_IN_ENGLISH = {'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 's', 't', 'v', 'x', 'x', 'y'};

    public static int countVowels(String str) {
        char[] arrayOfChars = getArrayOfChars(str);
        int counterOfVowels = 0;
        for (char vow : VOWELS_IN_ENGLISH) {
            for (char ch : arrayOfChars)
                if (vow == ch)
                    counterOfVowels++;
        }
        return counterOfVowels;
    }

    public static int countConsonants(String str) {
        char[] arrayOfChars = getArrayOfChars(str);
        int counterOfConsonant = 0;
        for (char vow : CONSONANTS_IN_ENGLISH) {
            for (char ch : arrayOfChars)
                if (vow == ch)
                    counterOfConsonant++;
        }
        return counterOfConsonant;
    }

    private static char[] getArrayOfChars(String str) {
        return str.toLowerCase().toCharArray();
    }

    private static ArrayList<Pair> getNumberOfVowelsAndConsonants(String str) {
        ArrayList<Pair> pairOfConsonantAndVowels = new ArrayList<>();
        int consonants;
        int vowels;
        String[] arrayOfString = str.split("[.!?]+");
        for (String s : arrayOfString) {
            consonants = countConsonants(s);
            vowels = countVowels(s);
            pairOfConsonantAndVowels.add(new Pair(consonants, vowels));
        }
        return pairOfConsonantAndVowels;
    }

    public static void check(String str) {
        int count = 0;
        final ArrayList<Pair> numberOfVowelsAndConsonants = getNumberOfVowelsAndConsonants(str);
        printData(str, numberOfVowelsAndConsonants);
        for (final Pair pair : numberOfVowelsAndConsonants) {
            count++;
            if (pair.getConsonant() > pair.getVowel()) {
                System.out.println(count + ") " + pair + " --> consonants > vowels");
            } else if (pair.getConsonant() < pair.getVowel()) {
                System.out.println(count + ") " + pair + " --> consonants < vowels");
            } else System.out.println(count + ") " + pair + " --> consonants = vowels");
        }
    }

    private static void printData(String str, ArrayList<Pair> numberOfVowelsAndConsonants) {
        System.out.println(str + "\nnumber of sentences per line: " + numberOfVowelsAndConsonants.size());
    }
}

