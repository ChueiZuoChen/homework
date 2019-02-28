package com.train;

public class Ticket {
    private int totalTicket;
    private int roundTrip;
    private final float DISCOUNT = 0.9f;
    private final int TICKET_PRICE = 1000;
    private final int ROUND_TRIP_PRICE = 2000;

    public Ticket(int ticket, int roundTrip) {
        this.totalTicket = ticket;
        this.roundTrip = roundTrip;
    }

    public float TotalPrice() {
        return ((getTotalTicket() - getRoundTrip()) * TICKET_PRICE) +
                (getRoundTrip() * ROUND_TRIP_PRICE * DISCOUNT);
    }

    public int getTotalTicket() {
        return totalTicket;
    }

    public void setTotalTicket(int totalTicket) {
        this.totalTicket = totalTicket;
    }

    public int getRoundTrip() {
        return roundTrip;
    }

    public void setRoundTrip(int roundTrip) {
        this.roundTrip = roundTrip;
    }


}
