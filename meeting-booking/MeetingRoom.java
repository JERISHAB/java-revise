import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class MeetingRoom {

    static int rooms = 0;
    ArrayList<LocalDate> bookingDates = new ArrayList<>();
    int roomId = 0;
    private boolean isActive = false;
    private boolean isBooked = false;
    LocalDate bookingDate;

    MeetingRoom() {
        rooms++;
        this.roomId = rooms;
        this.isActive = true;
    }

    public void setActivity(boolean isActive) {
        this.isActive = isActive;
        System.out.println("ACTIVITY SET TO : " + this.isActive);
        System.out.println();

    }

    public void setBooking(boolean bookFlag, LocalDate date) {
        if (this.isActive) {
            if (bookFlag) {
                if (!(this.isBooked)) {
                    this.isBooked = true;
                    this.bookingDates.add(date);
                    System.out.println("BOOKING SUCCESSFULL");
                    System.out.println();

                } else if (!(this.bookingDates.contains(date))) {
                    this.bookingDates.add(date);
                    System.out.println("BOOKING SUCCESSFULL");
                    System.out.println();

                } else {
                    System.out.println("ROOM ALREADY BOOKED");
                    System.out.println();

                }
            } else {
                this.isBooked = false;
                System.out.println("BOOKING CANCELLED");
                System.out.println();

            }
        } else {
            System.out.println("BOOKING UNSUCCESSFUL : ROOM IS NOT ACTIVE");
            System.out.println();

        }
    }

    public void bookingDetails() {
        System.out.println(this.roomId);
        System.out.println(this.bookingDates);
        System.out.println("ACTIVITY : " + this.isActive);
        System.out.println("BOOKED : " + this.isBooked);
        System.out.println();

    }
    
    public void displayMeetings() {
        System.out.println(this.bookingDates);
        System.out.println();

    }

    public void displayVacantDates(YearMonth yearMonth){
        int daysInMonth = yearMonth.lengthOfMonth();
        ArrayList<LocalDate> daysList = new ArrayList<>();

        for (int day = 1; day <= daysInMonth; day++) {
            LocalDate date = yearMonth.atDay(day);
            daysList.add(date);
        }

        daysList.removeAll(bookingDates);

        System.out.println("DATES OF MONTH: " + daysList);
        System.out.println();

    }

    public static void main(String[] args) {

        // creating a meeting room
        MeetingRoom r1 = new MeetingRoom();

        // set activity
        // r1.setActivity(false);

        // set booking
        String input = "07 09 2025";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate date = LocalDate.parse(input, formatter);
        r1.setBooking(true, date);


        // display vacant days in month
        // YearMonth yearMonth = YearMonth.of(2025, 9);
        // r1.displayVacantDates(yearMonth);



        // room specific details
        r1.bookingDetails();

    }
}
 