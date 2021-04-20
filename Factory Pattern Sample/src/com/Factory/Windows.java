package com.Factory;

public class Windows implements Button {
    @Override
    public void render() {
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Windows Button Is Clicked");
    }
}
