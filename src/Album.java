import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private List<Song> song;

    public Album() {
    }

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.song = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Song> getSong() {
        return song;
    }

    public void setSong(List<Song> song) {
        this.song = song;
    }

    public boolean findSong(String title){

        for(Song s:song){
            if(s.getTitle().equals(title)){
               // System.out.println("This Song present in the album");
                return true;
            }
        }

        return  false;
    }

    public boolean addSong(String title, Double duration){

        if(!findSong(title)){
           Song s=new Song(title, duration);
           this.song.add(s);
            System.out.println("Your song added successfully !!");
            return true;
        }
        System.out.println("This song is already present !");
        return false;
    }

    public boolean addToPlayListFromAlbum(String title, LinkedList<Song>myPlayList){ //This is Doubly LinkedList
          if(findSong(title)){

              for(Song s:song){
                  if(s.getTitle().equals(title)){
                      myPlayList.add(s);
                      System.out.println("Congrats!! Your song has been added successfully");
                      return true;
                  }
              }
          }

        System.out.println("Sorry! The song is not in album");
          return false;
    }
//Method overloading -- compileTime Polymorphism
    public boolean addToPlayListFromAlbum(int index, LinkedList<Song>myPlayList){

        index=index-1;
        if(index>=0 && index<this.song.size()){
            myPlayList.add(this.song.get(index));
            System.out.println("Your song is added successfully");
            return true;
        }

        System.out.println("Invalid song number!!");
        return  false;
    }



}
