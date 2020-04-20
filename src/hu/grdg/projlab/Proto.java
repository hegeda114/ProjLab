package hu.grdg.projlab;

import hu.grdg.projlab.util.ProtoInputSystem;
import hu.grdg.projlab.util.commands.*;

public class Proto {
    public static void main(String[] args) {
        ProtoInputSystem pis = new ProtoInputSystem();

        //Register commands here
        pis.registerCommand("ClearGame", new ClearGameCommand());
        pis.registerCommand("NewTile", new NewTileCommand());
        pis.registerCommand("SetNeighbour", new SetNeighbourCommand());
        pis.registerCommand("Inventory", new InventoryCommand());
        pis.registerCommand("Inspect", new InspectCommand());


        //Run the tester
        pis.start();
    }
}
