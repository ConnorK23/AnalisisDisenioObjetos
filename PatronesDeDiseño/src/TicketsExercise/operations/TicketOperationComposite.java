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
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dapda
 */
public class TicketOperationComposite extends TicketOperation {
    private List<TicketOperation> ticketOperationList;
	
	public TicketOperationComposite() {
		ticketOperationList = new ArrayList<TicketOperation>();
	}
	
	public void add(TicketOperation ticketOperation) {
		ticketOperationList.add(ticketOperation);
	}
	
	@Override
	public void set(Ticket ticket) {
		super.set(ticket);
		for(TicketOperation ticketOperation: ticketOperationList) {
			ticketOperation.set(ticket);
		}
	}
	
	@Override
	public void visit(Header head) {
		for(TicketOperation ticketOperation : ticketOperationList){
			ticketOperation.visit(head);
		}
	}

	@Override
	public void visit(SaleLine saleLine) {
		for(TicketOperation ticketOperation : ticketOperationList){
			ticketOperation.visit(saleLine);
		}
	}

	@Override
	public void visit(RepetitionLine repetitionLine) {
		for(TicketOperation ticketOperation : ticketOperationList){
			ticketOperation.visit(repetitionLine);
		}
	}

	@Override
	public void visit(CancellationLine cancellationLine) {
		for(TicketOperation ticketOperation : ticketOperationList){
			ticketOperation.visit(cancellationLine);
		}
	}

	@Override
	public void visit(ReturnLine returnLine) {
		for(TicketOperation ticketOperation : ticketOperationList){
			ticketOperation.visit(returnLine);
		}
	}

	@Override
	public void visit(Footer footer) {
		for(TicketOperation ticketOperation : ticketOperationList){
			ticketOperation.visit(footer);
		}
	}
}
