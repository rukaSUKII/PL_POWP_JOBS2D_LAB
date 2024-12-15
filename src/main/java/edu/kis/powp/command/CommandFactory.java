package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class CommandFactory {
    public static ComplexCommand Rectangle(Job2dDriver jobDriver, int x, int y, int width, int height){
            ComplexCommand commands = new ComplexCommand();
            commands.add(new SetPositionCommand(x, y, jobDriver));
            commands.add(new OperateToCommand(x, y+height, jobDriver));
            commands.add(new OperateToCommand(x+width, y+height, jobDriver));
            commands.add(new OperateToCommand(x+width, y, jobDriver));
            commands.add(new OperateToCommand(x, y, jobDriver));
            return commands;
    }

    public static ComplexCommand TestShape(Job2dDriver jobDriver, int x, int y, int width, int height){
        ComplexCommand commands = new ComplexCommand();
        commands.add(new SetPositionCommand(x, y, jobDriver));
        commands.add(new OperateToCommand(x+width, y+(height/2), jobDriver));
        commands.add(new OperateToCommand(x-2*height, y+y, jobDriver));
        commands.add(new OperateToCommand(x+(height/width), y+(x*height), jobDriver));
        commands.add(new OperateToCommand(x, y, jobDriver));
        return commands;
    }

}
