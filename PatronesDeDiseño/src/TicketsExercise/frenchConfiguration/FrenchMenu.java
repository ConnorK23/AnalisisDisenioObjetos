/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketsExercise.frenchConfiguration;

import TicketsExercise.menu.CancellationLineCommand;
import TicketsExercise.menu.Menu;
import TicketsExercise.menu.RepetitionLineCommand;
import TicketsExercise.menu.SaleLineCommand;

/**
 *
 * @author dapda
 */
public class FrenchMenu extends Menu {
    @Override
	protected void setCommands() {
		commandList.add(new SaleLineCommand());
		commandList.add(new RepetitionLineCommand());
		commandList.add(new CancellationLineCommand());
	}
}
