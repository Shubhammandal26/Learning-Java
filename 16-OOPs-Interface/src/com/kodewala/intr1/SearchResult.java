package com.kodewala.intr1;

public class SearchResult 
{
	private String transportType;
    private String source;
    private String destination;
    private double price;
    private int availableSeats;

    public String getTransportType() {
        return transportType;
    }

    public void setTransportType(String transportType) {
        this.transportType = transportType;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public void displaySearchResult() {

        System.out.println("Transport: " + transportType);
        System.out.println("Source: " + source);
        System.out.println("Destination: " + destination);
        System.out.println("Price: " + price);
        System.out.println("Available Seats: " + availableSeats);
    }
}
