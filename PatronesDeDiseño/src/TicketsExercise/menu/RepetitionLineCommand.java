/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketsExercise.menu;

import TicketsExercise.ticket.RepetitionLine;
import TicketsExercise.utils.LimitedIntDialog;

/**
 *
 * @author dapda
 */
public class RepetitionLineCommand extends Command {
    public RepetitionLineCommand() {
		super("Linea de repetición");
	}

	@Override
	public void execute() {
		int max = ticket.lines();
		int line = LimitedIntDialog.instance().read("Línea? ", max);
		ticket.add(new RepetitionLine(line));
	}
}
