public class Song {
    private String title;
    private  Double duration;

    public Song() {
    }

    public Song(String title, Double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    // Song s=new Song(); // hear s is overwritten with inBuild fun
    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
