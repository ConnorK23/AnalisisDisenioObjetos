/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketsExercise.menu;

import TicketsExercise.ticket.Ticket;
import TicketsExercise.utils.IO;
import TicketsExercise.utils.LimitedIntDialog;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dapda
 */
public abstract class Menu {
    protected List<Command> commandList;

	private ExitCommand exitCommand;

	public Menu() {
		this.commandList = new ArrayList<Command>();
		this.setCommands();
		exitCommand = new ExitCommand();
		this.commandList.add(exitCommand);
	}

	protected abstract void setCommands();

	protected void set(Ticket ticket) {
		for(Command command : commandList){
			command.set(ticket);
		}
	}

	public void execute(Ticket ticket) {
		this.set(ticket);
		exitCommand.reset();
		do {
			this.write();
			int option = this.getOption();
			commandList.get(option).execute();
		} while (!exitCommand.closed());
	}

	private void write() {
		IO.instance().writeln();
		IO.instance().writeln();
		IO.instance().writeln("---------------------");
		for (int i = 0; i < commandList.size(); i++) {
			IO.instance().writeln(
					(i + 1) + ". " + commandList.get(i).getTitle());
		}
	}

	private int getOption() {
		return LimitedIntDialog.instance()
				.read("Opción", 1, commandList.size())-1;
	}

	public boolean isClosed() {
		return exitCommand.closed();
	}
}
