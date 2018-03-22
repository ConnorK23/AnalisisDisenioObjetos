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
public class BackupOperation extends TicketOperation {
    @Override
	public void visit(Header head) {
	}

	@Override
	public void visit(SaleLine line) {
	}

	@Override
	public void visit(RepetitionLine line) {
	}

	@Override
	public void visit(CancellationLine line) {
	}

	@Override
	public void visit(ReturnLine line) {
	}

	@Override
	public void visit(Footer footer) {
	}
}
