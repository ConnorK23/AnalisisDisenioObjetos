package TicketsExercise.supermarket;

import TicketsExercise.countryConfiguration.CountryFactory;
import TicketsExercise.menu.Menu;
import TicketsExercise.ticket.Ticket;
import TicketsExercise.utils.Clock;

/**
 *
 * @author dapda
 */
public class SuperMarket {
    
    private final static double CLOSING_TIME = 20.0;

	private Menu menu;

	private SuperMarket() {
		menu = CountryFactory.instance().getMenu();
	}

	private void sell() {
		Clock clock = new Clock();
		do {
			Ticket ticket = CountryFactory.instance().getTicket();
			menu.execute(ticket);
			ticket.close();
		} while (!clock.isNowOrLater(CLOSING_TIME));
	}

	public static void main(String[] args) {
		new SuperMarket().sell();
	}
}

