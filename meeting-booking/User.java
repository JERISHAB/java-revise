import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;

class User {
    static int users = 0;
    int userId;
    ArrayList<MeetingRoom> meetingRoomList = new ArrayList<>();
    static ArrayList<User> userList = new ArrayList<>();
    static HashMap<User, Integer> bookingCountList = new HashMap<>();

    User() {
        this.userId = users++;
        userList.add(this);
    }

    public static void displayAllBookings() {
        for (User user : userList) {
            bookingCountList.put(user, user.meetingRoomList.size());
        }
        System.out.println(bookingCountList);
    }

    public void createMeetingRoom() {
        MeetingRoom meetingRoom = new MeetingRoom();
        System.out.println("ROOM CREATED SUCCESSFULLY");
        System.out.println();
        meetingRoomList.add(meetingRoom);
    }

    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User();

        System.out.println();

        // CREATION OF MEETING ROOM
        u1.createMeetingRoom();
        u2.createMeetingRoom();
        u2.createMeetingRoom();

        // ACTIVATION AND DEACTIVATION
        u1.meetingRoomList.get(0).setActivity(true);

        // BOOKING OF ROOMS
        String input = "07 09 2025";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MM yyyy");
        LocalDate date = LocalDate.parse(input, formatter);
        u1.meetingRoomList.get(0).setBooking(true, date);
        
        // DISPLAY BOOKINGS
        u1.meetingRoomList.get(0).displayMeetings();

        // DISPLAY VACANT DAYS
        YearMonth yearMonth = YearMonth.of(2025, 9);
        u1.meetingRoomList.get(0).displayVacantDates(yearMonth);

        // ENTIRE EMPLOYEE BOOKING
        displayAllBookings();
    }
}
