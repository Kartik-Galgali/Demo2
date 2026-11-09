package pkg1;

public class Netflix {

    String movieName;
    String genre;
    int rating;

    public Netflix(String movieName, String genre, int rating) {
        this.movieName = movieName;
        this.genre = genre;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie Name= " + movieName + ", Genre= " + genre + ", Rating= " + rating;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Netflix) {
            Netflix n = (Netflix) o;

            return this.movieName.equals(n.movieName) && this.genre.equals(n.genre) && this.rating == n.rating;
        }
        return false;
    }

    public static void main(String[] args) {

        Netflix n1 = new Netflix("Stranger Things", "Sci-Fi", 9);
        Netflix n2 = new Netflix("Dark", "Thriller", 8);

        System.out.println(n1);
        System.out.println(n2);

        System.out.println(n1.equals(n2));
    }
}