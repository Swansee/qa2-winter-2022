package model;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class Reservation {
    private long id;
    private String name;
    private String surname;
    @JsonProperty ("afrom")
    private String departure;
    @JsonProperty ("ato")
    private String arrival;
    private int bags;
    @JsonProperty ("bugs")
    private int bagsCount;
    private String discount;
    private int children;
    private int flight;
    private int adults;
    private int seat;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getArrival() {
        return arrival;
    }

    public void setArrival(String arrival) {
        this.arrival = arrival;
    }

    public int getBags() {
        return bags;
    }

    public void setBags(int bags) {
        this.bags = bags;
    }

    public int getBagsCount() {
        return bagsCount;
    }

    public void setBagsCount(int bagsCount) {
        this.bagsCount = bagsCount;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getFlight() {
        return flight;
    }

    public void setFlight(int flight) {
        this.flight = flight;
    }

    public int getAdults() {
        return adults;
    }

    public void setAdults(int adults) {
        this.adults = adults;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }
}
