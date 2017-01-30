package com.fardium.intro;

public class  HelloWorld {

	String text = null;

	private TextSource textSource;

	public HelloWorld(TextSource src) {
		textSource = src;
	    text = textSource.getText();
	}

	public String getText() {
		return "Hello " + text;
	}



	public void printText() {
		System.out.print(getText());
	}

}
