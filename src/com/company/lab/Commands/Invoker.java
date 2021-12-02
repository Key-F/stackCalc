package com.company.lab.Commands;

public class Invoker {
    private Command defineCommand;
    private Command popCommand;
    private Command printCommand;
    private Command pushCommand;

    public Invoker(Command defineCommand, Command popCommand, Command printCommand, Command pushCommand) {
        this.defineCommand = defineCommand;
        this.popCommand = popCommand;
        this.printCommand = printCommand;
        this.pushCommand = pushCommand;
    }

    public void define(){
        defineCommand.execute();
    }

    public void pop(){
        popCommand.execute();
    }

    public void print(){
        printCommand.execute();
    }

    public void push(){
        pushCommand.execute();
    }
}
