/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketsExercise.countryConfiguration;

import TicketsExercise.operations.TicketOperation;
import TicketsExercise.ticket.Ticket;

/**
 *
 * @author dapda
 */
public abstract class TicketBuilder {
    private static TicketBuilder ticketBuilder;

	public static TicketBuilder instance() {
		if (ticketBuilder == null) {
			// TODO ficher configuración
			String nameTicketBuilder = "desingPatterns.exercises.n2.tickets.v5.spanishConfiguration.SpanishTicketBuilder";
			try {
				ticketBuilder = (TicketBuilder) Class
						.forName(nameTicketBuilder).newInstance();
			} catch (Exception ex) {
				System.out.println("TicketBuilder desconocido");
				ex.printStackTrace();
				System.exit(0);
			}
		}
		return ticketBuilder;
	}
	
	protected TicketOperation lineTicketOperation;
	
	protected TicketOperation globalTicketOperation;

	public abstract Ticket build();
}
