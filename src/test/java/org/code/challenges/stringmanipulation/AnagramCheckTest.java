package org.code.challenges.stringmanipulation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramCheckTest {

    @Test
    public void testAreAnagramsTrue() {
        assertTrue(AnagramCheck.areAnagrams("listen", "silent"), "Expected 'listen' and 'silent' to be anagrams");
        assertTrue(AnagramCheck.areAnagrams("triangle", "integral"), "Expected 'triangle' and 'integral' to be anagrams");
        assertTrue(AnagramCheck.areAnagrams("anagram", "nagaram"), "Expected 'anagram' and 'nagaram' to be anagrams");
    }

    @Test
    public void testAreAnagramsFalse() {
        assertFalse(AnagramCheck.areAnagrams("hello", "world"), "Expected 'hello' and 'world' not to be anagrams");
        assertFalse(AnagramCheck.areAnagrams("java", "jva"), "Expected 'java' and 'jva' not to be anagrams");
        assertFalse(AnagramCheck.areAnagrams("test", "taste"), "Expected 'test' and 'taste' not to be anagrams");
    }

    @Test
    public void testAreAnagramsDifferentLengths() {
        assertFalse(AnagramCheck.areAnagrams("abcd", "abc"), "Expected 'abcd' and 'abc' not to be anagrams due to length difference");
    }

    @Test
    public void testAreAnagramsNullInputs() {
        assertFalse(AnagramCheck.areAnagrams(null, "abc"), "Expected null and 'abc' not to be anagrams");
        assertFalse(AnagramCheck.areAnagrams("abc", null), "Expected 'abc' and null not to be anagrams");
        assertFalse(AnagramCheck.areAnagrams(null, null), "Expected two null inputs not to be anagrams");
    }
}
