class Reservation {
    private String name;
    private int dayCount;

    public Reservation(String name, int dayCount) {
        this.name = name;
        this.dayCount = dayCount;
    }

    public Reservation(Reservation other) {
        this.name = other.name;
        this.dayCount = other.dayCount;
    }

    public String getName() {
        return name;
    }

    public int getDayCount() {
        return dayCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDayCount(int dayCount) {
        this.dayCount = dayCount;
    }

    public String toString() {
        return "Reservation for " + name + ": " + dayCount + " days";
    }

    public boolean equals(Reservation other) {
        return this.name.equals(other.name) && this.dayCount == other.dayCount;
    }

    public Reservation extend(Reservation other) {
        String newName = this.name + " & " + other.name;
        int newDayCount = this.dayCount + other.dayCount;
        return new Reservation(newName, newDayCount);
    }
}
