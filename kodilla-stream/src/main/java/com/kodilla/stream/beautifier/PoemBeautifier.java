package com.kodilla.stream.beautifier;



public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator){
        poemDecorator.decorate(text);
    }
}
