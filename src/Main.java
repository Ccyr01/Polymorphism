import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie theMovie = Movie.getMovie("Science", "Star Wars");
//        theMovie.watchMovie();
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Enter Type (A for Adventure, C for Comedy, "+
                    "S for Science Fiction, or Q for quit) : ");
            String type = scan.nextLine();
            System.out.println(type+" type");
            if("Qq".contains(type)){
                break;
            }
            System.out.println("Enter a Movie Title: ");
            String title = scan.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

    }
}