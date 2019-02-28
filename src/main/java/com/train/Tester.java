package com.train;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter number of tickets: ");
        int totalTickets = sc.nextInt();
//        System.out.println(totalTickets);

        System.out.print("How many round-trip tickets: ");
        int roundTripTickets = sc.nextInt();
//        System.out.println(roundTripTickets);

        Ticket ticket = new Ticket(totalTickets, roundTripTickets);
        System.out.println("Total tickets: " + ticket.getTotalTicket());
        System.out.println("Round-trip: " + ticket.getRoundTrip());
        System.out.println("Total: " + (int)ticket.TotalPrice());
    }
}
