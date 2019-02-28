package com.train

fun main(args: Array<String>) {
    print("Please enter number of tickets: ")
    val total = readLine()!!.toInt()

    print("How many round-trip tickets: ")
    val round = readLine()!!.toInt()

    val tickets = Tickets(total,round)
    println("Total tickets: ${tickets.totalTicket}\nRound-trip: ${tickets.roundTrip}\nTotal: ${tickets.totalPrice()}")
}

class Tickets(val totalTicket: Int, val roundTrip: Int) {
    val discount = 0.9f
    val ticketPrice = 1000
    val roundTripPrice = 2000
    fun totalPrice(): Int {
        return ((totalTicket - roundTrip) * ticketPrice + roundTrip * roundTripPrice * discount).toInt()
    }
}