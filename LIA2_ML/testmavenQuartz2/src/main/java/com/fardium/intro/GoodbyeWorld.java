package com.fardium.intro;

public class GoodbyeWorld {

    String text = null;

    private TextSource textSource;

    public GoodbyeWorld(TextSource src) {
        textSource = src;
        text = textSource.getText();
    }

    public String getText() {
        return "GOODBYE " + text;
    }



    public void printText() {
        System.out.print(getText());
    }

}
