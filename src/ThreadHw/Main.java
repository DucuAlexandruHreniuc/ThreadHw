package ThreadHw;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FestivalGate electricCastle = new FestivalGate();

        for (int i = 0; i < 100; i++) {
            FestivalAttendeeThread a1 = new FestivalAttendeeThread(TicketType.randomTicket(), electricCastle);
            a1.start();

        }
    }
}
