public class Main {
    public static void main(String[] args) {

        Trip trip1 = new Trip("Paris", 5);
        Trip trip2 = new Trip("Ankara", 3);
        Trip combinedTrip = trip1.extend(trip2);
        System.out.println(combinedTrip);

        InternationalTrip intTrip1 = new InternationalTrip("New York", 7, true, "Dollar");
        InternationalTrip combinedIntTrip = intTrip1.extend(trip2);
        System.out.println(combinedIntTrip);

        Reservation res1 = new Reservation("Deniz", 2);
        Reservation res2 = new Reservation("Almira", 3);
        Reservation combinedRes = res1.extend(res2);
        System.out.println(combinedRes);

        HotelReservation hotelRes1 = new HotelReservation("Onur", 4, "Suite", true);
        HotelReservation combinedHotelRes = hotelRes1.extend(res2);
        System.out.println(combinedHotelRes);
    }
}