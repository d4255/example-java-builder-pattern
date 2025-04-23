import javax.swing.SortingFocusTraversalPolicy;

public record Song(
    String id,
    String title,
    String genre,
    Integer publishYear,
    String trackLength,
    String album,
    String writer,
    String producer) 
{
    public static class Builder {
        private String id;
        private String title;
        private String genre;
        private Integer publishYear;
        private String trackLength;
        private String album;

        public Builder withId(String id) {
            this.id = id;
        }

        public Builder withTitle(String title) {
            this.title = title;
        }

        public Builder withGenre(String genre) {
            this.genre = genre;
        }

        public Builder withPublishYear(Integer publishYear) {
            this.publishYear = publishYear;
        }

        public Builder withTrackLength(String trackLength) {
            this.trackLength = trackLength;
        }

        public Builder withAlbum(String album) {
            this.album = album;
        }

        public Song build() {
            return new Song(
                this.id, 
                this.title, 
                this.genre, 
                this.publishYear, 
                this.trackLength, 
                this.album);
        }
    }
    
}
