package by.itacademy.kleschenkonataliya.pair;

public class Pair {
    private final int consonant;
    private final int vowel;

    public Pair(final int consonant, final int vowel) {
        this.consonant = consonant;
        this.vowel = vowel;
    }

    public int getConsonant() {
        return consonant;
    }

    public int getVowel() {
        return vowel;
    }

    @Override
    public String toString() {
        return "consonant = " + consonant +
                ", vowel = " + vowel;
    }
}
