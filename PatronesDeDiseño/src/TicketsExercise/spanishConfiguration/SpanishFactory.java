/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketsExercise.spanishConfiguration;

import TicketsExercise.countryConfiguration.CountryFactory;

/**
 *
 * @author dapda
 */
public class SpanishFactory extends CountryFactory {
    public SpanishFactory() {
		this.menu = new SpanishMenu();
		this.ticketBuilder = new SpanishTicketBuilder();
	}
}
