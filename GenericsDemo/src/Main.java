public class Main {
    public static void main(String[] args) {
        CricketPlayer kohli = new CricketPlayer("Virat Kohli");
        HockeyPlayer singh = new HockeyPlayer("Manpreet Singh");
        CricketPlayer dhoni = new CricketPlayer("Mahendra Singh Dhoni");
        Team<CricketPlayer> csk = new Team("Chennai Super Kings");
        csk.addPlayer(dhoni);
        csk.addPlayer(kohli);
        csk.addPlayer(dhoni);
//        csk.addPlayer(singh);
        System.out.println("Number of players = "+csk.playerNo());
    }
}
