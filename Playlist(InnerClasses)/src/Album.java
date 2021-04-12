import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name,String artist){
        this.artist = artist;
        this.name = name;
        this.songs = new SongList();
    }

    public void addSong(String songName,double duration){
        songs.addSong(songName,duration);
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
     return songs.searchSong(songName);
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
        if(index>=0 && index<songs.getSize()){
            playList.add(songs.getSong(index));
            System.out.println(songs.getSong(index)+" had been added to your playlist.");
        }
        else{
            System.out.println("Song index out of range.");
        }
    }

    public void listSongs(){
        System.out.println(name+" contains-");
        for(int i=0;i<songs.getSize();i++){
            System.out.println(i+1+". "+songs.getSong(i).toString());
        }
    }

    private class SongList{
        private ArrayList<Song> songs;

        public SongList(){
            this.songs = new ArrayList<>();
        }

        public void addSong(String name,double duration){
            Song newSong = new Song(name,duration);
            Song check = searchSong(name);
            if(check==null){
                songs.add(newSong);
                return;
            }
            else{
                System.out.println("Song already exist.");
            }
        }

        public Song searchSong(String name){
            for(Song search: songs){
                if(search.getName().equals(name)){
                    return search;
                }
            }
            return null;
        }

        public Song searchSong(int indexNo){
            int index = indexNo-1;
            if(index >= 0 && index < songs.size()){
                return songs.get(index);
            }
            return null;
        }

        public int getSize(){
            return songs.size();
        }

        public Song getSong(int index){
            return songs.get(index);
        }
    }
}
