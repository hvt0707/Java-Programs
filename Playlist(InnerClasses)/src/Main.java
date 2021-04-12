import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<>();
    public static void main(String[] args) {
        Album album = new Album("Smoke+Mirrors","Imagine Dragons");
        album.addSong("Smoke And Mirrors",3.21);
        album.addSong("Shots",3.14);
        album.addSong("Gold",4.12);
        album.addSong("Polaroid",3.50);
        album.addSong("Friction",3.22);
        album.addSong("I'm So Sorry",3.50);
        album.addSong("Hopeless Opus",3.59);
        albums.add(album);

        album = new Album("Nightmare","Avenged Sevenfold");
        album.addSong("Nightmare",6.14);
        album.addSong("So Far Away",5.27);
        album.addSong("Welcome to the Family",4.06);
        album.addSong("Victim",7.30);
        album.addSong("Save Me",10.56);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<>();
        albums.get(0).addToPlaylist("Smoke And Mirrors",playList);
        albums.get(0).addToPlaylist("Shots",playList);
        albums.get(0).addToPlaylist(3,playList);
        albums.get(0).addToPlaylist(5,playList);
        albums.get(0).addToPlaylist("Rise Up",playList);
        albums.get(1).addToPlaylist("Nightmare",playList);
        albums.get(1).addToPlaylist("Victim",playList);
        albums.get(1).addToPlaylist("Save Me",playList);
        albums.get(1).addToPlaylist(34,playList);
        play(playList);
    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false, forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size()==0){
            System.out.println("No songs in your playlist");
            return;
        }
        else{
            System.out.println("Playing -"+listIterator.next());
            menu();
        }
        while(!quit){
            System.out.println("Enter action - ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Quiting...");
                    quit = true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext())
                            listIterator.next();
                        forward = true;
                    }

                    if(listIterator.hasNext())
                        System.out.println("Playing "+listIterator.next().toString());
                    else{
                        System.out.println("At the end of playlist.");
                        forward = false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward = false;
                    }

                    if(listIterator.hasPrevious()){
                        System.out.println("Playing "+listIterator.previous().toString());
                    }
                    else{
                        System.out.println("At the start of playlist.");
                        forward = true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now replaying "+listIterator.previous().toString());
                            forward = false;
                        }
                        else
                            System.out.println("At the start of the list.");
                    }
                    else{
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying "+listIterator.next().toString());
                            forward = true;
                        }
                        else
                            System.out.println("At the end of the list.");
                    }
                    break;
                case 4:
                    printPlaylist(playList);
                    break;
                case 5:
                    menu();
                    break;
                case 6:
                    if(playList.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext())
                            System.out.println("Now playing "+ listIterator.next().toString());
                        else if(listIterator.hasPrevious())
                            System.out.println("Now playing "+ listIterator.previous().toString());
                    }
                    break;
                default:
                    System.out.println("Wrong Input");
            }
        }
    }

    private static void menu(){
        System.out.println("Actions available-");
        System.out.println("0. to quit.\n" +
                "1. to play next\n" +
                "2. to play previous\n" +
                "3. to replay\n" +
                "4. to show all songs in your playlist.\n" +
                "5. print available actions.\n" +
                "6. delete current song.");
    }

    private static void printPlaylist(LinkedList<Song> playlist){
        if(playlist.size()==0){
            System.out.println("No songs in your playlist.");
        }
        else{
            for(int i=0;i<playlist.size();i++){
                System.out.println(playlist.get(i).toString());
            }
        }
    }









}
