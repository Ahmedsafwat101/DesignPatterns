package com.Factory;

public class DialogFactory {
    public Button createButton(String buttonType){
        if(buttonType.equalsIgnoreCase("HTML"))
            return new HTML();

        if(buttonType.equalsIgnoreCase("Windows"))
            return new Windows();

        return null;
    }
}
