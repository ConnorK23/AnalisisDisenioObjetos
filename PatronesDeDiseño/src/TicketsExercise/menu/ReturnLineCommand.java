/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketsExercise.menu;

import TicketsExercise.ticket.ReturnLine;
import TicketsExercise.utils.LimitedIntDialog;

/**
 *
 * @author dapda
 */
public class ReturnLineCommand extends Command{
    public ReturnLineCommand() {
		super("Linea de devolución");
	}

	@Override
	public void execute() {
		int id = LimitedIntDialog.instance().read("Código", 1000);
		int units = LimitedIntDialog.instance().read("Unidades", 1000);
		ticket.add(new ReturnLine(id, units));
	}
}
