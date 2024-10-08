public class Reservation {
    int guestCount;
    int restaurantCapacity;
    boolean isRestaurantOpen;
    boolean isConfirmed;

    public Reservation(int count, int capacity, boolean open) {
        if (count <= 0 || count > 6) {
            System.out.println("Unable to proceed with reservation");
            guestCount = 0; 
            restaurantCapacity = capacity;
            isRestaurantOpen = open;
            isConfirmed = false;
        } else {
            guestCount = count;
            restaurantCapacity = capacity;
            isRestaurantOpen = open;
            isConfirmed = false;
        }
    }

    public void confirmReservation() {
        if (restaurantCapacity >= guestCount && isRestaurantOpen) {
            System.out.println("Reservation confirmed!");
            isConfirmed = true;
        } else {
            System.out.println("Sorry, the restaurant is either full or closed.");
            isConfirmed = false;
        }
        public void informUser() {
            if (!isConfirmed) {
                System.out.println("Unable to proceed with reservation.");
            } else {
                System.out.println("Your reservation is confirmed!");
            }
        }
    }
        public static void main(String[] args) {
            ReservationPartyOfSix = new Reservation(6, 50, true);
            ReservationPartyofTwo = new Reservation(2, 45, true);
            partyOfSix.confirmReservation();
            partyOfSix.informUser();
            partyOfTwo.confirmReservation();
            partyOfTwo.informUser();
    }
}
