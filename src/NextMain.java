public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("a","Jaws");
        movie.watchMovie();
        Adventure jaws = (Adventure)Movie.getMovie("A","Jaws");
        jaws.watchMovie();
        jaws.watchAdventure();
        Object comedy = Movie.getMovie("C", "Airplane");
        //CASTING
        Comedy comedyMovie = (Comedy)comedy;
        comedyMovie.watchMovie();
        //var decides var type at runtime
        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();
    }
}
