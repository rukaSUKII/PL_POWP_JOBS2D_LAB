package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;


public class OperateToCommand implements DriverCommand{
    private int x;
    private int y;
    private Job2dDriver jobDriver;

    public OperateToCommand(int x, int y, Job2dDriver driverObj){
        this.x = x;
        this.y = y;
        this.jobDriver = driverObj;
    }

    @Override
    public void execute(){
        jobDriver.operateTo(this.x, this.y);
    }
}
