/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketsExercise.frenchConfiguration;

import TicketsExercise.countryConfiguration.CountryFactory;

/**
 *
 * @author dapda
 */
public class FrenchFactory extends CountryFactory {
    public FrenchFactory() {
		this.menu = new FrenchMenu();
		this.ticketBuilder = new FrenchTicketBuilder();
	}
}
