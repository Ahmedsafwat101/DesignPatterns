package com.company;

import com.Factory.DialogFactory;

public class Main {

    public static void main(String[] args) {
        /**Calling the factory**/
        DialogFactory factory = new DialogFactory();
        /**Create HTML Button from DialogFactory that will return Button class **/
        factory.createButton("HTML").render();
        /**Create HTML Button from DialogFactory that will return Button class **/
        factory.createButton("Windows").render();
    }
}
