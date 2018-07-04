package com.learn.Concepts.AUTOWIRING_BY_CONSTRUCTOR;

/**
 * @author vdokku
 */
public class TextEditor {

    private SpellChecker spellChecker;
    private String name;

    public TextEditor()
    {
        System.out.println("will.i.am");
    }

    public TextEditor( SpellChecker spellChecker, String name ) {
        this.spellChecker = spellChecker;
        this.name = name;
    }
    public SpellChecker getSpellChecker() {
        return spellChecker;
    }
    public String getName() {
        return name;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
