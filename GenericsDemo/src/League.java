import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    ArrayList<T> league = new ArrayList<>();
    String name;
    public League(String name){
        this.name = name;
    }

    public boolean addTeam(T team){
        if(league.contains(team))
            return false;
        else{
            league.add(team);
            return true;
        }
    }

    public void showLeagueTable(){
        Collections.sort(league);
        for(T t: league){
            System.out.println(t.getName()+": "+t.points());
        }
    }
}
