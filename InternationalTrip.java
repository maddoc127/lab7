class InternationalTrip extends Trip {
    private boolean passportRequired;
    private String currency;

    public InternationalTrip(String destination, int days, boolean passportRequired, String currency) {
        super(destination, days);
        this.passportRequired = passportRequired;
        this.currency = currency;
    }

    public String toString() {
        return super.toString() + "Passport Required: " + passportRequired + "Currency: " + currency;
    }

    public boolean equals(InternationalTrip other) {
        return super.equals(other) && 
               this.passportRequired == other.passportRequired && 
               this.currency.equals(other.currency);
    }

    public InternationalTrip extend(Trip other) {
        String newDestination = getDestination() + " & " + other.getDestination();
        int newDays = getDays() + other.getDays();
        return new InternationalTrip(newDestination, newDays, this.passportRequired, this.currency);
    }
}

