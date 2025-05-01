public record Song(
    String id,
    String title,
    String artist,
    String album,
    String genre,
    Integer year,
    Integer duration) 
{
    public static class Builder {
        private String id;
        private String title;
        private String artist;
        private String album;
        private String genre;
        private Integer year;
        private Integer duration;

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder withArtist(String artist) {
            this.artist = artist;
            return this;
        }

        public Builder withAlbum(String album) {
            this.album = album;
            return this;
        }

        public Builder withGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder withYear(Integer year) {
            this.year = year;
            return this;
        }

        public Builder withDuration(Integer duration) {
            this.duration = duration;
            return this;
        }

        public Song build() {
            return new Song(
                this.id, 
                this.title,
                this.artist,
                this.album, 
                this.genre, 
                this.year, 
                this.duration);
        }
    }
    
}
