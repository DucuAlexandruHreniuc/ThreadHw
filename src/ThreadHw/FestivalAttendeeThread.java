package ThreadHw;

import java.util.ArrayList;

import static ThreadHw.TicketType.FREE_PASS;

public class FestivalAttendeeThread extends Thread {
    public FestivalAttendeeThread(TicketType ticketType, FestivalGate gate) {
        this.ticketType = ticketType;
        this.gate = gate;
    }

    TicketType ticketType;
    FestivalGate gate;


    @Override
    public void run() {
        this.gate.getValidatedTickets().add(ticketType);
        System.out.println(gate.toString() +"\nNumber of people: "+ gate.getValidatedTickets().size());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
