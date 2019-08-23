package com.tjl.gof.behavioral.interpreter;

public class Constant extends Expression{
    private boolean value;
    public Constant(boolean value) {
        this.value = value;
    }

    @Override
    public boolean interpret() {
        return false;
    }
}
