/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketsExercise.operations;

import TicketsExercise.ticket.CancellationLine;
import TicketsExercise.ticket.Footer;
import TicketsExercise.ticket.Header;
import TicketsExercise.ticket.RepetitionLine;
import TicketsExercise.ticket.ReturnLine;
import TicketsExercise.ticket.SaleLine;

/**
 *
 * @author dapda
 */
public class TaxPrinterOperation extends TicketOperation{
    @Override
	public void visit(Header head) {
		System.out.println("TAX: Head: " + head.getDate());
	}

	@Override
	public void visit(SaleLine saleLine) {
		System.out
				.println("TAX: Product " + saleLine.getId() + " - "
						+ saleLine.getUnits() + "units : "
						+ saleLine.getPrice() + "eu");
	}

	@Override
	public void visit(RepetitionLine repetitionLine) {
		System.out.println("TAX: Repetition " + repetitionLine.getNumber()
				+ ": " + repetitionLine.getPrice() + "eu");
	}

	@Override
	public void visit(CancellationLine cancellationLine) {
		System.out.println("TAX: Cancelled " + cancellationLine.getNumber()
				+ ": " + cancellationLine.getPrice() + "eu");
	}

	@Override
	public void visit(ReturnLine returnLine) {
		System.out.println("TAX: Devoltion " + returnLine.getId() + " - "
				+ returnLine.getUnits() + ": " + returnLine.getPrice() + "eu");
	}

	@Override
	public void visit(Footer footer) {
		System.out.println("TAX: Foot: " + footer.getTotalPrice());
	}
}
