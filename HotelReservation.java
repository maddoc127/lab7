class HotelReservation extends Reservation {
    private String roomType;
    private boolean breakfastIncluded;

    public HotelReservation(String name, int dayCount, String roomType, boolean breakfastIncluded) {
        super(name, dayCount);
        this.roomType = roomType;
        this.breakfastIncluded = breakfastIncluded;
    }

    public String toString() {
        return super.toString() + "Room Type: " + roomType + "Breakfast Included: " + breakfastIncluded;
    }

    public boolean equals(HotelReservation other) {
        return super.equals(other) && 
               this.roomType.equals(other.roomType) && 
               this.breakfastIncluded == other.breakfastIncluded;
    }

    public HotelReservation extend(Reservation other) {
        String newName = getName() + " & " + other.getName();
        int newDayCount = getDayCount() + other.getDayCount();
        return new HotelReservation(newName, newDayCount, this.roomType, this.breakfastIncluded);
    }
}
