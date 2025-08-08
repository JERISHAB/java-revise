import java.util.ArrayList;
import java.util.HashMap;

public class User {
    String userName;
    String password;
    ArrayList<Movie> watchList = new ArrayList<>();
    ArrayList<Movie> ratedList = new ArrayList<>();
    static HashMap<String,String> userList = new HashMap<>();

    User(String userName, String password) {
        if (!userList.containsKey(userName)) {
            this.userName = userName;
            this.password = password;
            userList.put(userName, password);
            System.out.println(userList);
        } else {
            System.out.println("USER ALREADY EXIST");
        }
    }

    public static void main(String[] args) {
        User u1 = new User("Jerishab", "sample-password");
        
    }
}
