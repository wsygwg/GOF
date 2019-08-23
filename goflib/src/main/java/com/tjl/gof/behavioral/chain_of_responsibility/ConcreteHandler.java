package com.tjl.gof.behavioral.chain_of_responsibility;


import com.tjl.gof.utils.TPrinter;

public class ConcreteHandler extends Handler {
    @Override
    public void handleRequest() {
        if(getSuccessor() != null){
            TPrinter.p("The request is passed to " + getSuccessor());
            getSuccessor().handleRequest();
        }else {
            TPrinter.p("The request is handled here");
        }
    }
}
