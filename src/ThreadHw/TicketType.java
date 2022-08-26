package ThreadHw;


import java.util.Random;

public enum TicketType {
    FULL_VIP,
    FULL,
    ONE_DAY,
    ONE_DAY_VIP,
    FREE_PASS;

    private static final Random PRNG = new Random();

    public static TicketType randomTicket()  {
        TicketType[] type = values();
        return type[PRNG.nextInt(type.length)];
    }
}

