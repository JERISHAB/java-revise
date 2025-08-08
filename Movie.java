import java.time.Year;
import java.util.ArrayList;

public class Movie {

    String title;
    String genre;
    Year releaseYear;
    int durationMinutes;
    static ArrayList<Movie> movieList = new ArrayList<>();

    ArrayList<Movie> ratings = new ArrayList<>();

    Movie(String title, String genre, int releaseYear, int duration) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = Year.of(releaseYear);
        this.durationMinutes = duration;
        movieList.add(this);
    }

    public void displayMovieDetails() {
        System.out.println("----------MOVIE DETAILS-----------");
        System.out.println("TITLE : "+this.title);
        System.out.println("GENRE : "+this.genre);
        System.out.println("RELEASE YEAR : "+this.releaseYear);
        System.out.println("DURATION : "+this.durationMinutes);
    }
    
    public static void searchMovie(String title) {
        for (Movie movie : movieList) {
            if (movie.title == title) {
                System.out.println("MOVIE FOUND ");
                movie.displayMovieDetails();
                break;
            }
            else {
                System.out.println("MOVIE NOT FOUND");

            }
        }
    }

    public static void main(String[] args) {
        Movie m1 = new Movie("Movie1","horror",2025,143);
        Movie m2 = new Movie("Movie2","romance",2035,140);

        searchMovie("Movie1");
    }
}