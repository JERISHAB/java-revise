
import java.time.Year;
import java.util.ArrayList;

public class TVShow {

    String title;
    String genre;
    Year releaseYear;
    int durationMinutes;
    ArrayList<Episode> episodeList = new ArrayList<>();
    static ArrayList<TVShow> tvShowList = new ArrayList<>();


    TVShow(String title, String genre, int releaseYear, int duration) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = Year.of(releaseYear);
        this.durationMinutes = duration;
        tvShowList.add(this);
    }

    public void displayTVShowDetails() {
        System.out.println("----------TVShow DETAILS-----------");
        System.out.println("TITLE : " + this.title);
        System.out.println("GENRE : " + this.genre);
        System.out.println("RELEASE YEAR : " + this.releaseYear);
        System.out.println("DURATION : " + this.durationMinutes);
    }

    public static void searchShow(String title) {
        boolean found = false;
        for (TVShow show : tvShowList) {
            if (show.title == title) {
                System.out.println("SHOW FOUND ");
                show.displayTVShowDetails();
                found = true;
                break;
            }
        }
        if(!found)
            System.out.println("SHOW NOT FOUND");
    }

    public static void main(String[] args) {
        TVShow m1 = new TVShow("Show1", "horror", 2025, 143);
        TVShow m2 = new TVShow("Show2", "romance", 2035, 140);
        searchShow("Show1");
  
    }
}