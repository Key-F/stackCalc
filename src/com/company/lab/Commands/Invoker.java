package com.company.lab.Commands;

public class Invoker {
    private Command defineCommand;
    private Command popCommand;
    private Command printCommand;
    private Command pushCommand;
    private Command summCommand;
    private Command minusCommand;
    private Command multiCommand;
    private Command divCommand;
    private Command sqrtCommand;

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

    public void push() { pushCommand.execute(); }

    public void summ() { summCommand.execute(); }

    public void minus() { minusCommand.execute(); }

    public void multi() { multiCommand.execute(); }

    public void div() { divCommand.execute(); }

    public void sqrt() { sqrtCommand.execute(); }
}
