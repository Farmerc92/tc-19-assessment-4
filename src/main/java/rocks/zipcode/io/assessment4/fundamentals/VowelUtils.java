package rocks.zipcode.io.assessment4.fundamentals;

import java.util.regex.Pattern;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'a'||c=='A'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u')
                return true;
        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'a'||c=='A'||c=='E'||c=='e'||c=='I'||c=='i'||c=='O'||c=='o'||c=='U'||c=='u')
                return i;
        }
        return -1;
    }


    public static Boolean startsWithVowel(String word) {
        if (getIndexOfFirstVowel(word) == 0)
            return true;
        return false;
    }

    public static Boolean isVowel(Character character) {
        return Pattern.matches("[aeiouAEIOU]", character.toString());
    }
}
