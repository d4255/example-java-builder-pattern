import javax.swing.SortingFocusTraversalPolicy;

public record Song(
    String id,
    String title,
    String genre,
    Date releaseDate,
    Time trackLength,
    String album,
    String writer,
    String producer) 
{
    public static class SongBuilder {
        private String id;
        private String title;
        private String genre;
        private Date releaseDate;
        private Time trackLength;
        private String album;

        public SongBuilder withId(String id) {
            this.id = id;
        }

        public SongBuilder withTitle(String title) {
            this.title = title;
        }

        public SongBuilder withGenre(String genre) {
            this.genre = genre;
        }

        public SongBuilder withReleaseDate(Date releaseDate) {
            this.releaseDate = releaseDate;
        }

        public SongBuilder withTrackLength(Time trackLength) {
            this.trackLength = trackLength;
        }

        public SongBuilder withAlbum(String album) {
            this.album = album;
        }

        public Song build() {
            return new Song(
                this.id, 
                this.title, 
                this.genre, 
                this.releaseDate, 
                this.trackLength, 
                this.album);
        }
    }
    
}
