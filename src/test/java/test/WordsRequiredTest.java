package test;

import CS3213.WordsRequired;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordsRequiredTest {

    @Test
    public void testIsWordRequired() throws Exception {
        WordsRequired wordsRequired = WordsRequired.getWordsRequired();

        //assertFalse(wordsToIgnore.isWordIgnored("the"));

        wordsRequired.addWordRequired("test");
        //wordsToIgnore.addWordToIgnore("of");
        //wordsRequired.addWordRequired("");
        assertTrue(wordsRequired.isWordRequired("test"));
        //assertTrue(wordsToIgnore.isWordIgnored("of"));
        //assertTrue(wordsRequired.isWordRequired(""));
        //assertFalse(wordsRequired.isWordRequired("after"));
        //assertFalse(wordsToIgnore.isWordIgnored("before"));
        /*
        wordsToIgnore.addWordToIgnore("of"); // add duplicated word
        wordsToIgnore.addWordToIgnore("after");
        wordsToIgnore.removeWordToIgnore("the");
        wordsToIgnore.removeWordToIgnore("");
        assertFalse(wordsToIgnore.isWordIgnored("the"));
        assertTrue(wordsToIgnore.isWordIgnored("of"));
        assertFalse(wordsToIgnore.isWordIgnored(""));
        assertTrue(wordsToIgnore.isWordIgnored("after"));
        assertFalse(wordsToIgnore.isWordIgnored("before"));*/
    }
}
