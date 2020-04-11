package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String string, PoemDecorator poemDecorator) {
        String text = poemDecorator.decorate(string);
         System.out.println(text);
    }
}
