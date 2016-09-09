package CS3213;

import java.util.HashSet;

/**
 * Created by junchao on 8/23/2014.
 */
public class WordsRequired {
    private HashSet<String> _wordsRequired;
    private static WordsRequired _instatnce;
    private WordsRequired() {
        this._wordsRequired = new HashSet<String>();
    }

    public static WordsRequired getWordsRequired() {
        if (_instatnce == null) {
            _instatnce = new WordsRequired();
        }

        return _instatnce;
    }

    public void addWordRequired(String word) {
        assert(word != null);
        this._wordsRequired.add(word);
    }

    public void removeWordRequired(String word) {
        assert(word != null);
        this._wordsRequired.remove(word);
    }

    public boolean isWordRequired(String word) {
        assert(word != null);
        return this._wordsRequired.contains(word);
    }
}
