import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {

        Album album = new Album("Butta Mamma", "Arman Malik");
        Album album2 = new Album("Doorie", "Atif Aslam"); //playList

        album.addSong("Butta mamma song", 4.3);
        album.addSong("Srivali", 3.2);
        album.addSong("Srivali", 3.2);

        album2.addSong("Doorie Song", 3.1);
        album2.addSong("Kuch Iss Tarha", 4.6);
        album2.addSong("Mahi bhe", 2.0);

        if (album.findSong("abc")) {
            System.out.println("abc song is present");
        } else {
            System.out.println("abc song is not present");
        }

        if (album2.findSong("Doorie")) {
            System.out.println("Doorie song is present in album");
        } else {
            System.out.println("Doorie song is not present");
        }

        System.out.println();
        LinkedList<Song> myPlayList = new LinkedList<>(); // ob

        album2.addToPlayListFromAlbum("Doorie Song", myPlayList);
        album.addToPlayListFromAlbum(1, myPlayList);
        album2.addToPlayListFromAlbum(2, myPlayList);

        album.addToPlayListFromAlbum("random", myPlayList);
        album2.addToPlayListFromAlbum(5, myPlayList);

        play(myPlayList);
    }

    public static void play(LinkedList<Song> myPlayList) {

        ListIterator<Song> itr = myPlayList.listIterator();

        if (!itr.hasNext()) {
            System.out.println("Your playlist is empty");
            return;
        }

        System.out.println("Now play Music");
        System.out.println(itr.next());
        boolean wasNext=true;
        printMenu();

        Scanner sc=new Scanner(System.in);

        while (true){
            System.out.println("Please enter your option ko");
            int option=sc.nextInt();
            switch (option){
                case 1:
                    if(!wasNext){
                        itr.next();
                        wasNext=true;
                    }
                    if(itr.hasNext()){
                        System.out.println("Now play Music");
                        System.out.println(itr.next());
                        wasNext=true;
                    }else {
                        System.out.println("You have reached end of the playList");
                    }
                    break;
                case 2:
                    if(wasNext==true){
                        itr.previous();
                        wasNext=false;
                    }
                    if(itr.hasPrevious()){
                        System.out.println("Now play Music");
                        System.out.println(itr.previous());
                        wasNext=false;
                    }else{
                        System.out.println("You reached at starting point of list");
                    }
                    break;
                case 3: //for play curr song
                    if(wasNext=true){
                        if(itr.hasPrevious()){
                            System.out.println("Now play Music");
                            System.out.println(itr.previous());
                            wasNext=false;
                        }
                    }else{
                        if(itr.hasNext()==true){
                            System.out.println("Now play Music");
                            System.out.println(itr.next());
                            wasNext=true;
                        }
                    }


                    break;
                case 4:
                    printSong(myPlayList);
                    break;
                case 5:   // delete the current song itr. remove
                    break;
                case 6:
                    printMenu();
                    break;
                case 7:
                    exit(0);
            }
        }
    }

    public static void printSong(LinkedList<Song>myPlayList){
        for(Song s:myPlayList){
            System.out.println(s);
        }
        return;
    }
    public static void printMenu() {
        System.out.println("1. Play next song");
        System.out.println("2. Play previous song");
        System.out.println("3. Repeat the current song");
        System.out.println("4. Show all songs in playlist");
        System.out.println("5. delete the current song");
        System.out.println("6. Show the menu again");
        System.out.println("7. Exit");

    }

}