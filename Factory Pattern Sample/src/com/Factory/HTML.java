package com.Factory;

import javax.swing.text.html.HTMLDocument;

public class HTML implements Button {
    @Override
    public void render() {
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("HTML Button Is Clicked");
    }
}
