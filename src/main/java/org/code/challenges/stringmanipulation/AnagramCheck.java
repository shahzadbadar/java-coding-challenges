package org.code.challenges.stringmanipulation;

import java.util.Arrays;

/**
 * Utility class for checking if two strings are anagrams.
 * <p>
 * An anagram of a string is another string that contains the same characters,
 * only the order of characters can be different. For example, "listen" and "silent"
 * are anagrams of each other.
 * </p>
 */
public class AnagramCheck {

    /**
     * Checks if two strings are anagrams.
     *
     * @param str1 the first string
     * @param str2 the second string
     * @return true if str1 and str2 are anagrams, false otherwise
     */
    public static boolean areAnagrams(String str1, String str2) {
        // If lengths are not equal, they cannot be anagrams
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            return false;
        }

        // Convert both strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort the arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if sorted arrays are equal
        return Arrays.equals(charArray1, charArray2);
    }
}
