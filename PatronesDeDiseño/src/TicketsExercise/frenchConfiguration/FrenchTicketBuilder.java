/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketsExercise.frenchConfiguration;

import TicketsExercise.countryConfiguration.TicketBuilder;
import TicketsExercise.operations.PriceCalculatorOperation;
import TicketsExercise.operations.TaxPrinterOperation;
import TicketsExercise.operations.TicketOperationComposite;
import TicketsExercise.ticket.Ticket;

/**
 *
 * @author dapda
 */
public class FrenchTicketBuilder extends TicketBuilder {
    FrenchTicketBuilder() {
		lineTicketOperation = new PriceCalculatorOperation();
		TicketOperationComposite globalTicketOperationComposite = new TicketOperationComposite();
		globalTicketOperationComposite.add(new PriceCalculatorOperation());
		globalTicketOperationComposite.add(new TaxPrinterOperation());
		globalTicketOperation = globalTicketOperationComposite;
	}

	@Override
	public Ticket build() {
		Ticket ticket = new Ticket(new FrenchHead(), new FrenchFooter());
		ticket.setLineTicketOperation(lineTicketOperation);
		ticket.setGlobalTicketOperation(lineTicketOperation);
		lineTicketOperation.set(ticket);
		globalTicketOperation.set(ticket);
		return ticket;
	}
}
