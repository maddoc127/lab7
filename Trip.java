class Trip {
    private String destination;
    private int days;

    public Trip(String destination, int days) {
        this.destination = destination;
        this.days = days;
    }

    public Trip(Trip other) {
        this.destination = other.destination;
        this.days = other.days;
    }

    public String getDestination() {
        return destination;
    }

    public int getDays() {
        return days;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String toString() {
        return "Trip to " + destination + " for " + days + " days";
    }

    public boolean equals(Trip other) {
        return this.destination.equals(other.destination) && this.days == other.days;
    }

    public Trip extend(Trip other) {
        String newDestination = this.destination + " & " + other.destination;
        int newDays = this.days + other.days;
        return new Trip(newDestination, newDays);
    }
}
