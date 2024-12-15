package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.command.*;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

    private DriverManager driverManager;

    public SelectTestFigureOptionListener(DriverManager driverManager) {
        this.driverManager = driverManager;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equalsIgnoreCase("Figure Joe 1")) {
            FiguresJoe.figureScript1(driverManager.getCurrentDriver());
        } else if (e.getActionCommand().equalsIgnoreCase("Figure Joe 2")) {
            FiguresJoe.figureScript2(driverManager.getCurrentDriver());
        } else if (e.getActionCommand().equalsIgnoreCase("Rectangle")){
            DriverCommand commands = CommandFactory.Rectangle(driverManager.getCurrentDriver(), 0, 0, 50, 50);
            commands.execute();
        }else if (e.getActionCommand().equalsIgnoreCase("Test shape")){
            DriverCommand commands = CommandFactory.TestShape(driverManager.getCurrentDriver(), 0, 0, 50, 50);
            commands.execute();
        }
    }
}
