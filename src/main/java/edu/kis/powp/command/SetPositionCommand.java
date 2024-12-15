package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class SetPositionCommand implements DriverCommand{
    private int x;
    private int y;
    private Job2dDriver jobDriver;

    public SetPositionCommand(int x, int y, Job2dDriver driverObj){
        this.x = x;
        this.y = y;
        this.jobDriver = driverObj;
    }

    @Override
    public void execute(){
        jobDriver.setPosition(this.x, this.y);
    }
}
