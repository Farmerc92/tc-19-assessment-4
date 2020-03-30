package rocks.zipcode.io.assessment4.fundamentals;

import java.util.HashSet;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder builder = new StringBuilder(str);
        builder.setCharAt(indexToCapitalize, (char) (builder.charAt(indexToCapitalize) - 32));
        return builder.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;
    }

    public static String[] getAllSubStrings(String string) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j < string.length() + 1; j++) {
                set.add(string.substring(i,j));
            }
        }
        String[] output = new String[set.size()];
        output = set.toArray(output);
        return output;
    }

    public static Integer getNumberOfSubStrings(String input){
        return getAllSubStrings(input).length;
    }
}
