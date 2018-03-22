/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketsExercise.operations;

import TicketsExercise.store.Store;
import TicketsExercise.ticket.CancellationLine;
import TicketsExercise.ticket.RepetitionLine;
import TicketsExercise.ticket.ReturnLine;
import TicketsExercise.ticket.SaleLine;

/**
 *
 * @author dapda
 */
public class PriceCalculatorOperation extends TicketOperation {
    @Override
	public void visit(SaleLine saleLine) {
		int price = Store.instance().getPrice(saleLine.getId(), saleLine.getUnits());
		saleLine.setPrice(price);
	}

	@Override
	public void visit(RepetitionLine repetitionLine) {
		SaleLine line = (SaleLine) ticket.getLine(repetitionLine.getNumber());
		int price = Store.instance().getPrice(line.getId(), line.getUnits());
		repetitionLine.setPrice(price);
	}

	@Override
	public void visit(CancellationLine cancellationLine) {
		SaleLine line = (SaleLine) ticket.getLine(cancellationLine.getNumber());
		int price = Store.instance().getPrice(line.getId(), line.getUnits());
		cancellationLine.setPrice(-price);
	}

	@Override
	public void visit(ReturnLine returnLine) {
		int price = Store.instance().getPrice(returnLine.getId(), returnLine.getUnits());
		returnLine.setPrice(-price);
	}
}
