import java.time.LocalDateTime;
import java.util.ArrayList;

public class MeetingRoom {

    static int rooms = 0;
    static ArrayList<String> bookingDates = new ArrayList<>();
    int roomId = 0;
    boolean isActive = false;
    boolean isBooked = false;
    LocalDateTime bookingDate;

    MeetingRoom() {
        rooms++;
        this.roomId = rooms;
        this.isActive = true;
    }

    void setActivity(boolean isActive) {
        this.isActive = isActive;
        System.out.println("Activity set to: " + this.isActive);
    }

    void setBooking(boolean bookFlag) {
        LocalDateTime currentDate = LocalDateTime.now();
        if (bookFlag) {
            if (!(this.isBooked && (currentDate == bookingDate))) {
                this.isBooked = true;
                this.bookingDate = currentDate;
                System.out.println("Booking successful");
            } else {
                System.out.println("Room already booked");
            }
        } else {
            this.isBooked = false;
            System.out.println("Booking cancelled");
        }

    }

    void bookingDetails() {
        System.out.println(this.roomId);
        System.out.println(this.isActive ? "Room is active" : "Room is in-active");
        System.out.println(this.isBooked ? "Room is Booked" : "Room is not-Booked");
    }

    public static void main(String[] args) {

        // creating a meeting room
        MeetingRoom r1 = new MeetingRoom();

        // set activity
        // r1.setActivity(false);

        // set booking
        // r1.setBooking(false);

        // room specific details
        r1.bookingDetails();

    }
}
