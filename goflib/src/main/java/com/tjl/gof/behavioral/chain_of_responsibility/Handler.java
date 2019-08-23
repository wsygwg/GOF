package com.tjl.gof.behavioral.chain_of_responsibility;

public abstract class Handler {
    private Handler successor;
    public abstract void handleRequest();

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
}
