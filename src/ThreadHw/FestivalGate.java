package ThreadHw;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.*;

public class FestivalGate  {
    private List<TicketType> validatedTickets = synchronizedList(new ArrayList<>());
    public List<TicketType> getValidatedTickets() {
        return validatedTickets;
    }

    @Override
    public String toString() {
        return "FestivalGate - " +
                "Types of tickets: " + validatedTickets ;
    }
}
