package edu.kis.powp.command;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

public class ComplexCommand  implements DriverCommand{
    private List<DriverCommand> listOfCommands;

    public ComplexCommand() {
        listOfCommands = new ArrayList<>();
    }

    @Override
    public void execute(){
        listOfCommands.forEach(DriverCommand::execute);
    }

    public void add(DriverCommand newCommand){
        listOfCommands.add(newCommand);
    }
}
