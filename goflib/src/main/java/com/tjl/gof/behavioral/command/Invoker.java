package com.tjl.gof.behavioral.command;

public class Invoker {
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void try2SendCommand(){
        if(checkActionAbility()){
            command.execute();
        }else{

        }
    }

    private boolean checkActionAbility(){
        return true;
    }
}
