import java.util.ArrayList;

public class Team <T extends Player> implements Comparable<Team<T>>{
   private String name;
   int played = 0;
   int won = 0;
   int tied = 0;
   int lost = 0;

   private ArrayList<T> members = new ArrayList<>();
    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean addPlayer(T player){
        if(members.contains(player)){
            System.out.println(player.getName()+" is already in the team.");
            return false;
        }
        else{
            members.add(player);
            System.out.println(player.getName()+" joined "+this.name);
            return true;
        }
    }

    public int playerNo(){
        return members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        if(ourScore > theirScore){
            won++;
        }
        else if(theirScore > ourScore){
            lost++;
        }
        else{
            tied++;
        }
        played++;
        if(opponent != null){
            opponent.matchResult(null,theirScore,ourScore);
        }
    }

    public int points(){
        return 2*won+tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        if(this.points()>team.points())
            return -1;
        else if(this.points()<team.points())
            return 1;
        else
            return 0;
    }
}
