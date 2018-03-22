/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketsExercise.menu;

import TicketsExercise.ticket.SaleLine;
import TicketsExercise.utils.LimitedIntDialog;

/**
 *
 * @author dapda
 */
public class SaleLineCommand extends Command{
    public SaleLineCommand() {
		super("Linea de venta");
	}

	@Override
	public void execute() {
		int id = LimitedIntDialog.instance().read("Código", 1000);
		int units = LimitedIntDialog.instance().read("Unidades", 1000);
		ticket.add(new SaleLine(id, units));
	}
}
