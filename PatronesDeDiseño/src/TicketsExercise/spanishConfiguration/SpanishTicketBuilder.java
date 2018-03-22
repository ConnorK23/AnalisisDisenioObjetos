/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketsExercise.spanishConfiguration;

import TicketsExercise.countryConfiguration.TicketBuilder;
import TicketsExercise.operations.ClientPrinterOperation;
import TicketsExercise.operations.PriceCalculatorOperation;
import TicketsExercise.operations.TaxPrinterOperation;
import TicketsExercise.operations.TicketOperationComposite;
import TicketsExercise.ticket.Ticket;

/**
 *
 * @author dapda
 */
public class SpanishTicketBuilder extends TicketBuilder {
    SpanishTicketBuilder() {
		TicketOperationComposite lineTicketOperationComposite = new TicketOperationComposite();
		lineTicketOperationComposite.add(new PriceCalculatorOperation());
		lineTicketOperationComposite.add(new ClientPrinterOperation());
		lineTicketOperationComposite.add(new TaxPrinterOperation());
		lineTicketOperation = lineTicketOperationComposite;
		TicketOperationComposite globalTicketOperationComposite = new TicketOperationComposite();
		lineTicketOperationComposite.add(new PriceCalculatorOperation());
		lineTicketOperationComposite.add(new ClientPrinterOperation());
		lineTicketOperationComposite.add(new TaxPrinterOperation());
		globalTicketOperation = globalTicketOperationComposite;
	}

	@Override
	public Ticket build() {
		Ticket ticket = new Ticket(new SpanishHead(), new SpanishFooter());
		ticket.setLineTicketOperation(lineTicketOperation);
		ticket.setGlobalTicketOperation(lineTicketOperation);
		lineTicketOperation.set(ticket);
		globalTicketOperation.set(ticket);
		return ticket;
	}
}
