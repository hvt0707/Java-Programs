import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> album;

    public Album(String name,String artist){
        this.artist = artist;
        this.name = name;
        album = new ArrayList<>();
    }

    public void addSong(String songName,double duration){
        Song newSong = new Song(songName,duration);
        if(searchSong(songName)!=null) {
            System.out.println(songName+" has been added to "+name+" album");
        }
        else{
            album.add(newSong);
            System.out.println(songName+" already exists in "+name+" album");
        }
    }

//    public Song searchSong(String songName){
//        for(int i=0;i<album.size();i++){
//            if(album.get(i).getName().equals(songName)){
//                return album.get(i);
//            }
//        }
//        System.out.println(songName+" not found :(");
//        return null;
//    }

    public Song searchSong(String songName){
        for(Song search: this.album){
            if(search.getName().equals(songName)){
                return search;
            }
        }
        System.out.println(songName+" not found.");
        return null;
    }

    public void addToPlaylist(String name, LinkedList<Song> playList){
        Song search = searchSong(name);
        if(search!=null){
            playList.add(search);
            System.out.println(name+" has been successfully added to your playlist.");
        }
        else{
            System.out.println("Song is not available.");
        }
    }

    public void addToPlaylist(int indexNo,LinkedList<Song> playList){
        int index = indexNo-1;
        if(index>=0 && index<album.size()){
            playList.add(album.get(index));
            System.out.println(album.get(index)+" had been added to your playlist.");
        }
        else{
            System.out.println("Song index out of range.");
        }
    }

    public void listSongs(){
        System.out.println(name+" contains-");
        for(int i=0;i<album.size();i++){
            System.out.println(i+1+". "+album.get(i).toString());
        }
    }
}
