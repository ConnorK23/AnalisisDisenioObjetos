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
import TicketsExercise.ticket.Ticket;
import TicketsExercise.ticket.TicketVisitor;

/**
 *
 * @author dapda
 */
public abstract class TicketOperation implements TicketVisitor {
    protected Ticket ticket;
	
	public void set(Ticket ticket) {
		this.ticket = ticket;
	}
	
	@Override
	public void visit(Header head) {
	}

	@Override
	public void visit(SaleLine saleLine) {
	}

	@Override
	public void visit(RepetitionLine repetitionLine) {
	}

	@Override
	public void visit(CancellationLine cancellationLine) {
	}

	@Override
	public void visit(ReturnLine returnLine) {
	}

	@Override
	public void visit(Footer footer) {
	}
}
