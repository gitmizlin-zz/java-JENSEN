package com.fardium.intro;

/**
 * Created by mizuho on 2017-01-26.
 */
public class WebTextSource implements TextSource {
    @Override
    public String getText() {
        return "From web";
    }
}
