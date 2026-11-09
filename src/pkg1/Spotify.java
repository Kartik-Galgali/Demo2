package pkg1;

public class Spotify {

    String songName;
    String artistName;
    int duration;

    public Spotify(String songName, String artistName, int duration) {
        this.songName = songName;
        this.artistName = artistName;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Song Name= " + songName + ", Artist Name= " + artistName + ", Duration= " + duration + " seconds";
    }

    @Override
    public boolean equals(Object o) {

        if (o instanceof Spotify) {

            Spotify s = (Spotify) o;

            return this.songName.equals(s.songName) && this.artistName.equals(s.artistName) && this.duration == s.duration;
        }

        return false;
    }

    public static void main(String[] args) {

        Spotify s1 = new Spotify("Perfect", "Ed Sheeran", 263);
        Spotify s2 = new Spotify("Shape of You", "Ed Sheeran", 240);

        System.out.println(s1);
        System.out.println(s2);

        System.out.println(s1.equals(s2));
    }
}